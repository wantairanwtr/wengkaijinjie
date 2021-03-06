package hulihetuzi.fox_and_rabbit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import hulihetuzi.animal.*;
import hulihetuzi.cell.Cell;
import hulihetuzi.field.*;

public class FoxAndRabbit {
    private Field theField;
    private View theView;
    private JFrame frame;

    private class stepListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("按下了");
            step();
            frame.repaint();
        }
    }

    public FoxAndRabbit(int size) {
        theField = new Field(size, size);
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                double probability = Math.random();
                if (probability < 0.05) {
                    theField.place(row, col, new Fox());
                } else if (probability < 0.15) {
                    theField.place(row, col, new Rabbit());
                }
            }
        }
        theView = new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(theView);
        JButton btnstep=new JButton("单步");
        frame.add(btnstep, BorderLayout.NORTH);
        btnstep.addActionListener(new stepListener());
        frame.pack();
        frame.setVisible(true);
    }

    public void start(int steps) {
        for (int i = 0; i < steps; i++) {
            step();
            theView.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void step() {
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = (Cell) theField.get(row, col);
                if (cell != null) {
                    Animal animal = (Animal) cell;
                    animal.grow();
                    if (animal.isAlive()) {
                        // *move
                        Location loc = animal.move(theField.getFreeNeighbor(row, col));
                        if (loc != null)
                            theField.move(row, col, loc);
                        // *eat
                        Cell[] neighbor = (Cell[]) theField.getNeighbor(row, col);
                        ArrayList<Animal> listRabbit = new ArrayList<Animal>();
                        for (Cell an : neighbor) {
                            if (an instanceof Rabbit) {
                                listRabbit.add((Rabbit) an);
                            }
                        }
                        if (!listRabbit.isEmpty()) {
                            Animal fed = animal.feed(listRabbit);
                            if (fed != null)
                                theField.remove((Cell) fed);
                        }
                        // *breed
                        Animal baby = animal.breed();
                        if (baby != null) {
                            theField.placeRandomAdj(row, col, (Cell) baby);
                        }
                    } else {
                        theField.remove(row, col);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FoxAndRabbit fnr = new FoxAndRabbit(50);
//        fnr.start(100);
    }
}
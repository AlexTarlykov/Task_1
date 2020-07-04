package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FrameForTask extends JFrame {
    JTextField[] textFields = new JTextField[9];
    JLabel[] labels1 = new JLabel[3];
    JLabel[] labels2 = new JLabel[3];
    JButton[] buttons = new JButton[8];

    FrameForTask() {
        setTitle("Task_1");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel = new JPanel();
        add(panel);
        int n = 0;
        for (int i = 0; i < 3; i++) {
            JLabel label = new JLabel(String.valueOf(i + 1));
            panel.add(label);
            label.setSize(15, 15);
            label.setLocation(155 + i * 25, 10);
            labels1[i] = label;
            for (int j = 0; j < 3; j++) {
                JTextField textField = new JTextField();
                panel.add(textField);
                textField.setSize(20, 20);
                textField.setLocation(150 + i * 25, 30 + j * 20);
                textFields[n++] = textField;
                textField.setVisible(false);
            }
            label.setVisible(false);
        }
        JLabel label1 = new JLabel("x");
        panel.add(label1);
        label1.setSize(15, 15);
        label1.setLocation(135, 30);
        JLabel label2 = new JLabel("y");
        panel.add(label2);
        label2.setSize(15, 15);
        label2.setLocation(135, 50);
        JLabel label3 = new JLabel("z");
        panel.add(label3);
        label3.setSize(15, 15);
        label3.setLocation(135, 70);
        labels2[0] = label1;
        labels2[1] = label2;
        labels2[2] = label3;
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        panel.add(buttonForSumOfVector(panel));
        panel.add(buttonForVectorDifference(panel));
        panel.add(buttonForScalarProductOfVectors(panel));
        panel.add(buttonForLengthOfVector(panel));
        panel.add(buttonForCosBetweenVectors(panel));
        panel.add(buttonForMixedProductVectors(panel));
        panel.add(buttonForVectorProductOfVectors(panel));
        panel.add(buttonForCoplanarityOfVectors(panel));
        panel.setLayout(null);
        setVisible(true);
    }

    JButton buttonForSumOfVector(JPanel panel) {
        JButton button = new JButton("Sum");
        buttons[0] = button;
        button.setSize(100, 50);
        button.setLocation(10, 10);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 6; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );

                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            Vector3D vectorSum = Vector3D.sumOfVector(vector1, vector2);
                            JOptionPane.showMessageDialog(null,
                                    "vector1 + vector2 = "
                                            + "(" + vectorSum.getX()
                                            + ", " + vectorSum.getY()
                                            + ", " + vectorSum.getZ()
                                            + ")"
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 6; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForVectorDifference(JPanel panel) {
        JButton button = new JButton("Difference");
        buttons[1] = button;
        button.setSize(100, 50);
        button.setLocation(10, 70);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 6; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );

                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            Vector3D vectorDifference = Vector3D.vectorDifference(vector1, vector2);
                            JOptionPane.showMessageDialog(null,
                                    "vector1 - vector2 = "
                                            + "(" + vectorDifference.getX()
                                            + ", " + vectorDifference.getY()
                                            + ", " + vectorDifference.getZ()
                                            + ")"
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 6; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForScalarProductOfVectors(JPanel panel) {
        JButton button = new JButton("Scalar Prd");
        buttons[2] = button;
        button.setSize(100, 50);
        button.setLocation(10, 130);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 6; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );

                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            int scalarProductOfVectors = Vector3D.scalarProductOfVectors(vector1, vector2);
                            JOptionPane.showMessageDialog(null,
                                    "vector1 * vector2 = " + scalarProductOfVectors
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 6; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForLengthOfVector(JPanel panel) {
        JButton button = new JButton("Length");
        buttons[3] = button;
        button.setSize(100, 50);
        button.setLocation(10, 190);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 3; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );
                            double lengthOfVector = vector1.lengthOfVector();
                            JOptionPane.showMessageDialog(null,
                                    "vector1 length: " + lengthOfVector
                            );
                            labels1[0].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 3; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForCosBetweenVectors(JPanel panel) {
        JButton button = new JButton("Cos");
        buttons[4] = button;
        button.setSize(100, 50);
        button.setLocation(10, 250);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 6; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );

                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            double cosBetweenVectors = Vector3D.cosBetweenVectors(vector1, vector2);
                            JOptionPane.showMessageDialog(null,
                                    "Cos between vector1 and vector2 = " + cosBetweenVectors
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 6; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForMixedProductVectors(JPanel panel) {
        JButton button = new JButton("Mixed Prd");
        buttons[5] = button;
        button.setSize(100, 50);
        button.setLocation(10, 310);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                labels1[2].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 9; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );
                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            Vector3D vector3 = new Vector3D(
                                    Integer.parseInt(textFields[6].getText()),
                                    Integer.parseInt(textFields[7].getText()),
                                    Integer.parseInt(textFields[8].getText())
                            );
                            double mixed = Vector3D.mixedProductVectors(vector1, vector2, vector3);
                            JOptionPane.showMessageDialog(null,
                                    "Mixed: " + mixed
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            labels1[2].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 9; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForVectorProductOfVectors(JPanel panel) {
        JButton button = new JButton("Vector Prd");
        buttons[6] = button;
        button.setSize(100, 50);
        button.setLocation(10, 370);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 6; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );

                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            Vector3D vector = Vector3D.vectorProductOfVectors(vector1, vector2);
                            JOptionPane.showMessageDialog(null,
                                    "vector1 X vector2 = "
                                    + "(" + vector.getX()
                                    + ", " + vector.getY()
                                    + ", " + vector.getZ()
                                    + ")"
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 6; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    JButton buttonForCoplanarityOfVectors(JPanel panel) {
        JButton button = new JButton("Coplanarity");
        buttons[7] = button;
        button.setSize(100, 50);
        button.setLocation(10, 430);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels1[0].setVisible(true);
                labels1[1].setVisible(true);
                labels1[2].setVisible(true);
                for (JLabel jLabel : labels2) {
                    jLabel.setVisible(true);
                }
                for (int i = 0; i < 9; i++) {
                    textFields[i].setVisible(true);
                }
                for (JButton jButton : buttons) {
                    jButton.setEnabled(false);
                }
                JButton ok = new JButton("Ok");
                panel.add(ok);
                ok.setSize(50, 50);
                ok.setLocation(155, 100);
                ok.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Vector3D vector1 = new Vector3D(
                                    Integer.parseInt(textFields[0].getText()),
                                    Integer.parseInt(textFields[1].getText()),
                                    Integer.parseInt(textFields[2].getText())
                            );
                            Vector3D vector2 = new Vector3D(
                                    Integer.parseInt(textFields[3].getText()),
                                    Integer.parseInt(textFields[4].getText()),
                                    Integer.parseInt(textFields[5].getText())
                            );
                            Vector3D vector3 = new Vector3D(
                                    Integer.parseInt(textFields[6].getText()),
                                    Integer.parseInt(textFields[7].getText()),
                                    Integer.parseInt(textFields[8].getText())
                            );
                            boolean coplanarity = Vector3D.coplanarityOfVectors(vector1, vector2, vector3);
                            JOptionPane.showMessageDialog(null,
                                    "Coplanarity is " + coplanarity
                            );
                            labels1[0].setVisible(false);
                            labels1[1].setVisible(false);
                            labels1[2].setVisible(false);
                            for (JLabel jLabel : labels2) {
                                jLabel.setVisible(false);
                            }
                            for (int i = 0; i < 9; i++) {
                                textFields[i].setVisible(false);
                            }
                            for (JButton jButton : buttons) {
                                jButton.setEnabled(true);
                            }
                            ok.setVisible(false);
                            panel.remove(ok);
                        } catch (Exception ignored) {
                        }
                    }
                });
            }
        });
        return button;
    }

    public static void main(String[] args) {
        new FrameForTask();
    }
}

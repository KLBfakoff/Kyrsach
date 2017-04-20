/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.awt.Component;
import java.awt.Rectangle;
import static javaapplication20.StartForm.endgame;
import static javaapplication20.StartForm.firstlvl;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author bossp
 */
public class Firstlvlform extends javax.swing.JFrame {

    public static int counter = 0;
    public static int counter1 = 0;
    public static int counter2 = 0;
    public static long start = 0;
    public static long end = 0;
    public static double result = 0;
    public JLabel[] labelmass = new JLabel[60];
    public JLabel[] betwmass = new JLabel[2];

    public Firstlvlform() {
        initComponents();
        start = System.nanoTime();
        jPanel2.setLayout(null);
        
    }

    public ImageIcon entered(JLabel newlabel) {
        ImageIcon imicon = new ImageIcon();
        switch (newlabel.getName()) {
            case "Dot1":
                imicon = new ImageIcon("src\\images\\Dot1.1.png");
                break;
            case "Dot2":
                imicon = new ImageIcon("src\\images\\Dot2.1.png");
                break;
            case "Dot3":
                imicon = new ImageIcon("src\\images\\Dot3.1.png");
                break;
            case "Dot4":
                imicon = new ImageIcon("src\\images\\Dot4.1.png");
                break;
            case "Dot5":
                imicon = new ImageIcon("src\\images\\Dot5.1.png");
                break;
            case "Bambuk1":
                imicon = new ImageIcon("src\\images\\Bambuk1.1.png");
                break;
            case "Bambuk2":
                imicon = new ImageIcon("src\\images\\Bambuk2.1.png");
                break;
            case "Bambuk3":
                imicon = new ImageIcon("src\\images\\Bambuk3.1.png");
                break;
            case "Bambuk4":
                imicon = new ImageIcon("src\\images\\Bambuk4.1.png");
                break;
            case "Bambuk5":
                imicon = new ImageIcon("src\\images\\Bambuk5.1.png");
                break;
            case "Symbol1":
                imicon = new ImageIcon("src\\images\\Symbol1.1.png");
                break;
            case "Symbol2":
                imicon = new ImageIcon("src\\images\\Symbol2.1.png");
                break;
            case "Symbol3":
                imicon = new ImageIcon("src\\images\\Symbol3.1.png");
                break;
            case "Symbol4":
                imicon = new ImageIcon("src\\images\\Symbol4.1.png");
                break;
            case "Symbol5":
                imicon = new ImageIcon("src\\images\\Symbol5.1.png");
                break;
        }
        return imicon;
    }

    public ImageIcon disentered(JLabel newlabel) {
        ImageIcon imicon = new ImageIcon();
        switch (newlabel.getName()) {
            case "Dot1":
                imicon = new ImageIcon("src\\images\\Dot1.png");
                break;
            case "Dot2":
                imicon = new ImageIcon("src\\images\\Dot2.png");
                break;
            case "Dot3":
                imicon = new ImageIcon("src\\images\\Dot3.png");
                break;
            case "Dot4":
                imicon = new ImageIcon("src\\images\\Dot4.png");
                break;
            case "Dot5":
                imicon = new ImageIcon("src\\images\\Dot5.png");
                break;
            case "Bambuk1":
                imicon = new ImageIcon("src\\images\\Bambuk1.png");
                break;
            case "Bambuk2":
                imicon = new ImageIcon("src\\images\\Bambuk2.png");
                break;
            case "Bambuk3":
                imicon = new ImageIcon("src\\images\\Bambuk3.png");
                break;
            case "Bambuk4":
                imicon = new ImageIcon("src\\images\\Bambuk4.png");
                break;
            case "Bambuk5":
                imicon = new ImageIcon("src\\images\\Bambuk5.png");
                break;
            case "Symbol1":
                imicon = new ImageIcon("src\\images\\Symbol1.png");
                break;
            case "Symbol2":
                imicon = new ImageIcon("src\\images\\Symbol2.png");
                break;
            case "Symbol3":
                imicon = new ImageIcon("src\\images\\Symbol3.png");
                break;
            case "Symbol4":
                imicon = new ImageIcon("src\\images\\Symbol4.png");
                break;
            case "Symbol5":
                imicon = new ImageIcon("src\\images\\Symbol5.png");
                break;
        }
        return imicon;
    }

    public void sloi(JLabel newlabel) {
        if (counter2 == 0) {
            ifdelete();
        }
        if (newlabel.getIcon() != null) {
            newlabel.setIcon(entered(newlabel));
            counter1++;
            betwmass[counter1 - 1] = newlabel;
            if (counter1 == 2) {
                if (betwmass[0].getName() == betwmass[1].getName() && betwmass[0].hashCode() != betwmass[1].hashCode()) {
                    betwmass[0].setIcon(null);
                    betwmass[1].setIcon(null);
                    jPanel2.remove(betwmass[0]);
                    jPanel2.remove(betwmass[1]);
                    revalidate();
                    repaint();
                } else {
                    betwmass[0].setIcon(disentered(betwmass[0]));
                    betwmass[1].setIcon(disentered(betwmass[1]));
                }
                counter1 = 0;
            }
        }
        ifcomplete();
    }

    public void ifdelete() {
        if (jLabel128.getIcon() == null && jLabel120.getIcon() == null && jLabel136.getIcon() == null && jLabel144.getIcon() == null && jLabel152.getIcon() == null && jLabel160.getIcon() == null && jLabel161.getIcon() == null && jLabel162.getIcon() == null && jLabel163.getIcon() == null && jLabel164.getIcon() == null && jLabel165.getIcon() == null) {
            jLayeredPane1.remove(jPanel2);
            counter2 = 1;
        } else {
            counter2 = 0;
        }
    }

    public void ifcomplete() {
        int counter4 = 0;
        for (Component c : jPanel1.getComponents()) {
            if (((JLabel) c).getIcon() == null) {
                counter4++;
            }
        }
        if (counter4 == 49) {
            Rectangle rect1 = firstlvl.getBounds();

            firstlvl.dispose();
            end = System.nanoTime();
            result = end - start;
            endgame = new Endgameform();
            endgame.setBounds(rect1.x, rect1.y, 308, 265);
            endgame.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Маджонг");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk3.png"))); // NOI18N
        jLabel1.setName("Bambuk3"); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel4.setName("Dot1"); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot2.png"))); // NOI18N
        jLabel5.setName("Dot2"); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk2.png"))); // NOI18N
        jLabel6.setName("Bambuk2"); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol4.png"))); // NOI18N
        jLabel7.setName("Symbol4"); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel8.setName("Symbol5"); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot2.png"))); // NOI18N
        jLabel9.setName("Dot2"); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel113.setName("Dot1"); // NOI18N
        jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel113MouseClicked(evt);
            }
        });

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol1.png"))); // NOI18N
        jLabel114.setName("Symbol1"); // NOI18N
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk2.png"))); // NOI18N
        jLabel115.setName("Bambuk2"); // NOI18N
        jLabel115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel115MouseClicked(evt);
            }
        });

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk3.png"))); // NOI18N
        jLabel116.setName("Bambuk3"); // NOI18N
        jLabel116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel116MouseClicked(evt);
            }
        });

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk5.png"))); // NOI18N
        jLabel117.setName("Bambuk5"); // NOI18N
        jLabel117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel117MouseClicked(evt);
            }
        });

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot3.png"))); // NOI18N
        jLabel118.setName("Dot3"); // NOI18N
        jLabel118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel118MouseClicked(evt);
            }
        });

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel119.setName("Bambuk1"); // NOI18N
        jLabel119.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel119MouseClicked(evt);
            }
        });

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot3.png"))); // NOI18N
        jLabel121.setName("Dot3"); // NOI18N
        jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel121MouseClicked(evt);
            }
        });

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk5.png"))); // NOI18N
        jLabel122.setName("Bambuk5"); // NOI18N
        jLabel122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel122MouseClicked(evt);
            }
        });

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol3.png"))); // NOI18N
        jLabel123.setName("Symbol3"); // NOI18N
        jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel123MouseClicked(evt);
            }
        });

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot4.png"))); // NOI18N
        jLabel124.setName("Dot4"); // NOI18N
        jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel124MouseClicked(evt);
            }
        });

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol3.png"))); // NOI18N
        jLabel125.setName("Symbol3"); // NOI18N
        jLabel125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel125MouseClicked(evt);
            }
        });

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel126.setName("Bambuk1"); // NOI18N
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel126MouseClicked(evt);
            }
        });

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol1.png"))); // NOI18N
        jLabel127.setName("Symbol1"); // NOI18N
        jLabel127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel127MouseClicked(evt);
            }
        });

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot2.png"))); // NOI18N
        jLabel129.setName("Dot2"); // NOI18N
        jLabel129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel129MouseClicked(evt);
            }
        });

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk3.png"))); // NOI18N
        jLabel130.setName("Bambuk3"); // NOI18N
        jLabel130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel130MouseClicked(evt);
            }
        });

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel131.setName("Symbol5"); // NOI18N
        jLabel131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel131MouseClicked(evt);
            }
        });

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk4.png"))); // NOI18N
        jLabel132.setName("Bambuk4"); // NOI18N
        jLabel132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel132MouseClicked(evt);
            }
        });

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel133.setName("Dot1"); // NOI18N
        jLabel133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel133MouseClicked(evt);
            }
        });

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot4.png"))); // NOI18N
        jLabel134.setName("Dot4"); // NOI18N
        jLabel134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel134MouseClicked(evt);
            }
        });

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel135.setName("Symbol5"); // NOI18N
        jLabel135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel135MouseClicked(evt);
            }
        });

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel137.setName("Symbol5"); // NOI18N
        jLabel137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel137MouseClicked(evt);
            }
        });

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol4.png"))); // NOI18N
        jLabel138.setName("Symbol4"); // NOI18N
        jLabel138.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel138MouseClicked(evt);
            }
        });

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk2.png"))); // NOI18N
        jLabel139.setName("Bambuk2"); // NOI18N
        jLabel139.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel139MouseClicked(evt);
            }
        });

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel140.setName("Bambuk1"); // NOI18N
        jLabel140.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel140MouseClicked(evt);
            }
        });

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol2.png"))); // NOI18N
        jLabel141.setName("Symbol2"); // NOI18N
        jLabel141.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel141MouseClicked(evt);
            }
        });

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot3.png"))); // NOI18N
        jLabel142.setName("Dot3"); // NOI18N
        jLabel142.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel142MouseClicked(evt);
            }
        });

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot5.png"))); // NOI18N
        jLabel143.setName("Dot5"); // NOI18N
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel145.setName("Bambuk1"); // NOI18N
        jLabel145.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel145MouseClicked(evt);
            }
        });

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel146.setName("Dot1"); // NOI18N
        jLabel146.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel146MouseClicked(evt);
            }
        });

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot4.png"))); // NOI18N
        jLabel147.setName("Dot4"); // NOI18N
        jLabel147.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel147MouseClicked(evt);
            }
        });

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk3.png"))); // NOI18N
        jLabel148.setName("Bambuk3"); // NOI18N
        jLabel148.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel148MouseClicked(evt);
            }
        });

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot4.png"))); // NOI18N
        jLabel149.setName("Dot4"); // NOI18N
        jLabel149.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel149MouseClicked(evt);
            }
        });

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel150.setName("Symbol5"); // NOI18N
        jLabel150.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel150MouseClicked(evt);
            }
        });

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol2.png"))); // NOI18N
        jLabel151.setName("Symbol2"); // NOI18N
        jLabel151.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel151MouseClicked(evt);
            }
        });

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol4.png"))); // NOI18N
        jLabel153.setName("Symbol4"); // NOI18N
        jLabel153.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel153MouseClicked(evt);
            }
        });

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot2.png"))); // NOI18N
        jLabel154.setName("Dot2"); // NOI18N
        jLabel154.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel154MouseClicked(evt);
            }
        });

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot5.png"))); // NOI18N
        jLabel155.setName("Dot5"); // NOI18N
        jLabel155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel155MouseClicked(evt);
            }
        });

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk4.png"))); // NOI18N
        jLabel156.setName("Bambuk4"); // NOI18N
        jLabel156.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel156MouseClicked(evt);
            }
        });

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel157.setName("Symbol5"); // NOI18N
        jLabel157.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel157MouseClicked(evt);
            }
        });

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot3.png"))); // NOI18N
        jLabel158.setName("Dot3"); // NOI18N
        jLabel158.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel158MouseClicked(evt);
            }
        });

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk2.png"))); // NOI18N
        jLabel159.setName("Bambuk2"); // NOI18N
        jLabel159.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel159MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jPanel2.setName("fdrg"); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk5.png"))); // NOI18N
        jLabel120.setName("Bambuk5"); // NOI18N
        jLabel120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel120MouseClicked(evt);
            }
        });

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol4.png"))); // NOI18N
        jLabel128.setName("Symbol4"); // NOI18N
        jLabel128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel128MouseClicked(evt);
            }
        });

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel136.setName("Dot1"); // NOI18N
        jLabel136.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel136MouseClicked(evt);
            }
        });

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol2.png"))); // NOI18N
        jLabel144.setName("Symbol2"); // NOI18N
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel152.setName("Bambuk1"); // NOI18N
        jLabel152.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel152MouseClicked(evt);
            }
        });

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk5.png"))); // NOI18N
        jLabel160.setName("Bambuk5"); // NOI18N
        jLabel160.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel160MouseClicked(evt);
            }
        });

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dot1.png"))); // NOI18N
        jLabel161.setName("Dot1"); // NOI18N
        jLabel161.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel161MouseClicked(evt);
            }
        });

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel162.setName("Symbol5"); // NOI18N
        jLabel162.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel162MouseClicked(evt);
            }
        });

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bambuk1.png"))); // NOI18N
        jLabel163.setName("Bambuk1"); // NOI18N
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });

        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol2.png"))); // NOI18N
        jLabel164.setName("Symbol2"); // NOI18N
        jLabel164.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel164MouseClicked(evt);
            }
        });

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Symbol5.png"))); // NOI18N
        jLabel165.setName("Symbol5"); // NOI18N
        jLabel165.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel165MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("Игра");

        jMenuItem1.setText("Заново");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Выход ");
        jMenuItem2.setActionCommand("Выход");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        sloi(jLabel1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseClicked
        sloi(jLabel124);
    }//GEN-LAST:event_jLabel124MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        sloi(jLabel4);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        sloi(jLabel5);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        sloi(jLabel6);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        sloi(jLabel7);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        sloi(jLabel8);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        sloi(jLabel9);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseClicked
        sloi(jLabel113);
    }//GEN-LAST:event_jLabel113MouseClicked

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        sloi(jLabel114);
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseClicked
        sloi(jLabel115);
    }//GEN-LAST:event_jLabel115MouseClicked

    private void jLabel116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseClicked
        sloi(jLabel116);
    }//GEN-LAST:event_jLabel116MouseClicked

    private void jLabel118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel118MouseClicked
        sloi(jLabel118);
    }//GEN-LAST:event_jLabel118MouseClicked

    private void jLabel127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel127MouseClicked
        sloi(jLabel127);
    }//GEN-LAST:event_jLabel127MouseClicked

    private void jLabel119MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel119MouseClicked
        sloi(jLabel119);
    }//GEN-LAST:event_jLabel119MouseClicked

    private void jLabel121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseClicked
        sloi(jLabel121);
    }//GEN-LAST:event_jLabel121MouseClicked

    private void jLabel122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseClicked
        sloi(jLabel122);
    }//GEN-LAST:event_jLabel122MouseClicked

    private void jLabel123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseClicked
        sloi(jLabel123);
    }//GEN-LAST:event_jLabel123MouseClicked

    private void jLabel125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseClicked
        sloi(jLabel125);
    }//GEN-LAST:event_jLabel125MouseClicked

    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        sloi(jLabel126);
    }//GEN-LAST:event_jLabel126MouseClicked

    private void jLabel129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel129MouseClicked
        sloi(jLabel129);
    }//GEN-LAST:event_jLabel129MouseClicked

    private void jLabel130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel130MouseClicked
        sloi(jLabel130);
    }//GEN-LAST:event_jLabel130MouseClicked

    private void jLabel131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseClicked
        sloi(jLabel131);
    }//GEN-LAST:event_jLabel131MouseClicked

    private void jLabel132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel132MouseClicked
        sloi(jLabel132);
    }//GEN-LAST:event_jLabel132MouseClicked

    private void jLabel133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseClicked
        sloi(jLabel133);
    }//GEN-LAST:event_jLabel133MouseClicked

    private void jLabel134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseClicked
        sloi(jLabel134);
    }//GEN-LAST:event_jLabel134MouseClicked

    private void jLabel135MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel135MouseClicked
        sloi(jLabel135);
    }//GEN-LAST:event_jLabel135MouseClicked

    private void jLabel137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel137MouseClicked
        sloi(jLabel137);
    }//GEN-LAST:event_jLabel137MouseClicked

    private void jLabel138MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel138MouseClicked
        sloi(jLabel138);
    }//GEN-LAST:event_jLabel138MouseClicked

    private void jLabel139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseClicked
        sloi(jLabel139);
    }//GEN-LAST:event_jLabel139MouseClicked

    private void jLabel140MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel140MouseClicked
        sloi(jLabel140);
    }//GEN-LAST:event_jLabel140MouseClicked

    private void jLabel141MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel141MouseClicked
        sloi(jLabel141);
    }//GEN-LAST:event_jLabel141MouseClicked

    private void jLabel142MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel142MouseClicked
        sloi(jLabel142);
    }//GEN-LAST:event_jLabel142MouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        sloi(jLabel143);
    }//GEN-LAST:event_jLabel143MouseClicked

    private void jLabel145MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel145MouseClicked
        sloi(jLabel145);
    }//GEN-LAST:event_jLabel145MouseClicked

    private void jLabel146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel146MouseClicked
        sloi(jLabel146);
    }//GEN-LAST:event_jLabel146MouseClicked

    private void jLabel147MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseClicked
        sloi(jLabel147);
    }//GEN-LAST:event_jLabel147MouseClicked

    private void jLabel148MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel148MouseClicked
        sloi(jLabel148);
    }//GEN-LAST:event_jLabel148MouseClicked

    private void jLabel149MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel149MouseClicked
        sloi(jLabel149);
    }//GEN-LAST:event_jLabel149MouseClicked

    private void jLabel150MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel150MouseClicked
        sloi(jLabel150);
    }//GEN-LAST:event_jLabel150MouseClicked

    private void jLabel151MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel151MouseClicked
        sloi(jLabel151);
    }//GEN-LAST:event_jLabel151MouseClicked

    private void jLabel153MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel153MouseClicked
        sloi(jLabel153);
    }//GEN-LAST:event_jLabel153MouseClicked

    private void jLabel154MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel154MouseClicked
        sloi(jLabel154);
    }//GEN-LAST:event_jLabel154MouseClicked

    private void jLabel155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel155MouseClicked
        sloi(jLabel155);
    }//GEN-LAST:event_jLabel155MouseClicked

    private void jLabel156MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel156MouseClicked
        sloi(jLabel156);
    }//GEN-LAST:event_jLabel156MouseClicked

    private void jLabel157MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel157MouseClicked
        sloi(jLabel157);
    }//GEN-LAST:event_jLabel157MouseClicked

    private void jLabel158MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel158MouseClicked
        sloi(jLabel158);
    }//GEN-LAST:event_jLabel158MouseClicked

    private void jLabel159MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel159MouseClicked
        sloi(jLabel159);
    }//GEN-LAST:event_jLabel159MouseClicked

    private void jLabel164MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel164MouseClicked
        sloi(jLabel164);
    }//GEN-LAST:event_jLabel164MouseClicked

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        sloi(jLabel163);
    }//GEN-LAST:event_jLabel163MouseClicked

    private void jLabel162MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel162MouseClicked
        sloi(jLabel162);
    }//GEN-LAST:event_jLabel162MouseClicked

    private void jLabel161MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel161MouseClicked
        sloi(jLabel161);
    }//GEN-LAST:event_jLabel161MouseClicked

    private void jLabel160MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel160MouseClicked
        sloi(jLabel160);
    }//GEN-LAST:event_jLabel160MouseClicked

    private void jLabel120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseClicked
        sloi(jLabel120);
    }//GEN-LAST:event_jLabel120MouseClicked

    private void jLabel128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel128MouseClicked
        sloi(jLabel128);
    }//GEN-LAST:event_jLabel128MouseClicked

    private void jLabel152MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel152MouseClicked
        sloi(jLabel152);
    }//GEN-LAST:event_jLabel152MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
        sloi(jLabel144);
    }//GEN-LAST:event_jLabel144MouseClicked

    private void jLabel136MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel136MouseClicked
        sloi(jLabel136);
    }//GEN-LAST:event_jLabel136MouseClicked

    private void jLabel165MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel165MouseClicked
        sloi(jLabel165);
    }//GEN-LAST:event_jLabel165MouseClicked

    private void jLabel117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseClicked
        sloi(jLabel117);
    }//GEN-LAST:event_jLabel117MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Rectangle rect = firstlvl.getBounds();
        firstlvl.dispose();
        firstlvl = new Firstlvlform();
        firstlvl.setBounds(rect);
        firstlvl.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        firstlvl.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

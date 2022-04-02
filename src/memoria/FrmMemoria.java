/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author nel_g
 */
public class FrmMemoria extends javax.swing.JFrame {

    /**
     * Creates new form FrmMemoria
     */
    int[] vector={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int score=0;
    int movimiento=0;
    int numeromovimiento;
    int carta1,carta2;
    int posicion1,posicion2;
    int contador1, contador,aleatorio;
    int numero, comprobante, veces;
    ImageIcon imagen = new ImageIcon( "fondoazul.jpg" );
    ImageIcon imagen1 = new ImageIcon (getClass().getResource("1.jpg"));
    ImageIcon imagen2 = new ImageIcon (getClass().getResource("2.jpg"));
    ImageIcon imagen3 = new ImageIcon (getClass().getResource("3.jpg"));
    ImageIcon imagen4 = new ImageIcon (getClass().getResource("4.jpg"));
    ImageIcon imagen5 = new ImageIcon (getClass().getResource("5.png"));
    ImageIcon imagen6 = new ImageIcon (getClass().getResource("6.jpg"));
    ImageIcon imagen7 = new ImageIcon (getClass().getResource("7.jpg"));
    ImageIcon imagen8 = new ImageIcon (getClass().getResource("8.jpg"));
    ImageIcon imagen9 = new ImageIcon (getClass().getResource("9.jpg"));
    ImageIcon imagen10 = new ImageIcon (getClass().getResource("10.jpg"));
    ImageIcon imagen11 = new ImageIcon (getClass().getResource("11.jpg"));
    ImageIcon imagen12 = new ImageIcon (getClass().getResource("12.png"));
    ImageIcon imagen13 = new ImageIcon (getClass().getResource("13.jpg"));

    
    public FrmMemoria() {
        initComponents();  
       
    }

    private void comparar()
    {
        if (movimiento == 2)
        {
            if(posicion1 != posicion2)
            {
                switch(carta1)
                {
                    case 1: Btn1.setIcon(imagen);
                        break;
                    case 2: Btn2.setIcon(imagen);
                        break;
                    case 3: Btn3.setIcon(imagen);
                        break;
                    case 4: Btn4.setIcon(imagen);
                        break;
                    case 5: Btn5.setIcon(imagen);
                        break;
                    case 6: Btn6.setIcon(imagen);
                        break;
                    case 7: Btn7.setIcon(imagen);
                        break;
                    case 8: Btn8.setIcon(imagen);
                        break;
                    case 9: Btn9.setIcon(imagen);
                        break;
                    case 10: Btn10.setIcon(imagen);
                        break;
                    case 11: Btn11.setIcon(imagen);
                        break;
                    case 12: Btn12.setIcon(imagen);
                        break;
                    case 13: Btn13.setIcon(imagen);
                        break;
                    case 14: Btn14.setIcon(imagen);
                        break;
                    case 15: Btn15.setIcon(imagen);
                        break;
                    case 16: Btn16.setIcon(imagen);
                        break;
                    case 17: Btn17.setIcon(imagen);
                        break;
                    case 18: Btn18.setIcon(imagen);
                        break;
                    case 19: Btn19.setIcon(imagen);
                        break;
                    case 20: Btn20.setIcon(imagen);
                        break;
                    case 21: Btn21.setIcon(imagen);
                        break;
                    case 22: Btn22.setIcon(imagen);
                        break;
                    case 23: Btn23.setIcon(imagen);
                        break;
                    case 24: Btn24.setIcon(imagen);
                        break;
                    case 25: Btn25.setIcon(imagen);
                        break;
                    case 26: Btn26.setIcon(imagen);
                        break;
                }
                switch(carta2)
                {
                    case 1: Btn1.setIcon(imagen);
                        break;
                    case 2: Btn2.setIcon(imagen);
                        break;
                    case 3: Btn3.setIcon(imagen);
                        break;
                    case 4: Btn4.setIcon(imagen);
                        break;
                    case 5: Btn5.setIcon(imagen);
                        break;
                    case 6: Btn6.setIcon(imagen);
                        break;
                    case 7: Btn7.setIcon(imagen);
                        break;
                    case 8: Btn8.setIcon(imagen);
                        break;
                    case 9: Btn9.setIcon(imagen);
                        break;
                    case 10: Btn10.setIcon(imagen);
                        break;
                    case 11: Btn11.setIcon(imagen);
                        break;
                    case 12: Btn12.setIcon(imagen);
                        break;
                    case 13: Btn13.setIcon(imagen);
                        break;
                    case 14: Btn14.setIcon(imagen);
                        break;
                    case 15: Btn15.setIcon(imagen);
                        break;
                    case 16: Btn16.setIcon(imagen);
                        break;
                    case 17: Btn17.setIcon(imagen);
                        break;
                    case 18: Btn18.setIcon(imagen);
                        break;
                    case 19: Btn19.setIcon(imagen);
                        break;
                    case 20: Btn20.setIcon(imagen);
                        break;
                    case 21: Btn21.setIcon(imagen);
                        break;
                    case 22: Btn22.setIcon(imagen);
                        break;
                    case 23: Btn23.setIcon(imagen);
                        break;
                    case 24: Btn24.setIcon(imagen);
                        break;
                    case 25: Btn25.setIcon(imagen);
                        break;
                    case 26: Btn26.setIcon(imagen);
                        break;
                }
            }
            movimiento=0;
            numeromovimiento++;
            lblmovimientos.setText( String.valueOf( numeromovimiento ) );
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        BtnReiniciar = new javax.swing.JButton();
        lblmovimientos = new javax.swing.JLabel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn15 = new javax.swing.JButton();
        Btn13 = new javax.swing.JButton();
        Btn14 = new javax.swing.JButton();
        Btn12 = new javax.swing.JButton();
        Btn11 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        Btn18 = new javax.swing.JButton();
        Btn19 = new javax.swing.JButton();
        Btn17 = new javax.swing.JButton();
        Btn16 = new javax.swing.JButton();
        Btn25 = new javax.swing.JButton();
        Btn23 = new javax.swing.JButton();
        Btn24 = new javax.swing.JButton();
        Btn22 = new javax.swing.JButton();
        Btn21 = new javax.swing.JButton();
        Btn26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel27.setText("Numero de movimientos");

        BtnReiniciar.setText("Reiniciar");
        BtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarActionPerformed(evt);
            }
        });

        Btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn1.setText("jButton2");
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn1MouseExited(evt);
            }
        });
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn2.setText("jButton2");
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn2MouseExited(evt);
            }
        });
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn3.setText("jButton2");
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn3MouseExited(evt);
            }
        });
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn4.setText("jButton2");
        Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn4MouseExited(evt);
            }
        });
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn5.setText("jButton2");
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn5MouseExited(evt);
            }
        });
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn10.setText("jButton2");
        Btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn10MouseExited(evt);
            }
        });
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });

        Btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn8.setText("jButton2");
        Btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn8MouseExited(evt);
            }
        });
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn9.setText("jButton2");
        Btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn9MouseExited(evt);
            }
        });
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn7.setText("jButton2");
        Btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn7MouseExited(evt);
            }
        });
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn6.setText("jButton2");
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn6MouseExited(evt);
            }
        });
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn15.setText("jButton2");
        Btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn15MouseExited(evt);
            }
        });
        Btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn15ActionPerformed(evt);
            }
        });

        Btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn13.setText("jButton2");
        Btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn13MouseExited(evt);
            }
        });
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });

        Btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn14.setText("jButton2");
        Btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn14MouseExited(evt);
            }
        });
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });

        Btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn12.setText("jButton2");
        Btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn12MouseExited(evt);
            }
        });
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });

        Btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn11.setText("jButton2");
        Btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn11MouseExited(evt);
            }
        });
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });

        Btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn20.setText("jButton2");
        Btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn20MouseExited(evt);
            }
        });
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });

        Btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn18.setText("jButton2");
        Btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn18MouseExited(evt);
            }
        });
        Btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn18ActionPerformed(evt);
            }
        });

        Btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn19.setText("jButton2");
        Btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn19MouseExited(evt);
            }
        });
        Btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn19ActionPerformed(evt);
            }
        });

        Btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn17.setText("jButton2");
        Btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn17MouseExited(evt);
            }
        });
        Btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn17ActionPerformed(evt);
            }
        });

        Btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn16.setText("jButton2");
        Btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn16MouseExited(evt);
            }
        });
        Btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn16ActionPerformed(evt);
            }
        });

        Btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn25.setText("jButton2");
        Btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn25MouseExited(evt);
            }
        });
        Btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn25ActionPerformed(evt);
            }
        });

        Btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn23.setText("\n");
        Btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn23MouseExited(evt);
            }
        });
        Btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn23ActionPerformed(evt);
            }
        });

        Btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn24.setText("jButton2");
        Btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn24MouseExited(evt);
            }
        });
        Btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn24ActionPerformed(evt);
            }
        });

        Btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn22.setText("jButton2");
        Btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn22MouseExited(evt);
            }
        });
        Btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn22ActionPerformed(evt);
            }
        });

        Btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn21.setText("jButton2");
        Btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn21MouseExited(evt);
            }
        });
        Btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn21ActionPerformed(evt);
            }
        });

        Btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/fondoazul.jpg"))); // NOI18N
        Btn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn26MouseExited(evt);
            }
        });
        Btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblmovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[0];
            carta1=1;
        }
        else
        {
            posicion2=vector[0];
            carta2=1;
        }
        switch(vector[0])
        {
            case 1: Btn1.setIcon(imagen1);
                    break;
                case 2: Btn1.setIcon(imagen2);
                    break;
                case 3: Btn1.setIcon(imagen3);
                    break;
                case 4: Btn1.setIcon(imagen4);
                    break;
                case 5: Btn1.setIcon(imagen5);
                    break;
                case 6: Btn1.setIcon(imagen6);
                    break;
                case 7: Btn1.setIcon(imagen7);
                    break;
                case 8: Btn1.setIcon(imagen8);
                    break;
                case 9: Btn1.setIcon(imagen9);
                    break;
                case 10: Btn1.setIcon(imagen10);
                    break;
                case 11: Btn1.setIcon(imagen11);
                    break;
                case 12: Btn1.setIcon(imagen12);
                    break;
                case 13: Btn1.setIcon(imagen13);
                    break;
        }
        
      
    }//GEN-LAST:event_Btn1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for ( contador = 1;  contador <= 13 ; contador++ )
        {
            contador1=1;
            while ( contador1 <= 2 )
            {
                aleatorio = (int)(Math.random()* 26);
                if( vector[aleatorio] == 0)
                {
                    vector[aleatorio] = contador;
                    contador1++;
                }
            }
        }
        for (contador=0; contador<26; contador++)
        {
            System.out.print(vector[contador]);
            System.out.printf(" ");
        }
    }//GEN-LAST:event_formWindowOpened

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[1];
            carta1=2;
        }
        else
        {
            posicion2=vector[1];
            carta2=2;
        }
        switch(vector[1])
        {
            case 1: Btn2.setIcon(imagen1);
                    break;
                case 2: Btn2.setIcon(imagen2);
                    break;
                case 3: Btn2.setIcon(imagen3);
                    break;
                case 4: Btn2.setIcon(imagen4);
                    break;
                case 5: Btn2.setIcon(imagen5);
                    break;
                case 6: Btn2.setIcon(imagen6);
                    break;
                case 7: Btn2.setIcon(imagen7);
                    break;
                case 8: Btn2.setIcon(imagen8);
                    break;
                case 9: Btn2.setIcon(imagen9);
                    break;
                case 10: Btn2.setIcon(imagen10);
                    break;
                case 11: Btn2.setIcon(imagen11);
                    break;
                case 12: Btn2.setIcon(imagen12);
                    break;
                case 13: Btn2.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[2];
            carta1=3;
        }
        else
        {
            posicion2=vector[2];
            carta2=3;
        }
        switch(vector[2])
        {
            case 1: Btn3.setIcon(imagen1);
                    break;
                case 2: Btn3.setIcon(imagen2);
                    break;
                case 3: Btn3.setIcon(imagen3);
                    break;
                case 4: Btn3.setIcon(imagen4);
                    break;
                case 5: Btn3.setIcon(imagen5);
                    break;
                case 6: Btn3.setIcon(imagen6);
                    break;
                case 7: Btn3.setIcon(imagen7);
                    break;
                case 8: Btn3.setIcon(imagen8);
                    break;
                case 9: Btn3.setIcon(imagen9);
                    break;
                case 10: Btn3.setIcon(imagen10);
                    break;
                case 11: Btn3.setIcon(imagen11);
                    break;
                case 12: Btn3.setIcon(imagen12);
                    break;
                case 13: Btn3.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[3];
            carta1=4;
        }
        else
        {
            posicion2=vector[3];
            carta2=4;
        }
        switch(vector[3])
        {
            case 1: Btn4.setIcon(imagen1);
                    break;
                case 2: Btn4.setIcon(imagen2);
                    break;
                case 3: Btn4.setIcon(imagen3);
                    break;
                case 4: Btn4.setIcon(imagen4);
                    break;
                case 5: Btn4.setIcon(imagen5);
                    break;
                case 6: Btn4.setIcon(imagen6);
                    break;
                case 7: Btn4.setIcon(imagen7);
                    break;
                case 8: Btn4.setIcon(imagen8);
                    break;
                case 9: Btn4.setIcon(imagen9);
                    break;
                case 10: Btn4.setIcon(imagen10);
                    break;
                case 11: Btn4.setIcon(imagen11);
                    break;
                case 12: Btn4.setIcon(imagen12);
                    break;
                case 13: Btn4.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[4];
            carta1=5;
        }
        else
        {
            posicion2=vector[4];
            carta2=5;
        }
        switch(vector[4])
        {
            case 1: Btn5.setIcon(imagen1);
                    break;
                case 2: Btn5.setIcon(imagen2);
                    break;
                case 3: Btn5.setIcon(imagen3);
                    break;
                case 4: Btn5.setIcon(imagen4);
                    break;
                case 5: Btn5.setIcon(imagen5);
                    break;
                case 6: Btn5.setIcon(imagen6);
                    break;
                case 7: Btn5.setIcon(imagen7);
                    break;
                case 8: Btn5.setIcon(imagen8);
                    break;
                case 9: Btn5.setIcon(imagen9);
                    break;
                case 10: Btn5.setIcon(imagen10);
                    break;
                case 11: Btn5.setIcon(imagen11);
                    break;
                case 12: Btn5.setIcon(imagen12);
                    break;
                case 13: Btn5.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[5];
            carta1=6;
        }
        else
        {
            posicion2=vector[5];
            carta2=6;
        }
        switch(vector[5])
        {
            case 1: Btn6.setIcon(imagen1);
                    break;
                case 2: Btn6.setIcon(imagen2);
                    break;
                case 3: Btn6.setIcon(imagen3);
                    break;
                case 4: Btn6.setIcon(imagen4);
                    break;
                case 5: Btn6.setIcon(imagen5);
                    break;
                case 6: Btn6.setIcon(imagen6);
                    break;
                case 7: Btn6.setIcon(imagen7);
                    break;
                case 8: Btn6.setIcon(imagen8);
                    break;
                case 9: Btn6.setIcon(imagen9);
                    break;
                case 10: Btn6.setIcon(imagen10);
                    break;
                case 11: Btn6.setIcon(imagen11);
                    break;
                case 12: Btn6.setIcon(imagen12);
                    break;
                case 13: Btn6.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[6];
            carta1=7;
        }
        else
        {
            posicion2=vector[6];
            carta2=7;
        }
        switch(vector[6])
        {
            case 1: Btn7.setIcon(imagen1);
                    break;
                case 2: Btn7.setIcon(imagen2);
                    break;
                case 3: Btn7.setIcon(imagen3);
                    break;
                case 4: Btn7.setIcon(imagen4);
                    break;
                case 5: Btn7.setIcon(imagen5);
                    break;
                case 6: Btn7.setIcon(imagen6);
                    break;
                case 7: Btn7.setIcon(imagen7);
                    break;
                case 8: Btn7.setIcon(imagen8);
                    break;
                case 9: Btn7.setIcon(imagen9);
                    break;
                case 10: Btn7.setIcon(imagen10);
                    break;
                case 11: Btn7.setIcon(imagen11);
                    break;
                case 12: Btn7.setIcon(imagen12);
                    break;
                case 13: Btn7.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[7];
            carta1=8;
        }
        else
        {
            posicion2=vector[7];
            carta2=8;
        }
        switch(vector[7])
        {
            case 1: Btn8.setIcon(imagen1);
                    break;
                case 2: Btn8.setIcon(imagen2);
                    break;
                case 3: Btn8.setIcon(imagen3);
                    break;
                case 4: Btn8.setIcon(imagen4);
                    break;
                case 5: Btn8.setIcon(imagen5);
                    break;
                case 6: Btn8.setIcon(imagen6);
                    break;
                case 7: Btn8.setIcon(imagen7);
                    break;
                case 8: Btn8.setIcon(imagen8);
                    break;
                case 9: Btn8.setIcon(imagen9);
                    break;
                case 10: Btn8.setIcon(imagen10);
                    break;
                case 11: Btn8.setIcon(imagen11);
                    break;
                case 12: Btn8.setIcon(imagen12);
                    break;
                case 13: Btn8.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[8];
            carta1=9;
        }
        else
        {
            posicion2=vector[8];
            carta2=9;
        }
        switch(vector[8])
        {
            case 1: Btn9.setIcon(imagen1);
                    break;
                case 2: Btn9.setIcon(imagen2);
                    break;
                case 3: Btn9.setIcon(imagen3);
                    break;
                case 4: Btn9.setIcon(imagen4);
                    break;
                case 5: Btn9.setIcon(imagen5);
                    break;
                case 6: Btn9.setIcon(imagen6);
                    break;
                case 7: Btn9.setIcon(imagen7);
                    break;
                case 8: Btn9.setIcon(imagen8);
                    break;
                case 9: Btn9.setIcon(imagen9);
                    break;
                case 10: Btn9.setIcon(imagen10);
                    break;
                case 11: Btn9.setIcon(imagen11);
                    break;
                case 12: Btn9.setIcon(imagen12);
                    break;
                case 13: Btn9.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[9];
            carta1=10;
        }
        else
        {
            posicion2=vector[9];
            carta2=10;
        }
        switch(vector[9])
        {
            case 1: Btn10.setIcon(imagen1);
                    break;
                case 2: Btn10.setIcon(imagen2);
                    break;
                case 3: Btn10.setIcon(imagen3);
                    break;
                case 4: Btn10.setIcon(imagen4);
                    break;
                case 5: Btn10.setIcon(imagen5);
                    break;
                case 6: Btn10.setIcon(imagen6);
                    break;
                case 7: Btn10.setIcon(imagen7);
                    break;
                case 8: Btn10.setIcon(imagen8);
                    break;
                case 9: Btn10.setIcon(imagen9);
                    break;
                case 10: Btn10.setIcon(imagen10);
                    break;
                case 11: Btn10.setIcon(imagen11);
                    break;
                case 12: Btn10.setIcon(imagen12);
                    break;
                case 13: Btn10.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[10];
            carta1=11;
        }
        else
        {
            posicion2=vector[10];
            carta2=11;
        }
        switch(vector[10])
        {
            case 1: Btn11.setIcon(imagen1);
                    break;
                case 2: Btn11.setIcon(imagen2);
                    break;
                case 3: Btn11.setIcon(imagen3);
                    break;
                case 4: Btn11.setIcon(imagen4);
                    break;
                case 5: Btn11.setIcon(imagen5);
                    break;
                case 6: Btn11.setIcon(imagen6);
                    break;
                case 7: Btn11.setIcon(imagen7);
                    break;
                case 8: Btn11.setIcon(imagen8);
                    break;
                case 9: Btn11.setIcon(imagen9);
                    break;
                case 10: Btn11.setIcon(imagen10);
                    break;
                case 11: Btn11.setIcon(imagen11);
                    break;
                case 12: Btn11.setIcon(imagen12);
                    break;
                case 13: Btn11.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[11];
            carta1=12;
        }
        else
        {
            posicion2=vector[11];
            carta2=12;
        }
        switch(vector[11])
        {
            case 1: Btn12.setIcon(imagen1);
                    break;
                case 2: Btn12.setIcon(imagen2);
                    break;
                case 3: Btn12.setIcon(imagen3);
                    break;
                case 4: Btn12.setIcon(imagen4);
                    break;
                case 5: Btn12.setIcon(imagen5);
                    break;
                case 6: Btn12.setIcon(imagen6);
                    break;
                case 7: Btn12.setIcon(imagen7);
                    break;
                case 8: Btn12.setIcon(imagen8);
                    break;
                case 9: Btn12.setIcon(imagen9);
                    break;
                case 10: Btn12.setIcon(imagen10);
                    break;
                case 11: Btn12.setIcon(imagen11);
                    break;
                case 12: Btn12.setIcon(imagen12);
                    break;
                case 13: Btn12.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[12];
            carta1=13;
        }
        else
        {
            posicion2=vector[12];
            carta2=13;
        }
        switch(vector[12])
        {
            case 1: Btn13.setIcon(imagen1);
                    break;
                case 2: Btn13.setIcon(imagen2);
                    break;
                case 3: Btn13.setIcon(imagen3);
                    break;
                case 4: Btn13.setIcon(imagen4);
                    break;
                case 5: Btn13.setIcon(imagen5);
                    break;
                case 6: Btn13.setIcon(imagen6);
                    break;
                case 7: Btn13.setIcon(imagen7);
                    break;
                case 8: Btn13.setIcon(imagen8);
                    break;
                case 9: Btn13.setIcon(imagen9);
                    break;
                case 10: Btn13.setIcon(imagen10);
                    break;
                case 11: Btn13.setIcon(imagen11);
                    break;
                case 12: Btn13.setIcon(imagen12);
                    break;
                case 13: Btn13.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn13ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[13];
            carta1=14;
        }
        else
        {
            posicion2=vector[13];
            carta2=14;
        }
        switch(vector[13])
        {
            case 1: Btn14.setIcon(imagen1);
                    break;
                case 2: Btn14.setIcon(imagen2);
                    break;
                case 3: Btn14.setIcon(imagen3);
                    break;
                case 4: Btn14.setIcon(imagen4);
                    break;
                case 5: Btn14.setIcon(imagen5);
                    break;
                case 6: Btn14.setIcon(imagen6);
                    break;
                case 7: Btn14.setIcon(imagen7);
                    break;
                case 8: Btn14.setIcon(imagen8);
                    break;
                case 9: Btn14.setIcon(imagen9);
                    break;
                case 10: Btn14.setIcon(imagen10);
                    break;
                case 11: Btn14.setIcon(imagen11);
                    break;
                case 12: Btn14.setIcon(imagen12);
                    break;
                case 13: Btn14.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn15ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[14];
            carta1=15;
        }
        else
        {
            posicion2=vector[14];
            carta2=15;
        }
        switch(vector[14])
        {
            case 1: Btn15.setIcon(imagen1);
                    break;
                case 2: Btn15.setIcon(imagen2);
                    break;
                case 3: Btn15.setIcon(imagen3);
                    break;
                case 4: Btn15.setIcon(imagen4);
                    break;
                case 5: Btn15.setIcon(imagen5);
                    break;
                case 6: Btn15.setIcon(imagen6);
                    break;
                case 7: Btn15.setIcon(imagen7);
                    break;
                case 8: Btn15.setIcon(imagen8);
                    break;
                case 9: Btn15.setIcon(imagen9);
                    break;
                case 10: Btn15.setIcon(imagen10);
                    break;
                case 11: Btn15.setIcon(imagen11);
                    break;
                case 12: Btn15.setIcon(imagen12);
                    break;
                case 13: Btn15.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn15ActionPerformed

    private void Btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn16ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[15];
            carta1=16;
        }
        else
        {
            posicion2=vector[15];
            carta2=16;
        }
        switch(vector[15])
        {
            case 1: Btn16.setIcon(imagen1);
                    break;
                case 2: Btn16.setIcon(imagen2);
                    break;
                case 3: Btn16.setIcon(imagen3);
                    break;
                case 4: Btn16.setIcon(imagen4);
                    break;
                case 5: Btn16.setIcon(imagen5);
                    break;
                case 6: Btn16.setIcon(imagen6);
                    break;
                case 7: Btn16.setIcon(imagen7);
                    break;
                case 8: Btn16.setIcon(imagen8);
                    break;
                case 9: Btn16.setIcon(imagen9);
                    break;
                case 10: Btn16.setIcon(imagen10);
                    break;
                case 11: Btn16.setIcon(imagen11);
                    break;
                case 12: Btn16.setIcon(imagen12);
                    break;
                case 13: Btn16.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn16ActionPerformed

    private void Btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn17ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1=vector[16];
            carta1=17;
        }
        else
        {
            posicion2 = vector[16];
            carta2 = 17;
        }
        switch( vector[16] )
        {
            case 1: Btn17.setIcon(imagen1);
                    break;
                case 2: Btn17.setIcon(imagen2);
                    break;
                case 3: Btn17.setIcon(imagen3);
                    break;
                case 4: Btn17.setIcon(imagen4);
                    break;
                case 5: Btn17.setIcon(imagen5);
                    break;
                case 6: Btn17.setIcon(imagen6);
                    break;
                case 7: Btn17.setIcon(imagen7);
                    break;
                case 8: Btn17.setIcon(imagen8);
                    break;
                case 9: Btn17.setIcon(imagen9);
                    break;
                case 10: Btn17.setIcon(imagen10);
                    break;
                case 11: Btn17.setIcon(imagen11);
                    break;
                case 12: Btn17.setIcon(imagen12);
                    break;
                case 13: Btn17.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn17ActionPerformed

    private void Btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn18ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[17];
            carta1 = 18;
        }
        else
        {
            posicion2 = vector[17];
            carta2 = 18;
        }
        switch( vector[17] )
        {
            case 1: Btn18.setIcon(imagen1);
                    break;
                case 2: Btn18.setIcon(imagen2);
                    break;
                case 3: Btn18.setIcon(imagen3);
                    break;
                case 4: Btn18.setIcon(imagen4);
                    break;
                case 5: Btn18.setIcon(imagen5);
                    break;
                case 6: Btn18.setIcon(imagen6);
                    break;
                case 7: Btn18.setIcon(imagen7);
                    break;
                case 8: Btn18.setIcon(imagen8);
                    break;
                case 9: Btn18.setIcon(imagen9);
                    break;
                case 10: Btn18.setIcon(imagen10);
                    break;
                case 11: Btn18.setIcon(imagen11);
                    break;
                case 12: Btn18.setIcon(imagen12);
                    break;
                case 13: Btn18.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn18ActionPerformed

    private void Btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn19ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[18];
            carta1 = 19;
        }
        else
        {
            posicion2 = vector[18];
            carta2 = 19;
        }
        switch( vector[18] )
        {
            case 1: Btn19.setIcon(imagen1);
                    break;
                case 2: Btn19.setIcon(imagen2);
                    break;
                case 3: Btn19.setIcon(imagen3);
                    break;
                case 4: Btn19.setIcon(imagen4);
                    break;
                case 5: Btn19.setIcon(imagen5);
                    break;
                case 6: Btn19.setIcon(imagen6);
                    break;
                case 7: Btn19.setIcon(imagen7);
                    break;
                case 8: Btn19.setIcon(imagen8);
                    break;
                case 9: Btn19.setIcon(imagen9);
                    break;
                case 10: Btn19.setIcon(imagen10);
                    break;
                case 11: Btn19.setIcon(imagen11);
                    break;
                case 12: Btn19.setIcon(imagen12);
                    break;
                case 13: Btn19.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn19ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[19];
            carta1 = 20;
        }
        else
        {
            posicion2=vector[19];
            carta2=20;
        }
        switch( vector[19] )
        {
            case 1: Btn20.setIcon(imagen1);
                    break;
                case 2: Btn20.setIcon(imagen2);
                    break;
                case 3: Btn20.setIcon(imagen3);
                    break;
                case 4: Btn20.setIcon(imagen4);
                    break;
                case 5: Btn20.setIcon(imagen5);
                    break;
                case 6: Btn20.setIcon(imagen6);
                    break;
                case 7: Btn20.setIcon(imagen7);
                    break;
                case 8: Btn20.setIcon(imagen8);
                    break;
                case 9: Btn20.setIcon(imagen9);
                    break;
                case 10: Btn20.setIcon(imagen10);
                    break;
                case 11: Btn20.setIcon(imagen11);
                    break;
                case 12: Btn20.setIcon(imagen12);
                    break;
                case 13: Btn20.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn21ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[20];
            carta1 = 21;
        }
        else
        {
            posicion2 = vector[20];
            carta2 = 21;
        }
        switch( vector[20] )
        {
            case 1: Btn21.setIcon(imagen1);
                    break;
                case 2: Btn21.setIcon(imagen2);
                    break;
                case 3: Btn21.setIcon(imagen3);
                    break;
                case 4: Btn21.setIcon(imagen4);
                    break;
                case 5: Btn21.setIcon(imagen5);
                    break;
                case 6: Btn21.setIcon(imagen6);
                    break;
                case 7: Btn21.setIcon(imagen7);
                    break;
                case 8: Btn21.setIcon(imagen8);
                    break;
                case 9: Btn21.setIcon(imagen9);
                    break;
                case 10: Btn21.setIcon(imagen10);
                    break;
                case 11: Btn21.setIcon(imagen11);
                    break;
                case 12: Btn21.setIcon(imagen12);
                    break;
                case 13: Btn21.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn21ActionPerformed

    private void Btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn22ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[21];
            carta1 = 22;
        }
        else
        {
            posicion2 = vector[21];
            carta2 = 22;
        }
        switch(vector[21])
        {
            case 1: Btn22.setIcon(imagen1);
                    break;
                case 2: Btn22.setIcon(imagen2);
                    break;
                case 3: Btn22.setIcon(imagen3);
                    break;
                case 4: Btn22.setIcon(imagen4);
                    break;
                case 5: Btn22.setIcon(imagen5);
                    break;
                case 6: Btn22.setIcon(imagen6);
                    break;
                case 7: Btn22.setIcon(imagen7);
                    break;
                case 8: Btn22.setIcon(imagen8);
                    break;
                case 9: Btn22.setIcon(imagen9);
                    break;
                case 10: Btn22.setIcon(imagen10);
                    break;
                case 11: Btn22.setIcon(imagen11);
                    break;
                case 12: Btn22.setIcon(imagen12);
                    break;
                case 13: Btn22.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn22ActionPerformed

    private void Btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn23ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[22];
            carta1 = 23;
        }
        else
        {
            posicion2 = vector[22];
            carta2 = 23;
        }
        switch(vector[22])
        {
            case 1: Btn23.setIcon(imagen1);
                    break;
                case 2: Btn23.setIcon(imagen2);
                    break;
                case 3: Btn23.setIcon(imagen3);
                    break;
                case 4: Btn23.setIcon(imagen4);
                    break;
                case 5: Btn23.setIcon(imagen5);
                    break;
                case 6: Btn23.setIcon(imagen6);
                    break;
                case 7: Btn23.setIcon(imagen7);
                    break;
                case 8: Btn23.setIcon(imagen8);
                    break;
                case 9: Btn23.setIcon(imagen9);
                    break;
                case 10: Btn23.setIcon(imagen10);
                    break;
                case 11: Btn23.setIcon(imagen11);
                    break;
                case 12: Btn23.setIcon(imagen12);
                    break;
                case 13: Btn23.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn23ActionPerformed

    private void Btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn24ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if(movimiento == 1)
        {
            posicion1 = vector[23];
            carta1 = 24;
        }
        else
        {
            posicion2 = vector[23];
            carta2 = 24;
        }
        switch(vector[23])
        {
            case 1: Btn24.setIcon(imagen1);
                    break;
                case 2: Btn24.setIcon(imagen2);
                    break;
                case 3: Btn24.setIcon(imagen3);
                    break;
                case 4: Btn24.setIcon(imagen4);
                    break;
                case 5: Btn24.setIcon(imagen5);
                    break;
                case 6: Btn24.setIcon(imagen6);
                    break;
                case 7: Btn24.setIcon(imagen7);
                    break;
                case 8: Btn24.setIcon(imagen8);
                    break;
                case 9: Btn24.setIcon(imagen9);
                    break;
                case 10: Btn24.setIcon(imagen10);
                    break;
                case 11: Btn24.setIcon(imagen11);
                    break;
                case 12: Btn24.setIcon(imagen12);
                    break;
                case 13: Btn24.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn24ActionPerformed

    private void Btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn25ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[24];
            carta1 = 25;
        }
        else
        {
            posicion2 = vector[24];
            carta2 = 25;
        }
        switch(vector[24])
        {
            case 1: Btn25.setIcon(imagen1);
                    break;
                case 2: Btn25.setIcon(imagen2);
                    break;
                case 3: Btn25.setIcon(imagen3);
                    break;
                case 4: Btn25.setIcon(imagen4);
                    break;
                case 5: Btn25.setIcon(imagen5);
                    break;
                case 6: Btn25.setIcon(imagen6);
                    break;
                case 7: Btn25.setIcon(imagen7);
                    break;
                case 8: Btn25.setIcon(imagen8);
                    break;
                case 9: Btn25.setIcon(imagen9);
                    break;
                case 10: Btn25.setIcon(imagen10);
                    break;
                case 11: Btn25.setIcon(imagen11);
                    break;
                case 12: Btn25.setIcon(imagen12);
                    break;
                case 13: Btn25.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn25ActionPerformed

    private void Btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn26ActionPerformed
        // TODO add your handling code here:
        movimiento ++;
        if( movimiento == 1 )
        {
            posicion1 = vector[25];
            carta1 = 26;
        }
        else
        {
            posicion2 = vector[25];
            carta2 = 26;
        }
        switch(vector[25])
        {
            case 1: Btn26.setIcon(imagen1);
                    break;
                case 2: Btn26.setIcon(imagen2);
                    break;
                case 3: Btn26.setIcon(imagen3);
                    break;
                case 4: Btn26.setIcon(imagen4);
                    break;
                case 5: Btn26.setIcon(imagen5);
                    break;
                case 6: Btn26.setIcon(imagen6);
                    break;
                case 7: Btn26.setIcon(imagen7);
                    break;
                case 8: Btn26.setIcon(imagen8);
                    break;
                case 9: Btn26.setIcon(imagen9);
                    break;
                case 10: Btn26.setIcon(imagen10);
                    break;
                case 11: Btn26.setIcon(imagen11);
                    break;
                case 12: Btn26.setIcon(imagen12);
                    break;
                case 13: Btn26.setIcon(imagen13);
                    break;
        }
    }//GEN-LAST:event_Btn26ActionPerformed

    private void Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn1MouseExited

    private void Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn2MouseExited

    private void Btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn3MouseExited

    private void Btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn4MouseExited

    private void Btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn5MouseExited

    private void Btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn6MouseExited

    private void Btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn7MouseExited

    private void Btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn8MouseExited

    private void Btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn9MouseExited

    private void Btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn10MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn10MouseExited

    private void Btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn11MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn11MouseExited

    private void Btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn12MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn12MouseExited

    private void Btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn13MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn13MouseExited

    private void Btn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn14MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn14MouseExited

    private void Btn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn15MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn15MouseExited

    private void Btn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn16MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn16MouseExited

    private void Btn17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn17MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn17MouseExited

    private void Btn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn18MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn18MouseExited

    private void Btn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn19MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn19MouseExited

    private void Btn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn20MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn20MouseExited

    private void Btn21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn21MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn21MouseExited

    private void Btn22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn22MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn22MouseExited

    private void Btn23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn23MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn23MouseExited

    private void Btn24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn24MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn24MouseExited

    private void Btn25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn25MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn25MouseExited

    private void Btn26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn26MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_Btn26MouseExited

    private void BtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarActionPerformed
        // TODO add your handling code here:
        movimiento = 0;
        contador = 0;
        contador1 = 0;
        numeromovimiento = 0;
        for (contador=0; contador<26; contador++)
        {
            vector[contador] = 0;
        }
        Btn1.setIcon(imagen);
        Btn2.setIcon(imagen);
        Btn3.setIcon(imagen);
        Btn4.setIcon(imagen);
        Btn5.setIcon(imagen);
        Btn6.setIcon(imagen);
        Btn7.setIcon(imagen);
        Btn8.setIcon(imagen);
        Btn9.setIcon(imagen);
        Btn10.setIcon(imagen);
        Btn11.setIcon(imagen);
        Btn12.setIcon(imagen);
        Btn13.setIcon(imagen);
        Btn14.setIcon(imagen);
        Btn15.setIcon(imagen);
        Btn16.setIcon(imagen);
        Btn17.setIcon(imagen);
        Btn18.setIcon(imagen);
        Btn19.setIcon(imagen);
        Btn20.setIcon(imagen);
        Btn21.setIcon(imagen);
        Btn22.setIcon(imagen);
        Btn23.setIcon(imagen);
        Btn24.setIcon(imagen);
        Btn25.setIcon(imagen);
        Btn26.setIcon(imagen);
        
        for ( contador = 1;  contador <= 13 ; contador++ )
        {
            contador1=1;
            while ( contador1 <= 2 )
            {
                aleatorio = (int)(Math.random()* 26);
                if( vector[aleatorio] == 0)
                {
                    vector[aleatorio] = contador;
                    contador1++;
                }
            }
        }
        for (contador = 0; contador < 26; contador++)
        {
            System.out.print(vector[contador]);
            System.out.printf(" ");
        }
        
    }//GEN-LAST:event_BtnReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn11;
    private javax.swing.JButton Btn12;
    private javax.swing.JButton Btn13;
    private javax.swing.JButton Btn14;
    private javax.swing.JButton Btn15;
    private javax.swing.JButton Btn16;
    private javax.swing.JButton Btn17;
    private javax.swing.JButton Btn18;
    private javax.swing.JButton Btn19;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn21;
    private javax.swing.JButton Btn22;
    private javax.swing.JButton Btn23;
    private javax.swing.JButton Btn24;
    private javax.swing.JButton Btn25;
    private javax.swing.JButton Btn26;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnReiniciar;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel lblmovimientos;
    // End of variables declaration//GEN-END:variables
}

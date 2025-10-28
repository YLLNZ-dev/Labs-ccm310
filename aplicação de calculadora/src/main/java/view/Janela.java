/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.Controller;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.OperacaoMatematica;

/**
 *
 * @author unifysouza
 */
public class Janela extends javax.swing.JFrame {
    
        private final Controller controller;
        private boolean novaEntrada = true;
        
        public Janela() {
        initComponents();
        controller = new Controller(); 
        limpaVisor(); 
}

    public JButton getBt0() {
        return Bt0;
    }

    public void setBt0(JButton Bt0) {
        this.Bt0 = Bt0;
    }

    public JButton getBt1() {
        return Bt1;
    }

    public void setBt1(JButton Bt1) {
        this.Bt1 = Bt1;
    }

    public JButton getBt2() {
        return Bt2;
    }

    public void setBt2(JButton Bt2) {
        this.Bt2 = Bt2;
    }

    public JButton getBt3() {
        return Bt3;
    }

    public void setBt3(JButton Bt3) {
        this.Bt3 = Bt3;
    }

    public JButton getBt4() {
        return Bt4;
    }

    public void setBt4(JButton Bt4) {
        this.Bt4 = Bt4;
    }

    public JButton getBt5() {
        return Bt5;
    }

    public void setBt5(JButton Bt5) {
        this.Bt5 = Bt5;
    }

    public JButton getBt6() {
        return Bt6;
    }

    public void setBt6(JButton Bt6) {
        this.Bt6 = Bt6;
    }

    public JButton getBt7() {
        return Bt7;
    }

    public void setBt7(JButton Bt7) {
        this.Bt7 = Bt7;
    }

    public JButton getBt8() {
        return Bt8;
    }

    public void setBt8(JButton Bt8) {
        this.Bt8 = Bt8;
    }

    public JButton getBt9() {
        return Bt9;
    }

    public void setBt9(JButton Bt9) {
        this.Bt9 = Bt9;
    }

    public JButton getBtclear() {
        return Btclear;
    }

    public void setBtclear(JButton Btclear) {
        this.Btclear = Btclear;
    }

    public JButton getBtdiv() {
        return Btdiv;
    }

    public void setBtdiv(JButton Btdiv) {
        this.Btdiv = Btdiv;
    }

    public JButton getBtequal() {
        return Btequal;
    }

    public void setBtequal(JButton Btequal) {
        this.Btequal = Btequal;
    }

    public JButton getBtmais() {
        return Btmais;
    }

    public void setBtmais(JButton Btmais) {
        this.Btmais = Btmais;
    }

    public JButton getBtmulti() {
        return Btmulti;
    }

    public void setBtmulti(JButton Btmulti) {
        this.Btmulti = Btmulti;
    }

    public JButton getBtsub() {
        return Btsub;
    }

    public void setBtsub(JButton Btsub) {
        this.Btsub = Btsub;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return jVisor;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jVisor = jTextArea1;
    }

    
    
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bt7 = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVisor = new javax.swing.JTextArea();
        Bt9 = new javax.swing.JButton();
        Btdiv = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        Btmulti = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Btsub = new javax.swing.JButton();
        Btclear = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();
        Btequal = new javax.swing.JButton();
        Btmais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        jVisor.setColumns(20);
        jVisor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jVisor.setRows(5);
        jVisor.setText("0,00");
        jVisor.setToolTipText("");
        jVisor.setAlignmentX(-2.0F);
        jVisor.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jVisor);

        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        Btdiv.setText("/");
        Btdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtdivActionPerformed(evt);
            }
        });

        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        Bt6.setText("6");
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });

        Btmulti.setText("X");
        Btmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmultiActionPerformed(evt);
            }
        });

        Bt1.setText("1");
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });

        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Btsub.setText("-");
        Btsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtsubActionPerformed(evt);
            }
        });

        Btclear.setText("C");
        Btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtclearActionPerformed(evt);
            }
        });

        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });

        Btequal.setText("=");
        Btequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtequalActionPerformed(evt);
            }
        });

        Btmais.setText("+");
        Btmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btequal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btmais, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btsub, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btdiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btmulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(Btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btequal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btmais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtdivActionPerformed
     acionarOperacao(OperacaoMatematica.DIVIDIR);
    }//GEN-LAST:event_BtdivActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
        digitar("6");
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
        digitar("3");
    }//GEN-LAST:event_Bt3ActionPerformed

    private void BtmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmaisActionPerformed
        acionarOperacao(OperacaoMatematica.SOMAR);
    }//GEN-LAST:event_BtmaisActionPerformed
        
    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
    digitar("5");
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
     digitar("1");
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
        digitar("7");
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
       digitar("8");
    }//GEN-LAST:event_Bt8ActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
        digitar("9");
    }//GEN-LAST:event_Bt9ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
        digitar("4");
    }//GEN-LAST:event_Bt4ActionPerformed

    private void BtmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmultiActionPerformed
        acionarOperacao(OperacaoMatematica.MULTIPLICAR);
    }//GEN-LAST:event_BtmultiActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
        digitar("2");
    }//GEN-LAST:event_Bt2ActionPerformed

    private void BtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtsubActionPerformed
        acionarOperacao(OperacaoMatematica.SUBTRAIR);
    }//GEN-LAST:event_BtsubActionPerformed

    private void BtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtclearActionPerformed
        limpaVisor();
    }//GEN-LAST:event_BtclearActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
        digitar("0");
    }//GEN-LAST:event_Bt0ActionPerformed

    private void BtequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtequalActionPerformed
        Double resultado = controller.calcular(jVisor.getText());
    
    if (resultado != null) {
        
        if (resultado % 1 == 0) {
            jVisor.setText(String.format("%.0f", resultado));
        } else {
            
            jVisor.setText(String.format("%.2f", resultado).replace(".", ","));
        }
    } else {
        jVisor.setText("Erro"); 
    }
    
    novaEntrada = true; 
    }//GEN-LAST:event_BtequalActionPerformed

    
    
   private void limpaVisor() {
    jVisor.setText("0");
    novaEntrada = true;
    controller.zerar(); 
}

    
    private void digitar(String caractere) {
    if (novaEntrada) {
        jVisor.setText(caractere);
        novaEntrada = false;
    } else {
        jVisor.setText(jVisor.getText().concat(caractere));
    }
}
    private void acionarOperacao(OperacaoMatematica op) {
    controller.setOperacao(op, jVisor.getText());
    novaEntrada = true; // Prepara para digitar o próximo número
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton Btclear;
    private javax.swing.JButton Btdiv;
    private javax.swing.JButton Btequal;
    private javax.swing.JButton Btmais;
    private javax.swing.JButton Btmulti;
    private javax.swing.JButton Btsub;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jVisor;
    // End of variables declaration//GEN-END:variables

    
}

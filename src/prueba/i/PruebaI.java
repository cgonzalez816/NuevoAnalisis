/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.i;

/**
 *
 * @author Pablo y Cesar
 */
public class PruebaI extends javax.swing.JFrame {

    /**
     * Creates new form PruebaI
     */
    public PruebaI() {
        initComponents();
        Jugador.setText("Juega jugador 1");
        playing = 1;
        count = 0;
        isPlay = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Jugador = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        Reset.setText("Jugar de nuevo!");
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(Jugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(55, 55, 55)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8)))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6)
                                .addComponent(jButton9)
                                .addComponent(jButton3)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(155, 155, 155))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Jugador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(Reset)
                .addGap(18, 18, 18)
                .addComponent(Mensaje)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Integer playing;
    public Integer count;
    public boolean isPlay;
    public void MarcarJugada(Integer num){
        count++;
        if(playing == 1)
            {
                switch (num)
                {
                    case 1:
                        jButton1.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 2:
                        jButton2.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 3:
                        jButton3.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 4:
                        jButton4.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 5:
                        jButton5.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 6:
                        jButton6.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 7:
                        jButton7.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 8:
                        jButton8.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                    case 9:
                        jButton9.setText("X");
                        playing = 2;
                        Jugador.setText("Juega jugador 2");
                    break;
                }
            }
            else
            {
                switch (num)
                {
                    case 1:
                        jButton1.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 2:
                        jButton2.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 3:
                        jButton3.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                        case 4:
                        jButton4.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 5:
                        jButton5.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 6:
                        jButton6.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 7:
                        jButton7.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 8:
                        jButton8.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                    case 9:
                        jButton9.setText("O");
                        playing = 1;
                        Jugador.setText("Juega jugador 1");
                    break;
                }
            }
    }
    public void VerificarGanador(){
        if(count>=5)
        {
            System.out.println("btn 1 "+jButton1.getText());
            System.out.println("btn 2 "+jButton2.getText());
            System.out.println("btn 3 "+jButton3.getText());
            System.out.println("btn 4 "+jButton4.getText());
            System.out.println("btn 5 "+jButton5.getText());
            System.out.println("btn 6 "+jButton6.getText());
            System.out.println("btn 7 "+jButton7.getText());
            System.out.println("btn 8 "+jButton8.getText());
            System.out.println("btn 9 "+jButton9.getText());
            if(playing == 2)
            {
                //**********************************************************************
                if(jButton1.getText().equals(jButton2.getText()) && jButton2.getText().equals(jButton3.getText()) && jButton1.getText().equals(jButton3.getText()) && !"".equals(jButton1.getText()) && !"".equals(jButton2.getText()) && !"".equals(jButton3.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                if(jButton1.getText().equals(jButton4.getText()) && jButton4.getText().equals(jButton7.getText()) && jButton1.getText().equals(jButton7.getText()) && !"".equals(jButton1.getText()) && !"".equals(jButton4.getText()) && !"".equals(jButton7.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                if(jButton1.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton9.getText()) && jButton1.getText().equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton2.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton8.getText()) && jButton2.getText().equals(jButton8.getText()) && !"".equals(jButton2.getText()) && !"".equals(jButton5.getText()) && !"".equals(jButton8.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton3.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton7.getText()) && jButton3.getText().equals(jButton7.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                if(jButton3.getText().equals(jButton6.getText()) && jButton6.getText().equals(jButton9.getText()) && jButton3.getText().equals(jButton9.getText()) && !"".equals(jButton3.getText()) && !"".equals(jButton6.getText()) && !"".equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton4.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton6.getText()) && jButton4.getText().equals(jButton6.getText()) && !"".equals(jButton4.getText()) && !"".equals(jButton5.getText()) && !"".equals(jButton6.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton7.getText().equals(jButton8.getText()) && jButton8.getText().equals(jButton9.getText()) && jButton7.getText().equals(jButton9.getText()) && !"".equals(jButton7.getText()) && !"".equals(jButton8.getText()) && !"".equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 1");
                    isPlay = false;
                }
            }
            else
            {
                //**********************************************************************
                if(jButton1.getText().equals(jButton2.getText()) && jButton2.getText().equals(jButton3.getText()) && jButton1.getText().equals(jButton3.getText()) && !"".equals(jButton1.getText()) && !"".equals(jButton2.getText()) && !"".equals(jButton3.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                if(jButton1.getText().equals(jButton4.getText()) && jButton4.getText().equals(jButton7.getText()) && jButton1.getText().equals(jButton7.getText()) && !"".equals(jButton1.getText()) && !"".equals(jButton4.getText()) && !"".equals(jButton7.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                if(jButton1.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton9.getText()) && jButton1.getText().equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton2.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton8.getText()) && jButton2.getText().equals(jButton8.getText()) && !"".equals(jButton2.getText()) && !"".equals(jButton5.getText()) && !"".equals(jButton8.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton3.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton7.getText()) && jButton3.getText().equals(jButton7.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                if(jButton3.getText().equals(jButton6.getText()) && jButton6.getText().equals(jButton9.getText()) && jButton3.getText().equals(jButton9.getText()) && !"".equals(jButton3.getText()) && !"".equals(jButton6.getText()) && !"".equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton4.getText().equals(jButton5.getText()) && jButton5.getText().equals(jButton6.getText()) && jButton4.getText().equals(jButton6.getText()) && !"".equals(jButton4.getText()) && !"".equals(jButton5.getText()) && !"".equals(jButton6.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
                //**********************************************************************
                if(jButton7.getText().equals(jButton8.getText()) && jButton8.getText().equals(jButton9.getText()) && jButton7.getText().equals(jButton9.getText()) && !"".equals(jButton7.getText()) && !"".equals(jButton8.getText()) && !"".equals(jButton9.getText()))
                {
                    Mensaje.setText("Ganador Jugador N° 2");
                    isPlay = false;
                }
            }
            
            if(count == 9 && "".equals(Mensaje.getText()))
            {
                Mensaje.setText("Juego terminado en TABLA");
                Jugador.setText("Juego Finalizado!");
            }
            if(!isPlay)
                Jugador.setText("Juego Finalizado!");
            
        }
        
    }
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(!"".equals(jButton1.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(1);
            Mensaje.setText("");
            this.VerificarGanador();
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if(!"".equals(jButton2.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(2);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(!"".equals(jButton3.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(3);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if(!"".equals(jButton4.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(4);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(!"".equals(jButton5.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(5);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if(!"".equals(jButton6.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(6);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if(!"".equals(jButton7.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(7);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if(!"".equals(jButton8.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(8);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if(!"".equals(jButton9.getText()))
        {
            Mensaje.setText("Elija otra posición");
        }
        else
        {
            this.MarcarJugada(9);
            Mensaje.setText("");
            this.VerificarGanador();
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
       jButton1.setText("");
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       Jugador.setText("Juega jugador 1");
       Mensaje.setText("");
       playing = 1;
       count = 0;
       isPlay = true;
       
    }//GEN-LAST:event_ResetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PruebaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PruebaI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}

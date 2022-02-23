/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author andre
 */
public class Casino extends javax.swing.JFrame {

    Ruleta Ruleta1 = new Ruleta();
    Ruleta Ruleta2 = new Ruleta();
    Ruleta Ruleta3 = new Ruleta();
    Temporizador Tempo = new Temporizador();

    String Valor1;
    String Valor2;
    String Valor3;
    int tiempo;

    /**
     * Creates new form Casino
     */
    public Casino() {
        initComponents();
        Ruleta1.Casilla = 1;
        Ruleta2.Casilla = 2;
        Ruleta3.Casilla = 3;
        Valor1 = "Val1";
        Valor2 = "Val2";
        Valor3 = "Val3";
        Ruleta1.start();
        Ruleta2.start();
        Ruleta3.start();
        Tempo.start();
        tiempo = 0;
        Tempo.startRunning();

        jPnlResult.setVisible(false);
    }

    public class Ruleta extends Thread {

        private boolean run = false;
        public int Casilla;

        public void startRunning() {
            run = true;
        }

        public void stopRunning() {
            run = false;
        }

        //Sobrescribir metodo run
        // El método run es llamado con la acción start() del hilo y a su vez se usa un hilo diferente al principal (main)
        @Override
        public void run() {
            Image img;
            int Espera = 500;
            while (Casilla == 1) {
                lbIcon1.setText("");
                while (run) {
                    Valor1 = Herramientas.Galeria();
                    img = new ImageIcon(this.getClass().getResource(Valor1)).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                    lbIcon1.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(Espera);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            while (Casilla == 2) {
                lbIcon2.setText("");
                while (run) {
                    Valor2 = Herramientas.Galeria();
                    img = new ImageIcon(this.getClass().getResource(Valor2)).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                    lbIcon2.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(Espera);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            while (Casilla == 3) {
                lbIcon3.setText("");
                while (run) {
                    Valor3 = Herramientas.Galeria();
                    img = new ImageIcon(this.getClass().getResource(Valor3)).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                    lbIcon3.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(Espera);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                Thread.sleep(Espera);
            } catch (InterruptedException ex) {
                Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class Temporizador extends Thread {
        private boolean run = false;

        public void startRunning() {
            run = true;
        }

        public void stopRunning() {
            run = false;
        }

        //Sobrescribir metodo run
        // El método run es llamado con la acción start() del hilo y a su vez se usa un hilo diferente al principal (main)
        @Override
        public void run() {
            while (run) {
                lblTiempo.setText("Tiempo de Juego " + tiempo + " segundos");
                tiempo++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public class Herramientas {

        public static String Galeria() {
            Random random = new Random();
            int num = random.nextInt(6) + 1;
            String path = "";
            switch (num) {
                case 1 ->
                    path = "/Imagenes/Ref1.png";
                case 2 ->
                    path = "/Imagenes/Ref2.jpeg";
                case 3 ->
                    path = "/Imagenes/Ref3.png";
                case 4 ->
                    path = "/Imagenes/Ref4.png";
                case 5 ->
                    path = "/Imagenes/Ref5.png";
                case 6 ->
                    path = "/Imagenes/Ref6.png";
            }
            return path;
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jPnlMain = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        lbIcon2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbIcon3 = new javax.swing.JLabel();
        lbIcon1 = new javax.swing.JLabel();
        btnStop1 = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnStop3 = new javax.swing.JButton();
        btnStop2 = new javax.swing.JButton();
        btnStopAll = new javax.swing.JButton();
        jPnlResult = new javax.swing.JPanel();
        lbResult = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CASINO REF");
        setBackground(new java.awt.Color(51, 153, 255));
        setBounds(new java.awt.Rectangle(5, 5, 5, 5));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 0, 102));
        setLocation(new java.awt.Point(0, 0));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);

        jPnlMain.setBackground(new java.awt.Color(0, 204, 102));
        jPnlMain.setForeground(new java.awt.Color(0, 153, 153));
        jPnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTiempo.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("Tiempo");
        jPnlMain.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 114, -1, 48));

        lbIcon2.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        lbIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ref5.png"))); // NOI18N
        lbIcon2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        lbIcon2.setPreferredSize(new java.awt.Dimension(240, 240));
        jPnlMain.add(lbIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 192, -1, -1));

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CASINO");
        jPnlMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 11, -1, 97));

        lbIcon3.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        lbIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ref3.png"))); // NOI18N
        lbIcon3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        lbIcon3.setPreferredSize(new java.awt.Dimension(240, 240));
        jPnlMain.add(lbIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 192, -1, -1));

        lbIcon1.setBackground(new java.awt.Color(0, 102, 102));
        lbIcon1.setFont(new java.awt.Font("Britannic Bold", 1, 10)); // NOI18N
        lbIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ref1.png"))); // NOI18N
        lbIcon1.setToolTipText("");
        lbIcon1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        lbIcon1.setPreferredSize(new java.awt.Dimension(240, 240));
        jPnlMain.add(lbIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnStop1.setBackground(new java.awt.Color(0, 153, 153));
        btnStop1.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        btnStop1.setForeground(new java.awt.Color(255, 255, 255));
        btnStop1.setText("Detener");
        btnStop1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStop1.setBorderPainted(false);
        btnStop1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStop1.setEnabled(false);
        btnStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop1ActionPerformed(evt);
            }
        });
        jPnlMain.add(btnStop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 436, 169, -1));

        btnStart.setBackground(new java.awt.Color(0, 81, 0));
        btnStart.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        btnStart.setForeground(new java.awt.Color(204, 204, 204));
        btnStart.setText("INICIAR");
        btnStart.setBorder(new javax.swing.border.MatteBorder(null));
        btnStart.setBorderPainted(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPnlMain.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 517, 213, 66));

        btnStop3.setBackground(new java.awt.Color(0, 153, 153));
        btnStop3.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        btnStop3.setForeground(new java.awt.Color(255, 255, 255));
        btnStop3.setText("Detener");
        btnStop3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStop3.setBorderPainted(false);
        btnStop3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStop3.setEnabled(false);
        btnStop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop3ActionPerformed(evt);
            }
        });
        jPnlMain.add(btnStop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 438, 169, -1));

        btnStop2.setBackground(new java.awt.Color(0, 153, 153));
        btnStop2.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        btnStop2.setForeground(new java.awt.Color(255, 255, 255));
        btnStop2.setText("Detener");
        btnStop2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStop2.setBorderPainted(false);
        btnStop2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStop2.setEnabled(false);
        btnStop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop2ActionPerformed(evt);
            }
        });
        jPnlMain.add(btnStop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 438, 169, -1));

        btnStopAll.setBackground(new java.awt.Color(204, 0, 51));
        btnStopAll.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        btnStopAll.setForeground(new java.awt.Color(204, 204, 204));
        btnStopAll.setText("DETERLOS");
        btnStopAll.setBorder(new javax.swing.border.MatteBorder(null));
        btnStopAll.setBorderPainted(false);
        btnStopAll.setEnabled(false);
        btnStopAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopAllActionPerformed(evt);
            }
        });
        jPnlMain.add(btnStopAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 517, 301, 66));

        jPnlResult.setBackground(new java.awt.Color(51, 0, 153));
        jPnlResult.setPreferredSize(new java.awt.Dimension(831, 580));

        lbResult.setBackground(new java.awt.Color(0, 0, 153));
        lbResult.setFont(new java.awt.Font("Papyrus", 3, 150)); // NOI18N
        lbResult.setForeground(new java.awt.Color(255, 51, 51));
        lbResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnReturn.setBackground(new java.awt.Color(51, 0, 153));
        btnReturn.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("OK");
        btnReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReturn.setBorderPainted(false);
        btnReturn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlResultLayout = new javax.swing.GroupLayout(jPnlResult);
        jPnlResult.setLayout(jPnlResultLayout);
        jPnlResultLayout.setHorizontalGroup(
            jPnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPnlResultLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPnlResultLayout.setVerticalGroup(
            jPnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlResultLayout.createSequentialGroup()
                .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 846, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jPnlResult, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlResult, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        // TODO add your handling code here:
        Ruleta1.stopRunning();
        btnStop1.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        Ruleta1.startRunning();
        Ruleta2.startRunning();
        Ruleta3.startRunning();
        btnStop1.setEnabled(true);
        btnStop2.setEnabled(true);
        btnStop3.setEnabled(true);
        btnStopAll.setEnabled(true);
        Resultado();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop3ActionPerformed
        // TODO add your handling code here:
        Ruleta3.stopRunning();
        btnStop3.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_btnStop3ActionPerformed

    private void btnStop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop2ActionPerformed
        // TODO add your handling code here:
        Ruleta2.stopRunning();
        btnStop2.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_btnStop2ActionPerformed

    private void btnStopAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopAllActionPerformed
        // TODO add your handling code here:
        Ruleta1.stopRunning();
        Ruleta2.stopRunning();
        Ruleta3.stopRunning();
        btnStop1.setEnabled(false);
        btnStop2.setEnabled(false);
        btnStop3.setEnabled(false);
        btnStopAll.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_btnStopAllActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        jPnlResult.setVisible(false);
        jPnlMain.setVisible(true);
        lbResult.setIcon(null);
    }//GEN-LAST:event_btnReturnActionPerformed

    public void Resultado() {
        if (!Ruleta1.run && !Ruleta2.run && !Ruleta3.run) {
            btnStopAll.setEnabled(false);
            jPnlMain.setVisible(false);
            if (Valor1.equals(Valor2) && Valor1.equals(Valor3)) {
                Image img;
                img = new ImageIcon(this.getClass().getResource("/Imagenes/Winner.jpg")).getImage();
                img = img.getScaledInstance(800, 500, java.awt.Image.SCALE_SMOOTH);
                lbResult.setIcon(new ImageIcon(img));
                jPnlResult.setVisible(true);
            } else {
                Image img;
                lbResult.setText("Perdiste!!");
                jPnlResult.setVisible(true);
            }
        }
    }

    
    
    
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
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casino().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnStop2;
    private javax.swing.JButton btnStop3;
    private javax.swing.JButton btnStopAll;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPnlMain;
    private javax.swing.JPanel jPnlResult;
    private javax.swing.JLabel lbIcon1;
    private javax.swing.JLabel lbIcon2;
    private javax.swing.JLabel lbIcon3;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}

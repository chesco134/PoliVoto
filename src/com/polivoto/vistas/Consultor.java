/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polivoto.vistas;

/**
 *
 * @author azaraf
 */
public class Consultor extends javax.swing.JFrame {

    /**
     * Creates new form Consultor
     */
    public Consultor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        botonMenu = new javax.swing.JLabel();
        Resultados = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        iconoBarras = new javax.swing.JLabel();
        iconoTabla = new javax.swing.JLabel();
        iconoPastel = new javax.swing.JLabel();
        iconoPoliVoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(977, 600));

        panelHeader.setBackground(new java.awt.Color(134, 36, 31));

        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/lateral.png"))); // NOI18N
        botonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Resultados.setBackground(new java.awt.Color(250, 250, 250));
        Resultados.setLayout(new java.awt.CardLayout());

        panelLateral.setVisible(banderaPanelLateral);
        panelLateral.setBackground(new java.awt.Color(240, 240, 240));

        iconoBarras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        iconoBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/bars.png"))); // NOI18N
        iconoBarras.setText("VER GRÁFICA DE BARRAS");
        iconoBarras.setIconTextGap(12);
        iconoBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoBarrasMouseEntered(evt);
            }
        });

        iconoTabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        iconoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/chart.png"))); // NOI18N
        iconoTabla.setText("VER TABLA");
        iconoTabla.setIconTextGap(12);

        iconoPastel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        iconoPastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/pie.png"))); // NOI18N
        iconoPastel.setText("VER GRÁFICA DE PASTEL");
        iconoPastel.setIconTextGap(12);

        iconoPoliVoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/header.png"))); // NOI18N

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoBarras)
                    .addComponent(iconoPastel)
                    .addComponent(iconoTabla)
                    .addComponent(iconoPoliVoto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoPoliVoto)
                .addGap(51, 51, 51)
                .addComponent(iconoBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconoPastel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconoTabla)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMouseClicked
        panelLateral.setVisible(!banderaPanelLateral);
        banderaPanelLateral = !banderaPanelLateral;
        
    }//GEN-LAST:event_botonMenuMouseClicked

    private void iconoBarrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBarrasMouseEntered
        
    }//GEN-LAST:event_iconoBarrasMouseEntered

    public void iniciar() {
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
            java.util.logging.Logger.getLogger(Consultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Consultor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resultados;
    private javax.swing.JLabel botonMenu;
    private javax.swing.JLabel iconoBarras;
    private javax.swing.JLabel iconoPastel;
    private javax.swing.JLabel iconoPoliVoto;
    private javax.swing.JLabel iconoTabla;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLateral;
    // End of variables declaration//GEN-END:variables
    private boolean banderaPanelLateral = false;

}

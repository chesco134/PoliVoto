/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polivoto.vistas;

import com.polivoto.entidades.AccionesConsultor;
import com.polivoto.logica.ConstruirDatos;
import com.polivoto.main.BackBone;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.ImageIcon;
import org.json.JSONException;
import com.polivoto.threading.IncommingRequestHandler;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author David Vargas
 */
public class Acceso extends javax.swing.JFrame {

    public static AccionesConsultor AC;
    private final BackBone padre;
    /**
     * Creates new form Results
     */
    
    public Acceso(BackBone padre) {
        this.padre = padre;
        initComponents();
        PromptSupport.setPrompt("Usuario", usrTextField);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, usrTextField);
        PromptSupport.setPrompt("Contraseña", pwdTextField);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, pwdTextField);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContacto = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        usrTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();
        boton = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPoliVoto = new javax.swing.JMenu();
        jmItemSalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jmContacto = new javax.swing.JMenuItem();

        setLocationRelativeTo(null);
        jContacto.setTitle("PoliVoto Electrónico");
        jContacto.setBackground(new java.awt.Color(255, 255, 255));
        jContacto.setMinimumSize(new java.awt.Dimension(437, 260));
        jContacto.setResizable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/logo.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html> <h2>PoliVoto Electrónico &copy 2015</h2>  <p>Copia exclusiva para la Unidad Profesional <p>Interdisciplinaria en Ingenierías y Ciencias <p>Administrativas del Instituto Politécnico <p>Nacional. <p>Contacto y ayuda:</p>  <p>David A. Vargas: +52 (55) 2989 2764  <p>Juan Capiz: +52 (55) 1379 0281  <p>Alfonso De La Rosa: +52 (55) 4892 5376 <p>correo: contacto@votacionesipn.com</html>");

        javax.swing.GroupLayout jContactoLayout = new javax.swing.GroupLayout(jContacto.getContentPane());
        jContacto.getContentPane().setLayout(jContactoLayout);
        jContactoLayout.setHorizontalGroup(
            jContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jContactoLayout.setVerticalGroup(
            jContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jContactoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(63, 63, 63))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar");
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/com/polivoto/imagenes/icono.png")).getImage());
        setMinimumSize(new java.awt.Dimension(400, 410));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setSize(new java.awt.Dimension(400, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/lodo-mediano.png"))); // NOI18N

        usrTextField.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        usrTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(134, 36, 31)));

        pwdTextField.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        pwdTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(134, 36, 31)));

        boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/state1.png"))); // NOI18N
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usrTextField)
                    .addComponent(pwdTextField)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(80, 80, 80)
                .addComponent(usrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuPoliVoto.setText("PoliVoto Electrónico");

        jmItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        jmItemSalir.setText("Salir");
        jmItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemSalirActionPerformed(evt);
            }
        });
        jMenuPoliVoto.add(jmItemSalir);

        jMenuBar.add(jMenuPoliVoto);

        jMenuAyuda.setText("Ayuda");

        jmContacto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jmContacto.setText("Contacto");
        jmContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContactoActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jmContacto);

        jMenuBar.add(jMenuAyuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmItemSalirActionPerformed

    private void jmContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContactoActionPerformed
        jContacto.setVisible(true);
    }//GEN-LAST:event_jmContactoActionPerformed

    private void botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseEntered
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/state2.png")));
    }//GEN-LAST:event_botonMouseEntered

    private void botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseExited
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/state1.png")));
    }//GEN-LAST:event_botonMouseExited

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
        botonClicked();
        
    }//GEN-LAST:event_botonMouseClicked

    private void botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMousePressed
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/state3.png")));
    }//GEN-LAST:event_botonMousePressed

    private void botonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseReleased
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/state2.png")));
    }//GEN-LAST:event_botonMouseReleased

    private boolean logear_como_Consultor(String host, String pwd) {
        boolean success = false;
        try {
            AC = new AccionesConsultor(host, pwd);
            AC.consultaPreguntas();
            success = true;
            new IncommingRequestHandler().start(); // We need to keep track of this object.
        } catch (IOException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton;
    private javax.swing.JDialog jContacto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuPoliVoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmContacto;
    private javax.swing.JMenuItem jmItemSalir;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JTextField usrTextField;
    // End of variables declaration//GEN-END:variables

    private void botonClicked() {
        System.out.println("Boton Ingresar clicked");
        char[] input = pwdTextField.getPassword();
        String usr = usrTextField.getText();
        String res = ConstruirDatos.loggear(usr, new String(input));
        switch (res){
            case ConstruirDatos.SUCCESSFUL:
                this.setVisible(false);
                padre.iniciarAnalista();
                break;
                
            case ConstruirDatos.BAD_CONNECTION:
                sinConexion();
                /**
                 * DEBUG -- BORRAR!!!
                 */
                this.setVisible(false);
                padre.iniciarAnalista();
                /**
                 * DEBUG -- BORRAR!!!
                 */
                break;
                
            default:
                usuarioInvalido();
                break;
        }
        //Zero out the possible password, for security.
        Arrays.fill(input, '0');
        pwdTextField.selectAll();
        
    }
    
    private void usuarioInvalido(){
        JOptionPane.showMessageDialog(
                null, 
                "Usuario inválido o Contraseña incorrecta", 
                "Error", 
                JOptionPane.OK_OPTION,
                new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/error.png"))
        );
    }
    
    private void sinConexion(){
        JOptionPane.showMessageDialog(
                null, 
                "Es imposible conectarse al servidor.\nRevise la conexión.", 
                "Error", 
                JOptionPane.OK_OPTION,
                new javax.swing.ImageIcon(getClass().getResource("/com/polivoto/imagenes/alert.png"))
        );
    }

}
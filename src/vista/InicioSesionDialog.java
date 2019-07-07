/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.SistemaMuseo;
import disenno.ImagenFondo;
import disenno.TextPrompt;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Guia;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * @author Victor
 */
public class InicioSesionDialog extends javax.swing.JDialog {

    private MenuPrincipalFrame mpf;
    private SistemaMuseo sm;

    /**
     * Creates new form IniciarSesionDialog
     *
     * @param parent
     * @param modal
     */
    public InicioSesionDialog(MenuPrincipalFrame parent, boolean modal) {
        super(parent, modal);
        mpf = parent;

        initComponents();
        componentesIniciales();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(InicioSesionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesionDialog dialog = new InicioSesionDialog(new MenuPrincipalFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        // TODO add your handling code here:
        iniciarSesion();
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        botonIniciarSesion = new javax.swing.JButton();
        infoErrorIniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar sesión");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setOpaque(false);

        campoDNI.setName(""); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoDNI.getAccessibleContext().setAccessibleDescription("Hola");

        botonIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        infoErrorIniciar.setBackground(new java.awt.Color(255, 255, 255));
        infoErrorIniciar.setForeground(new java.awt.Color(255, 0, 102));
        infoErrorIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoErrorIniciar.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(botonIniciarSesion)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(infoErrorIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(infoErrorIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botonIniciarSesion)
                                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JLabel infoErrorIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    // ############################# COMPONENTES INICIALES #############################
    private void componentesIniciales() {
        botonIniciarSesion.requestFocus();
        TextPrompt holder1 = new TextPrompt("DNI (Ej. 12345678X)", campoDNI);
        holder1.changeAlpha(0.5f);
        TextPrompt holder2 = new TextPrompt("Contraseña", campoPassword);
        holder2.changeAlpha(0.5f);
        conexionBD();
        imagenFondo();

        limiteDNI(campoDNI);
    }

    // ############################# INICIO DE SESIÓN #############################
    private void iniciarSesion() {
        String dni = campoDNI.getText();
        String password = new String(campoPassword.getPassword());

        boolean camposRellenados = (!dni.equals("") || !password.equals(""));
        boolean comprobarCredenciales = sm.comprobarCredenciales(dni, password);
        if (camposRellenados && comprobarCredenciales) {
            String rol = sm.obtenerRol(dni);

            switch (rol) {

                case "cliente": // Se comprueba si el dni es de un cliente
                    // Se instancia un cliente y se carga con los datos del cliente cuyo dni coincida con el pasado por parametro
                    Cliente c = sm.cargarCliente(dni);
                    if (c != null) {
                        // Se instancia el menú de usuario y se hace visible
                        MenuUsuarioFrame muf = new MenuUsuarioFrame(c);
                        muf.setVisible(true);
                    }
                    break;

                case "guia": // Se comprueba si el dni es de un guia
                    // Se instancia un guia y se carga con los datos del guia cuyo dni coincida con el pasado por parametro
                    Guia g = sm.cargarGuia(dni);
                    if (g != null) {
                        // Se instancia el menú de guia y se hace visible
                        MenuGuiaFrame mgf = new MenuGuiaFrame(g);
                        mgf.setVisible(true);
                    }
                    break;

                case "administrador": // Se comprueba si el dni es de un administrador
                    // Se instancia un administrador y se carga con los datos del cliente cuyo dni coincida con el pasado por parametro
                    Administrador a = sm.cargarAdministrador(dni);
                    if (a != null) {
                        // Se instancia el menú de administrador y se hace visible
                        MenuAdministradorFrame maf = new MenuAdministradorFrame(a);
                        maf.setVisible(true);
                    }
                    break;

                default:
                    final int SALIR = 0;
                    JOptionPane.showMessageDialog(null, "Rol del usuario no detectado, póngase en contacto con los creadores del programa", "Error crítico", JOptionPane.ERROR_MESSAGE);
                    System.exit(SALIR);
                    break;
            }

            // Se cierra la vista actual y se hace invisible el menú principal
            dispose();
            mpf.setVisible(false);
        } else {
            infoErrorIniciar.setText("Usuario o contraseña incorrectos");
            infoErrorIniciar.setOpaque(true);
            infoErrorIniciar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 102)));
            campoPassword.setText("");
        }
    }

    // ***************************** Validación de datos *****************************
    private void limiteDNI(JTextField jtf) {
        final int limite = 8;
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (jtf.getText().length() < limite) {
                    if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                            || (c == KeyEvent.VK_DELETE))) {
                        getToolkit().beep();
                        e.consume();
                    }
                } else if (jtf.getText().length() == limite) {
                    if (!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE)
                            && !(c == KeyEvent.VK_BACK_SPACE)) {
                        getToolkit().beep();
                        e.consume();
                    }
                } else {
                    e.consume();
                }
            }
        });
    }

    // ############################# RECURSOS #############################
    private void imagenFondo() {
        try {
            ImagenFondo fondo = new ImagenFondo(ImageIO.read(getClass().getResource("/recursos/imagenes/fondos/fondoSecundario.png")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/imagenes/iconos/iconoMuseoApp.png"));
    }

    // ############################# CONEXIÓN BASE DE DATOS #############################
    private void conexionBD() {
        sm = new SistemaMuseo();
    }

}

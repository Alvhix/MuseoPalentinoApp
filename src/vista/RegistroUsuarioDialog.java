/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.SistemaMuseo;
import disenno.ImagenFondo;
import disenno.TextPrompt;
import modelo.Cliente;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author Victor
 */
public class RegistroUsuarioDialog extends javax.swing.JDialog {

    private MenuPrincipalFrame mpf;
    private SistemaMuseo sm;

    /**
     * Creates new form IniciarSesionDialog
     *
     * @param parent
     * @param modal
     */
    RegistroUsuarioDialog(MenuPrincipalFrame parent, boolean modal) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegistroUsuarioDialog dialog = new RegistroUsuarioDialog(new MenuPrincipalFrame(), true);
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

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        registrarUsuario();
    }//GEN-LAST:event_botonRegistrarActionPerformed

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
        campoNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoPassword1 = new javax.swing.JPasswordField();
        campoPassword2 = new javax.swing.JPasswordField();
        oblig1 = new javax.swing.JLabel();
        oblig2 = new javax.swing.JLabel();
        oblig3 = new javax.swing.JLabel();
        oblig4 = new javax.swing.JLabel();
        oblig5 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        infoErrorRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro usuario");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setOpaque(false);

        campoDNI.setName(""); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña (mín. 8 caracteres):");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Introduzca los siguientes datos:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmar contraseña:");

        oblig1.setBackground(new java.awt.Color(255, 255, 255));
        oblig1.setForeground(new java.awt.Color(255, 0, 102));
        oblig1.setText(" ");

        oblig2.setBackground(new java.awt.Color(255, 255, 255));
        oblig2.setForeground(new java.awt.Color(255, 0, 102));
        oblig2.setText(" ");

        oblig3.setBackground(new java.awt.Color(255, 255, 255));
        oblig3.setForeground(new java.awt.Color(255, 0, 102));
        oblig3.setText(" ");

        oblig4.setBackground(new java.awt.Color(255, 255, 255));
        oblig4.setForeground(new java.awt.Color(255, 0, 102));
        oblig4.setText(" ");

        oblig5.setBackground(new java.awt.Color(255, 255, 255));
        oblig5.setForeground(new java.awt.Color(255, 0, 102));
        oblig5.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(campoNombre)
                                                        .addComponent(campoTelefono)
                                                        .addComponent(campoPassword1)
                                                        .addComponent(campoPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                        .addComponent(campoDNI))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(oblig4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(oblig3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(oblig2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(oblig1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(oblig5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(oblig1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(oblig2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(oblig3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(campoPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oblig4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(campoPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oblig5))
                                .addContainerGap())
        );

        campoDNI.getAccessibleContext().setAccessibleDescription("Hola");

        botonRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrarse");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        infoErrorRegistro.setBackground(new java.awt.Color(255, 255, 255));
        infoErrorRegistro.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(infoErrorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(infoErrorRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(botonRegistrar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonRegistrar)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPasswordField campoPassword1;
    private javax.swing.JPasswordField campoPassword2;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel infoErrorRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oblig1;
    private javax.swing.JLabel oblig2;
    private javax.swing.JLabel oblig3;
    private javax.swing.JLabel oblig4;
    private javax.swing.JLabel oblig5;
    // End of variables declaration//GEN-END:variables

    private void registrarUsuario() {
        if (validarDatos()) {
            Cliente c = new Cliente(campoNombre.getText(), campoDNI.getText(), Integer.parseInt(campoTelefono.getText()));
            sm.nuevoCliente(c, new String(campoPassword1.getPassword()));
            // Se instancia el menú de usuario y se hace visible
            MenuUsuarioFrame muf = new MenuUsuarioFrame(sm.cargarCliente(c.getDNI()));
            muf.setVisible(true);
            // Se cierra la vista actual y se hace invisible el menú principal
            dispose();
            mpf.setVisible(false);
        }
    }

    private boolean validarDatos() {
        boolean correcto = false;
        String dni = campoDNI.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String password = new String(campoPassword1.getPassword());
        String passwordConfirmar = new String(campoPassword2.getPassword());
        String texto = "";

        oblig1.setText(" ");
        oblig2.setText(" ");
        oblig3.setText(" ");
        oblig4.setText(" ");
        oblig5.setText(" ");

        if (!nombre.equals("") && validarTelefono(telefono) && validarPassword(password) && password.equals(passwordConfirmar)) {
            if (sm.comprobarUsuariosRegistrados(dni)) {
                texto = "¡Ya existe un usuario registrado con ese DNI!";
            } else {
                correcto = true;
            }
        } else {
            boolean campoVacio = false;

            if (dni.equals("")) {
                oblig1.setText("*");
                campoVacio = true;
            }

            if (nombre.equals("")) {
                oblig2.setText("*");
                campoVacio = true;
            }

            if (telefono.equals("")) {
                oblig3.setText("*");
                campoVacio = true;
            } else if (!validarTelefono(telefono)) {
                texto = texto + "El número de teléfono introducido no es válido.<br>";
            }

            if (password.equals("")) {
                oblig4.setText("*");
                oblig5.setText("*");
                campoVacio = true;
            } else {
                if (!validarPassword(password)) {
                    texto = texto + "La contraseña debe tener al menos 8 caracteres.<br>";
                }

                if (!password.equals(passwordConfirmar)) {
                    texto = texto + "Las contraseñas no coinciden.<br>";
                }
            }

            if (campoVacio) {
                texto = texto + "(*) Campo vacío.";
            }

            campoPassword1.setText("");
            campoPassword2.setText("");
        }

        infoErrorRegistro.setText("<html><body>" + texto + "</body></html>");
        infoErrorRegistro.setOpaque(true);
        infoErrorRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 102)));
        return correcto;
    }

    private static boolean validarTelefono(String tlf) {
        boolean correcto = false;
        int longitud = tlf.length();

        if (longitud == 9) {
            correcto = true;
        }

        return correcto;
    }

    private static boolean validarPassword(String pw) {
        boolean correcto = false;
        int longitud = pw.length();

        if (longitud >= 8) {
            correcto = true;
        }

        return correcto;
    }

    private void soloLetras(JTextField jtf) {
        final int limite = 30;
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (jtf.getText().length() < limite) {
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

    private void limiteTelefono(JTextField jtf) {
        final int limite = 9;
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
                } else {
                    e.consume();
                }
            }
        });
    }

    private void imagenFondo() {
        try {
            ImagenFondo fondo = new ImagenFondo(ImageIO.read(new File("src/recursos/imagenes/fondos/fondoSecundario.png")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void conexionBD() {
        sm = new SistemaMuseo();
    }

    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/imagenes/iconos/iconoMuseoApp.png"));
    }

    private void componentesIniciales() {
        conexionBD();
        imagenFondo();
        limiteDNI(campoDNI);
        soloLetras(campoNombre);
        limiteTelefono(campoTelefono);

        botonRegistrar.requestFocus();
        TextPrompt holder1 = new TextPrompt("DNI (Ej. 12345678X)", campoDNI);
        holder1.changeAlpha(0.5f);
        TextPrompt holder2 = new TextPrompt("Nombre", campoNombre);
        holder2.changeAlpha(0.5f);
        TextPrompt holder3 = new TextPrompt("Teléfono", campoTelefono);
        holder3.changeAlpha(0.5f);
        TextPrompt holder4 = new TextPrompt("Contraseña", campoPassword1);
        holder4.changeAlpha(0.5f);
        TextPrompt holder5 = new TextPrompt("Repita la contraseña", campoPassword2);
        holder5.changeAlpha(0.5f);
    }
}

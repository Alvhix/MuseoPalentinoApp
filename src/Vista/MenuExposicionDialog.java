/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Interfaz.ImagenFondo;
import Modelo.Exposicion;
import Modelo.Obra;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

import static java.awt.Frame.HAND_CURSOR;

/**
 * @author Victor, Mario y Alberto
 */
public class MenuExposicionDialog extends javax.swing.JDialog {

    private Exposicion exposicion;
    private List<Obra> obras;
    private int posicion;

    /**
     * Creates new form MenuObraDialog
     *
     * @param parent
     * @param modal
     * @param exposicion
     */
    MenuExposicionDialog(java.awt.Frame parent, boolean modal, Exposicion exposicion) {
        super(parent, modal);
        this.exposicion = exposicion;
        obras = exposicion.getObras();
        posicion = 0;
        initComponents();
        componentesIniciales();
    }

    private MenuExposicionDialog() {

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
            java.util.logging.Logger.getLogger(MenuExposicionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuExposicionDialog dialog = new MenuExposicionDialog();
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

    private void botonSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseClicked
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaderhover.png"))));
    }//GEN-LAST:event_botonSiguienteMouseClicked

    private void botonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseEntered
        // TODO add your handling code here:
        botonSiguiente.setCursor(new Cursor(HAND_CURSOR));
        botonSiguiente.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaderhover.png"))));
    }//GEN-LAST:event_botonSiguienteMouseEntered

    private void botonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseExited
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechader.png"))));
    }//GEN-LAST:event_botonSiguienteMouseExited

    private void botonSiguienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMousePressed
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaderpressed.png"))));
    }//GEN-LAST:event_botonSiguienteMousePressed

    private void botonSiguienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseReleased
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_botonSiguienteMouseReleased

    private void botonAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseClicked
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaizqhover.png"))));
    }//GEN-LAST:event_botonAnteriorMouseClicked

    private void botonAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseEntered
        // TODO add your handling code here:
        botonAnterior.setCursor(new Cursor(HAND_CURSOR));
        botonAnterior.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaizqhover.png"))));
    }//GEN-LAST:event_botonAnteriorMouseEntered

    private void botonAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseExited
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaizq.png"))));
    }//GEN-LAST:event_botonAnteriorMouseExited

    private void botonAnteriorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMousePressed
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon(getClass().getResource(("/recursos/imagenes/iconos/flechaizqpressed.png"))));
    }//GEN-LAST:event_botonAnteriorMousePressed

    private void botonAnteriorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseReleased
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_botonAnteriorMouseReleased

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSiguiente = new javax.swing.JLabel();
        botonAnterior = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JLabel();
        campoEstilo = new javax.swing.JLabel();
        campoAnno = new javax.swing.JLabel();
        campoTipo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Obras de Arte");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setOpaque(false);

        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/iconos/flechader.png"))); // NOI18N
        botonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSiguienteMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseReleased(evt);
            }
        });

        botonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/iconos/flechaizq.png"))); // NOI18N
        botonAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAnteriorMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAnteriorMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAnteriorMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnteriorMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAnteriorMouseReleased(evt);
            }
        });

        jPanel3.setOpaque(false);

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAnterior)
                                .addGap(22, 22, 22)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(botonSiguiente))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botonAnterior)
                                        .addComponent(botonSiguiente))
                                .addContainerGap(76, Short.MAX_VALUE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Autor:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estilo:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Año:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Titulo:");

        campoAutor.setBackground(new java.awt.Color(255, 255, 255));
        campoAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoAutor.setForeground(new java.awt.Color(255, 255, 255));
        campoAutor.setText(" ");

        campoEstilo.setBackground(new java.awt.Color(255, 255, 255));
        campoEstilo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEstilo.setForeground(new java.awt.Color(255, 255, 255));
        campoEstilo.setText(" ");

        campoAnno.setBackground(new java.awt.Color(255, 255, 255));
        campoAnno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoAnno.setForeground(new java.awt.Color(255, 255, 255));
        campoAnno.setText(" ");

        campoTipo.setBackground(new java.awt.Color(255, 255, 255));
        campoTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoTipo.setForeground(new java.awt.Color(255, 255, 255));
        campoTipo.setText(" ");

        campoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        campoTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        campoTitulo.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoAnno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(campoEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(campoAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAnterior;
    private javax.swing.JLabel botonSiguiente;
    private javax.swing.JLabel campoAnno;
    private javax.swing.JLabel campoAutor;
    private javax.swing.JLabel campoEstilo;
    private javax.swing.JLabel campoTipo;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    // ############################# COMPONENTES INICIALES #############################
    private void componentesIniciales() {
        actualizarCampos();
        imagenFondo();
    }

    // ############################# MÉTODOS EXPOSICIÓN #############################
    // ***************************** Actualizar exposiciones *****************************
    private void actualizarCampos() {
        imagen.setIcon(new ImageIcon(getClass().getResource("/" + obras.get(posicion).getRutaImagen())));
        campoTitulo.setText(obras.get(posicion).getTitulo());
        campoAutor.setText(obras.get(posicion).getAutor());
        campoEstilo.setText(obras.get(posicion).getEstilo());
        campoAnno.setText(String.valueOf(obras.get(posicion).getAnno()));
        campoTipo.setText(obras.get(posicion).getTipo());
    }

    private void siguiente() {
        posicion++;
        if (posicion == obras.size()) {
            posicion = 0;
        }
        actualizarCampos();
    }

    private void anterior() {
        posicion--;
        if (posicion < 0) {
            posicion = obras.size() - 1;
        }
        actualizarCampos();
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

}

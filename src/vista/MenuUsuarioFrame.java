/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.SistemaMuseo;
import modelo.Cliente;
import disenno.ImagenFondo;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Exposicion;

/**
 *
 * @author Victor
 */
public class MenuUsuarioFrame extends javax.swing.JFrame {

    private Cliente c;
    private List<Exposicion> exposiciones;
    private Exposicion expo1;
    private Exposicion expo2;
    private int posicion1;
    private int posicion2;
    private SistemaMuseo sm;

    /**
     * Creates new form MenuPrincipalFrame
     *
     * @param c
     */
    public MenuUsuarioFrame(Cliente c) {
        conexionBD();
        this.c = c;
        exposiciones = sm.cargarExposiciones();
        posicion1 = 0;
        posicion2 = posicion1 + 1;
        initComponents();
        componentesIniciales();
    }

    public MenuUsuarioFrame() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSesion1 = new javax.swing.JPanel();
        botonCerrarSesion = new javax.swing.JButton();
        botonEntrada = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        infoSesion = new javax.swing.JLabel();
        infoUsuario = new javax.swing.JLabel();
        panelMuestra = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelExpo1 = new javax.swing.JPanel();
        panelExposicion1 = new javax.swing.JPanel();
        labelNumeroObras1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        imagen1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        panelExpo2 = new javax.swing.JPanel();
        panelExposicion2 = new javax.swing.JPanel();
        labelNumeroObras2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        imagen2 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JLabel();
        botonAnterior = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuDatos = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        cambiarContraseñaMenu = new javax.swing.JMenuItem();
        menuReserva = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Museo Palentino - Menú de Usuario");
        setIconImage(getIconImage());
        setResizable(false);

        panelSesion1.setOpaque(false);

        botonCerrarSesion.setText("Cerrar sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        botonEntrada.setText("Entrada");
        botonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSesion1Layout = new javax.swing.GroupLayout(panelSesion1);
        panelSesion1.setLayout(panelSesion1Layout);
        panelSesion1Layout.setHorizontalGroup(
            panelSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSesion1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(panelSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        panelSesion1Layout.setVerticalGroup(
            panelSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSesion1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(botonCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(botonEntrada)
                .addContainerGap())
        );

        jPanel.setOpaque(false);

        infoSesion.setForeground(new java.awt.Color(255, 255, 255));
        infoSesion.setText("Sesión inciada como: ");

        infoUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        infoUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(infoSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoSesion))
                .addContainerGap())
        );

        panelMuestra.setOpaque(false);

        jPanel6.setOpaque(false);

        panelExpo1.setOpaque(false);

        panelExposicion1.setOpaque(false);
        panelExposicion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExposicion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExposicion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExposicion1MouseExited(evt);
            }
        });

        labelNumeroObras1.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroObras1.setText("Nº Obras: ");

        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        labelNombre1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre1.setText("Exposición ");

        javax.swing.GroupLayout panelExposicion1Layout = new javax.swing.GroupLayout(panelExposicion1);
        panelExposicion1.setLayout(panelExposicion1Layout);
        panelExposicion1Layout.setHorizontalGroup(
            panelExposicion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExposicion1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelExposicion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelExposicion1Layout.createSequentialGroup()
                        .addComponent(labelNumeroObras1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelExposicion1Layout.setVerticalGroup(
            panelExposicion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExposicion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombre1)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelNumeroObras1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelExpo1Layout = new javax.swing.GroupLayout(panelExpo1);
        panelExpo1.setLayout(panelExpo1Layout);
        panelExpo1Layout.setHorizontalGroup(
            panelExpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(panelExpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExpo1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelExposicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelExpo1Layout.setVerticalGroup(
            panelExpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
            .addGroup(panelExpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExpo1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelExposicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelExpo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelExpo2.setOpaque(false);

        panelExposicion2.setOpaque(false);
        panelExposicion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExposicion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExposicion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExposicion2MouseExited(evt);
            }
        });

        labelNumeroObras2.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroObras2.setText("Nº Obras: ");

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        labelNombre2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre2.setText("Exposición ");

        javax.swing.GroupLayout panelExposicion2Layout = new javax.swing.GroupLayout(panelExposicion2);
        panelExposicion2.setLayout(panelExposicion2Layout);
        panelExposicion2Layout.setHorizontalGroup(
            panelExposicion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExposicion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelExposicion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelExposicion2Layout.createSequentialGroup()
                        .addComponent(labelNumeroObras2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(labelNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelExposicion2Layout.setVerticalGroup(
            panelExposicion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExposicion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombre2)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelNumeroObras2)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelExpo2Layout = new javax.swing.GroupLayout(panelExpo2);
        panelExpo2.setLayout(panelExpo2Layout);
        panelExpo2Layout.setHorizontalGroup(
            panelExpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(panelExpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExpo2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelExposicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelExpo2Layout.setVerticalGroup(
            panelExpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
            .addGroup(panelExpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExpo2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelExposicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelExpo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(panelExpo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelExpo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelExpo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout panelMuestraLayout = new javax.swing.GroupLayout(panelMuestra);
        panelMuestra.setLayout(panelMuestraLayout);
        panelMuestraLayout.setHorizontalGroup(
            panelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuestraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonAnterior)
                .addGap(54, 54, 54)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botonSiguiente)
                .addGap(38, 38, 38))
        );
        panelMuestraLayout.setVerticalGroup(
            panelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMuestraLayout.createSequentialGroup()
                .addGroup(panelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMuestraLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMuestraLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(botonAnterior))
                    .addGroup(panelMuestraLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(botonSiguiente)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jMenu2.setText("Mi perfil");

        menuDatos.setText("Mis datos");
        jMenu2.add(menuDatos);

        menuCerrarSesion.setText("Cerrar sesión");
        jMenu2.add(menuCerrarSesion);

        cambiarContraseñaMenu.setText("Cambiar Contraseña");
        cambiarContraseñaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraseñaMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cambiarContraseñaMenu);

        jMenuBar1.add(jMenu2);

        menuReserva.setText("Opciones de compra");
        menuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuReserva);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(panelMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void menuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservaActionPerformed
        // TODO add your handling code here:
        opcionesCompra();
    }//GEN-LAST:event_menuReservaActionPerformed

    private void botonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntradaActionPerformed
        // TODO add your handling code here:
        opcionesCompra();
    }//GEN-LAST:event_botonEntradaActionPerformed

    private void panelExposicion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion1MouseClicked
        // TODO add your handling code here:
        mostrarExposicion(expo1);
    }//GEN-LAST:event_panelExposicion1MouseClicked

    private void panelExposicion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion1MouseEntered
        // TODO add your handling code here:
        panelExposicion1.setCursor(new Cursor(HAND_CURSOR));
        panelExposicion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 240, 242)));
    }//GEN-LAST:event_panelExposicion1MouseEntered

    private void panelExposicion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion1MouseExited
        // TODO add your handling code here:
        panelExposicion1.setBorder(null);
    }//GEN-LAST:event_panelExposicion1MouseExited

    private void panelExposicion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion2MouseClicked
        // TODO add your handling code here:
        mostrarExposicion(expo2);
    }//GEN-LAST:event_panelExposicion2MouseClicked

    private void panelExposicion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion2MouseEntered
        // TODO add your handling code here:
        panelExposicion2.setCursor(new Cursor(HAND_CURSOR));
        panelExposicion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 240, 242)));
    }//GEN-LAST:event_panelExposicion2MouseEntered

    private void panelExposicion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExposicion2MouseExited
        // TODO add your handling code here:
        panelExposicion2.setBorder(null);
    }//GEN-LAST:event_panelExposicion2MouseExited

    private void botonSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseClicked
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaderhover.png"));
    }//GEN-LAST:event_botonSiguienteMouseClicked

    private void botonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseEntered
        // TODO add your handling code here:
        botonSiguiente.setCursor(new Cursor(HAND_CURSOR));
        botonSiguiente.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaderhover.png"));
    }//GEN-LAST:event_botonSiguienteMouseEntered

    private void botonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseExited
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechader.png"));
    }//GEN-LAST:event_botonSiguienteMouseExited

    private void botonSiguienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMousePressed
        // TODO add your handling code here:
        botonSiguiente.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaderpressed.png"));
    }//GEN-LAST:event_botonSiguienteMousePressed

    private void botonSiguienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseReleased
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_botonSiguienteMouseReleased

    private void botonAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseClicked
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaizqhover.png"));
    }//GEN-LAST:event_botonAnteriorMouseClicked

    private void botonAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseEntered
        // TODO add your handling code here:
        botonAnterior.setCursor(new Cursor(HAND_CURSOR));
        botonAnterior.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaizqhover.png"));
    }//GEN-LAST:event_botonAnteriorMouseEntered

    private void botonAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseExited
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaizq.png"));
    }//GEN-LAST:event_botonAnteriorMouseExited

    private void botonAnteriorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMousePressed
        // TODO add your handling code here:
        botonAnterior.setIcon(new ImageIcon("src/recursos/imagenes/iconos/flechaizqpressed.png"));
    }//GEN-LAST:event_botonAnteriorMousePressed

    private void botonAnteriorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseReleased
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_botonAnteriorMouseReleased

    private void cambiarContraseñaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaMenuActionPerformed
        CambiarContraseñaDialog ccd = new CambiarContraseñaDialog(this, rootPaneCheckingEnabled, c);
        ccd.setVisible(true);
    }//GEN-LAST:event_cambiarContraseñaMenuActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuUsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAnterior;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonEntrada;
    private javax.swing.JLabel botonSiguiente;
    private javax.swing.JMenuItem cambiarContraseñaMenu;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel infoSesion;
    private javax.swing.JLabel infoUsuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNumeroObras1;
    private javax.swing.JLabel labelNumeroObras2;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenuItem menuDatos;
    private javax.swing.JMenu menuReserva;
    private javax.swing.JPanel panelExpo1;
    private javax.swing.JPanel panelExpo2;
    private javax.swing.JPanel panelExposicion1;
    private javax.swing.JPanel panelExposicion2;
    private javax.swing.JPanel panelMuestra;
    private javax.swing.JPanel panelSesion1;
    // End of variables declaration//GEN-END:variables

    private void cerrarSesion() {
        MenuPrincipalFrame mpf = new MenuPrincipalFrame();
        mpf.setVisible(true);
        dispose();
    }

    private void opcionesCompra() {
        OpcionesEntradaDialog oed = new OpcionesEntradaDialog(this, true, c);
        oed.setVisible(true);
    }

    private void cargarExposiciones() {
        if (exposiciones.isEmpty()) {
            // Exposicion 1
            panelExpo1.setVisible(false);
            // Exposicion 2
            panelExpo2.setVisible(false);
        } else if (exposiciones.size() == 1) {
            // Exposicion 1
            expo1 = exposiciones.get(0);
            labelNombre1.setText("Exposición " + expo1.getNombre());
            labelNumeroObras1.setText("Nº Obras: " + String.valueOf(expo1.getObras().size()));
            imagen1.setIcon(new ImageIcon(expo1.getRutaImagen()));
            // Exposicion 2
            panelExpo2.setVisible(false);
        } else {
            // Exposicion 1
            expo1 = exposiciones.get(posicion1);
            labelNombre1.setText("Exposición " + expo1.getNombre());
            labelNumeroObras1.setText("Nº Obras: " + String.valueOf(expo1.getObras().size()));
            imagen1.setIcon(new ImageIcon(expo1.getRutaImagen()));
            // Exposicion 2
            expo2 = exposiciones.get(posicion2);
            labelNombre2.setText("Exposición " + expo2.getNombre());
            labelNumeroObras2.setText("Nº Obras: " + String.valueOf(expo2.getObras().size()));
            imagen2.setIcon(new ImageIcon(expo2.getRutaImagen()));
        }

    }

    private void siguiente() {
        if (exposiciones.size() > 2) {
            posicion1++;
            posicion2++;
            if (posicion1 == exposiciones.size()) {
                posicion1 = 0;
                posicion2 = posicion1 + 1;
            }
            if (posicion2 == exposiciones.size()) {
                posicion2 = 0;
            }
            cargarExposiciones();
        }
    }

    private void anterior() {
        if (exposiciones.size() > 2) {
            posicion1--;
            posicion2--;
            if (posicion1 < 0) {
                posicion1 = exposiciones.size() - 1;
                posicion2 = 0;
            }
            if (posicion2 < 0) {
                posicion2 = exposiciones.size() - 1;
            }
            cargarExposiciones();
        }
    }

    private void mostrarExposicion(Exposicion e) {
        MenuExposicionDialog mod = new MenuExposicionDialog(this, true, e);
        mod.setVisible(true);
    }
    
    private void conexionBD() {
        try {
            sm = new SistemaMuseo();
        } catch (SQLException ex) {
            System.out.println("Error de conexión con la Base de Datos.");
        }
    }
    
    private void imagenFondo() {
        try {
            ImagenFondo fondo = new ImagenFondo(ImageIO.read(new File("src/recursos/imagenes/fondos/fondoPrincipal.png")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/imagenes/iconos/iconoMuseoApp.png"));
        return retValue;
    }

    private void componentesIniciales() {
        imagenFondo();
        infoUsuario.setText(c.getNombre());
        cargarExposiciones();
    }
}

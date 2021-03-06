/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionBD.ConexionBD;
import ConexionBD.DAOMuseo;
import Excepciones.ConexionBDException;
import Modelo.*;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Todos
 */
public class SistemaMuseo {

    // Constructor ---------------------------------------------
    public SistemaMuseo() {
        try {
            ConexionBD.crearConexion();
        } catch (ConexionBDException ex) {
            ex.printStackTrace();
        }
    }

    // ############################# DESCONEXIÓN #############################
    public void desconectar() {
        ConexionBD.desconectar();
    }

    // ############################# INICIO DE SESIÓN #############################
    public String obtenerRol(String dni) {
        String rol;

        try {
            // Devuelve el rol que coincida con el dni recibido por parametro
            rol = DAOMuseo.instanciar().obtenerRol(dni);
        } catch (SQLException ex) {
            rol = "";
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
        return rol;
    }

    public boolean comprobarUsuariosRegistrados(String dni) {
        boolean comprobarUsuario;

        try {
            // Comprobar si ya existe un usuario (cliente o empleado) con el mismo dni que la persona que se quiere registrar
            comprobarUsuario = DAOMuseo.instanciar().existeUsuario(dni);
        } catch (SQLException ex) {
            comprobarUsuario = false;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return comprobarUsuario;
    }

    public boolean comprobarCredenciales(String dni, String clave) {
        boolean comprobarCredenciales;

        try {
            // Comprobar las credenciales de un usuario que quiere iniciar sesión
            comprobarCredenciales = DAOMuseo.instanciar().comprobarCredenciales(dni, clave);
        } catch (SQLException ex) {
            comprobarCredenciales = false;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return comprobarCredenciales;
    }

    // #################### CAMBIAR DE CONTRASEÑA ########################
    public boolean cambiarClave(String claveAntigua, String claveNueva, String dniUsuario) {
        boolean cambiada;

        try {
            cambiada = DAOMuseo.instanciar().cambiarClave(claveAntigua, claveNueva, dniUsuario);
        } catch (SQLException e) {
            cambiada = false;
            System.out.println(e.getSQLState());
            e.getStackTrace();
        }
        return cambiada;
    }

    // ############################# CLIENTE #############################
    public void nuevoCliente(Cliente cliente, String clave) {
        try {
            // Registra un nuevo cliente en la Base de Datos
            DAOMuseo.instanciar().nuevoCliente(cliente, clave);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public Cliente cargarCliente(String dniCliente) {
        Cliente cliente;

        try {
            cliente = DAOMuseo.instanciar().cargarCliente(dniCliente);
        } catch (SQLException ex) {
            cliente = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return cliente;
    }

    // Reserva la entrada
    public void reservarEntrada(Entrada entrada, Cliente cliente) {
        try {
            // Divido el flujo dependiendo de si la entrada es normal o guiada
            if (!entrada.getEsGuiada()) {
                cliente.addEntrada(entrada);
                DAOMuseo.instanciar().reservarEntradaNormal(entrada, cliente);
                JOptionPane.showMessageDialog(null, "Entrada reservada con éxito", "Reserva de entradas", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cliente.addEntrada(entrada);
                DAOMuseo.instanciar().reservarEntradaGuiada(entrada, cliente);
                JOptionPane.showMessageDialog(null, "Entrada guiada reservada con éxito", "Reserva de entradas", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public List<Entrada> cargarEntradasCliente(int id) {
        List<Entrada> entradasCliente;

        try {
            entradasCliente = DAOMuseo.instanciar().cargarEntradasCliente(id);
        } catch (SQLException ex) {
            entradasCliente = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return entradasCliente;
    }

    // ############################# ADMINISTRADOR #############################
    public Administrador cargarAdministrador(String dniAdmin) {
        Administrador admin;

        try {
            admin = DAOMuseo.instanciar().cargarAdministrador(dniAdmin);
        } catch (SQLException ex) {
            admin = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return admin;
    }

    public List<Entrada> cargarTodasEntradas() {
        List<Entrada> entradas;

        try {
            entradas = DAOMuseo.instanciar().cargarTodasEntradas();
        } catch (SQLException ex) {
            entradas = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
        return entradas;
    }

    // ############################# GUÍA #############################
    public void nuevoGuia(Guia guia, String clave) {
        try {
            //Registra un nuevo guía en la base de datos
            DAOMuseo.instanciar().nuevoGuia(guia, clave);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public Guia cargarGuia(String dniGuia) {
        Guia guia;

        try {
            guia = DAOMuseo.instanciar().cargarGuia(dniGuia);
        } catch (SQLException ex) {
            guia = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return guia;
    }

    public void despedirGuia(Guia guia) {

        try {
            DAOMuseo.instanciar().despedirGuia(guia);
        } catch (SQLException ex) {

            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    // Devuelve la tabla de entradas reservadas asociadas a un guía
    public List<Entrada> cargarEntradasGuia(int numGuia) {
        List<Entrada> entradasGuia;

        try {
            entradasGuia = DAOMuseo.instanciar().cargarEntradasGuia(numGuia);
        } catch (SQLException ex) {
            entradasGuia = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return entradasGuia;
    }

    // ############################# EXPOSICIÓN #############################

    public List<Exposicion> cargarExposiciones() {
        List<Exposicion> exposiciones;

        try {
            exposiciones = DAOMuseo.instanciar().cargarExposiciones();
        } catch (SQLException ex) {
            exposiciones = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return exposiciones;
    }

    public boolean comprobarSiExisteExposicion(String nombre) {
        boolean comprobarUsuario;

        try {
            comprobarUsuario = DAOMuseo.instanciar().existeExposicion(nombre);
        } catch (SQLException ex) {
            comprobarUsuario = false;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return comprobarUsuario;
    }

    public void nuevaExposicion(Exposicion exposicion) {
        try {
            DAOMuseo.instanciar().nuevaExposicion(exposicion);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public void eliminarExposicion(int id) {
        try {
            DAOMuseo.instanciar().eliminarExposicion(id);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    // ############################# OBRA #############################
    public List<Obra> cargarObrasExposicion(int idExpo) {
        List<Obra> obras;

        try {
            obras = DAOMuseo.instanciar().cargarObrasExposicion(idExpo);
        } catch (SQLException ex) {
            obras = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return obras;
    }

    public boolean comprobarSiExisteObra(String titulo, String autor, String anno, String tipo) {
        boolean comprobarUsuario;

        try {
            comprobarUsuario = DAOMuseo.instanciar().existeObra(titulo, autor, anno, tipo);
        } catch (SQLException ex) {
            comprobarUsuario = false;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return comprobarUsuario;
    }

    public void nuevaObra(Obra obra) {
        try {
            DAOMuseo.instanciar().nuevaObra(obra);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public void eliminarObra(int id) {
        try {
            DAOMuseo.instanciar().eliminarObra(id);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    // ############################# ENTRADA #############################
    // Cambia el precio general de la entrada
    public void cambiarPrecioEntrada(float precioEntrada) {
        try {
            DAOMuseo.instanciar().cambiarPrecioEntrada(precioEntrada);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    // Cambia el precio del suplemento por el guía
    public void cambiarPrecioSuplemento(float precioSuplemento) {
        try {
            DAOMuseo.instanciar().cambiarPrecioSuplemento(precioSuplemento);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    // Devuelve el precio actual de la entrada
    public float devolverPrecioEntrada() {
        float precioEntrada;

        try {
            precioEntrada = DAOMuseo.instanciar().devolverPrecioEntrada();
        } catch (SQLException ex) {
            precioEntrada = 0;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return precioEntrada;
    }

    // Devuelve el precio actual del suplemento
    public float devolverPrecioSuplemento() {
        float precioSuplemento;

        try {
            precioSuplemento = DAOMuseo.instanciar().devolverPrecioSuplemento();
        } catch (SQLException ex) {
            precioSuplemento = 0;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return precioSuplemento;
    }

}

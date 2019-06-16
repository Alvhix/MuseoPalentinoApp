/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ConexionBD;
import dao.DAOMuseo;
import java.sql.SQLException;
import java.util.List;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Entrada;
import modelo.Exposicion;
import modelo.Guia;

/**
 *
 * @author Todos
 */
public class SistemaMuseo {

    // Constructor ---------------------------------------------
    public SistemaMuseo() throws SQLException {
        ConexionBD.crearConexion();
        System.out.println("Wongse");
    }

    // Métodos ------------------------------------------------------
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

    public boolean comprobarCredenciales(String dni, String password) {
        boolean comprobarCredenciales;

        try {
            // Comprobar las credenciales de un usuario que quiere iniciar sesión
            comprobarCredenciales = DAOMuseo.instanciar().comprobarCredenciales(dni, password);
        } catch (SQLException ex) {
            comprobarCredenciales = false;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return comprobarCredenciales;
    }

    public void nuevoCliente(Cliente c, String password) {
        try {
            // Registra un nuevo cliente en la Base de Datos
            DAOMuseo.instanciar().nuevoCliente(c, password);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

    public void nuevoGuia(Guia g, String password) {
        try {
            //Registra un nuevo guía en la base de datos
            DAOMuseo.instanciar().nuevoGuia(g, password);
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

    /*public List cargarEntradasCliente(int id) {
        List entradasClientes;

        try {
            entradasClientes = DAOMuseo.instanciar().cargarEntradasCliente(id);
        } catch (SQLException ex) {
            entradasClientes = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return entradasClientes;
    }*/

    // Devuelve la tabla de entradas reservadas que tiene un cliente
    

    // RENOVAR MÉTODO
    public String[][] cargarEntradasGuia(int nGuia) {
        String[][] tabla_EntradasGuia;

        try {
            tabla_EntradasGuia = DAOMuseo.instanciar().cargarEntradasGuia(nGuia);
        } catch (SQLException ex) {
            tabla_EntradasGuia = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return tabla_EntradasGuia;
    }

    public Exposicion cargarExposicion(int idExpo) {
        Exposicion exposicion;

        try {
            exposicion = DAOMuseo.instanciar().cargarExposicion(idExpo);
        } catch (SQLException ex) {
            exposicion = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return exposicion;
    }
    
    public List cargarEntradasCliente(int id) {
        List entradas;

        try {
            entradas = DAOMuseo.instanciar().cargarEntradasCliente(id);
        } catch (SQLException ex) {
            entradas = null;
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }

        return entradas;
    }

    // Reserva la entrada
    public void reservarEntrada(Entrada e, Cliente c) {
        try {
            DAOMuseo.instanciar().reservarEntrada(e, c);
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            ex.getStackTrace();
        }
    }

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

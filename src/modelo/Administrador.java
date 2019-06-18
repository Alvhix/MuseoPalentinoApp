/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guillermo y Victor
 */
public class Administrador extends Trabajador {

    // ####################### - ATRIBUTOS - #######################
    private List<Guia> empleados;
    private List<Exposicion> exposiciones;

    // ####################### - CONSTRUCTORES - #######################
    public Administrador(String nombre, String dni, int telefono, long nSS) {
        super(nombre, dni, telefono, nSS);
        empleados = new ArrayList();
        exposiciones = new ArrayList();
    }

    // Constructor necesario para cargar un administrador desde la Base de Datos
    public Administrador(String nombre, String dni, int telefono, long nSS, int id, List empleados, List exposiciones) {
        super(nombre, dni, telefono, nSS, id);
        this.empleados = empleados;
        this.exposiciones = exposiciones;
    }

    // ####################### - GETTERS - #######################
    public List<Guia> getEmpleados() {
        return empleados;
    }

    public List<Exposicion> getExposiciones() {
        return exposiciones;
    }

    // ####################### - MÉTODOS - #######################
    public void annadirEmpleado(Guia e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(Guia e) {
        empleados.remove(e);
    }

    public String[][] plantillaAString() {

        String[][] datos = null;
        
        if (!getEmpleados().isEmpty()) {

            datos = new String[getEmpleados().size()][4];
            Guia g;

            for (int i = 0; i < getEmpleados().size(); i++) {

                g = getEmpleados().get(i);

                datos[i][0] = String.valueOf(g.getNGuia());
                datos[i][1] = g.getNombre();
                datos[i][2] = g.getDNI();
                datos[i][3] = String.valueOf(g.getTelefono());

            }
        }
        
        return datos;
    }
}

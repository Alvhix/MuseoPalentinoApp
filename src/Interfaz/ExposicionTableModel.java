/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Obra;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * @author Victor
 */
public class ExposicionTableModel extends AbstractTableModel {

    private final List<Obra> obras;
    private final String[] columns = {"ID", "Titulo", "Autor", "Estilo", "Año", "Tipo", "Ruta de imagen"};

    public ExposicionTableModel(List<Obra> obras) {
        this.obras = obras;
    }

    public void annadirObra(Obra o) {
        obras.add(o);
        fireTableDataChanged();
    }

    public void eliminarObra(int rowIndex) {
        obras.remove(rowIndex);
        fireTableDataChanged();
    }

    public Obra obtenerObra(int rowIndex) {
        return obras.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return obras.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Obra o = obras.get(rowIndex);

        switch (colIndex) {
            // Devuelve el id. 
            case 0:
                return o.getId();
            // Devuelve el titulo. 
            case 1:
                return o.getTitulo();
            // Devuelve el autor.
            case 2:
                return o.getAutor();
            // Devuelve el estilo.
            case 3:
                return o.getEstilo();
            // Devuelve el año.
            case 4:
                return o.getAnno();
            // Devuelve el tipo. 
            case 5:
                return o.getTipo();
            // Devuelve la ruta.
            case 6:
                return o.getRutaImagen();
            // Devuelve la Obra
            default:
                return o;
        }
    }

    @Override
    public String getColumnName(int colIndex) {
        return columns[colIndex];
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.matricula.data.mycontexts;

import java.util.List;
import upeu.holamundo.matricula.data.contracts.IAlumnoData;
import upeu.holamundo.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public class AlumnoData implements IAlumnoData {//implements es para interfaces, extends es para herencia

    @Override
    public Alumno create(Alumno alumno) { //TODO: falta que guarde en la mysql
        alumno.setId(1);//autogen
        System.out.println("en mysql");
        return alumno; 
    }

    @Override
    public Alumno edit(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getListAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getListByFilter(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

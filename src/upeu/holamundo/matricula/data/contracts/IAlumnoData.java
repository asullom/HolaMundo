/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.matricula.data.contracts;

import java.util.List;
import upeu.holamundo.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public interface IAlumnoData {
    
    Alumno create(Alumno alumno);
    Alumno edit(Alumno alumno);
    void delete(int id);
    Alumno getById(int id);
    List<Alumno> getListAll();
    //fin ORM Hibernate, JPA
    
    List<Alumno> getListByFilter(String filter);
}

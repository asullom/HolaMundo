/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.matricula.business;

import upeu.holamundo.matricula.data.contracts.DataFactory;
import upeu.holamundo.matricula.data.contracts.IAlumnoData;
import upeu.holamundo.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public class AlumnoBusiness {
    IAlumnoData alumnoData;
    
    public AlumnoBusiness(){
        //DataFactory.setInitializeFactory(DataFactory.PG);
        alumnoData = DataFactory.getAlumnoData();
    }
    public Alumno create(Alumno alumno) {
        //No repertir codigo
        
        //Permitir crear alumnos si el usuario es administrador 
        
        return alumnoData.create(alumno);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.exceptions;

/**
 *
 * @author Asullom
 */
public class AlumnoCodigoAlreadyInUseException extends Exception{
    public AlumnoCodigoAlreadyInUseException(String codigo){
        super(String.format("The code %s for Alumno already in use", codigo));
    }
}

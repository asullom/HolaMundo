/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.holamundo.matricula.data.contracts;

/**
 *
 * @author Asullom
 */
public class DataFactory {
    
    public static final int MY=1;
    public static final int PG=2;
    private static int initializeFactory=MY;

    public static void setInitializeFactory(int initializeFactory) {
        DataFactory.initializeFactory = initializeFactory;
    }

     public static IAlumnoData getAlumnoData() {
        switch (DataFactory.initializeFactory) {
            case MY:
                return new upeu.holamundo.matricula.data.mycontexts.AlumnoData(); //break;
            case PG:
                return new upeu.holamundo.matricula.data.pgcontexts.AlumnoData(); //break;
            default:
                return null;
        }
    }

}

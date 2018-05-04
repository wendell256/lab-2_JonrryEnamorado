/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Examenes {

    private String materia;
    private String preguntas;
    private String respuesta;

    

    public ArrayList Examenes(String ver, int x) {
        ArrayList lista = new ArrayList();
        if(x ==0){
        lista.add(ver);
            
        }
        else{
        lista.add(ver);
        }
        return lista;
    }

    public void printTest(ArrayList x) {
        
        for (Object t : x) {
            System.out.println(x.indexOf(t) + " " + t);

        }
    }
}

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
    
    public Examenes(){
        
    }
    public Examenes(String mat, String pre, String resp){
        ArrayList lista = new ArrayList();
        lista.add(mat);
        lista.add(pre);
        lista.add(resp);
    }
}

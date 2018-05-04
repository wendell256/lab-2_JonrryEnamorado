/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_jonrryenamorado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wende
 */
public class Lab2_JonrryEnamorado {

    /**
     * @param args the command line arguments
     */
    ArrayList Examenes = new ArrayList();
    ArrayList Usuarios = new ArrayList();
    static    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UNIVERSIDAD TECNOLÓGICA");
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1) Administración");
        System.out.println("2) Crear Cuenta");
        System.out.println("3) Login");
        System.out.println("Seleccione una opcion: ");
        int opc = read.nextInt();
        switch (opc) {
            case 1:
                Administracion();
                break;

        }
    }

    static void Administracion() {
        System.out.println("ADMINISTRACION");
        System.out.println("1) Crear Examen");
        System.out.println("2) Revisar Examen");
        System.out.println("3) Ver Notas");
        System.out.println("4) Modificar Notas");
        int opc = read.nextInt();
        switch (opc){
            case 1: 
                System.out.println("Ingrese Materia:");
                read.nextLine();
                String mat = read.nextLine();
        }
    }

}

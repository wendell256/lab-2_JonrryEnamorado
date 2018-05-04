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
    static ArrayList Materias = new ArrayList();
    static ArrayList Preguntas = new ArrayList();
    static ArrayList Usuarios = new ArrayList();
    static Scanner read = new Scanner(System.in);
    static Examenes ex = new Examenes();

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
        switch (opc) {
            case 1:
                char resp1 = 's';
                while (resp1 == 's' || resp1 == 'S') {
                    read = new Scanner(System.in);
                    System.out.println("Ingrese Materia:");
                    String mat = read.nextLine();
                    Materias.add(mat);
                    char resp2 = 's';
                    while (resp2 == 's' || resp1 == 'S') {
                        read = new Scanner(System.in);
                        System.out.println("Ingrese Pregunta:");
                        String pre = read.nextLine();
                        Preguntas.add(pre);

                        System.out.println("Desea agregar otra pregunta?s/n");
                        resp2 = read.next().charAt(0);

                    }
                    System.out.println("Desea agregar otro examen?s/n");
                    resp1 = read.next().charAt(0);
                }
        }

    }
}

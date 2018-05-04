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
    static ArrayList Usuarios = new ArrayList();
    static Scanner read = new Scanner(System.in);
    static Registro_Login reg = new Registro_Login();
    static Examenes ex = new Examenes();

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 'S') {
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

                case 2:
                    Crear();

            }
            System.out.println("Desea Realizar Otra Operacion?");
            resp = read.next().charAt(0);
        }
        System.out.println(reg.Alumnos);
        System.out.println(reg.DatosJuntos);
    }

    static void Administracion() {
        char resp1 = 's';
        while (resp1 == 's' || resp1 == 'S') {
            System.out.println("ADMINISTRACION");
            System.out.println("1) Crear Examen");
            System.out.println("2) Revisar Examen");
            System.out.println("3) Ver Notas");
            System.out.println("4) Modificar Notas");
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    char resp2 = 's';

                    read = new Scanner(System.in);
                    System.out.println("Ingrese Materia:");
                    String mat = read.nextLine();
                    ex.Materias.add(mat);
                    ex.Preguntas1 = new ArrayList();

                    while (resp2 == 's' || resp2 == 'S') {
                        read = new Scanner(System.in);
                        System.out.println("Ingrese Pregunta:");
                        String pre = read.nextLine();
                        ex.Preguntas1.add(pre);

                        System.out.println("Desea agregar otra pregunta?s/n");
                        resp2 = read.next().charAt(0);

                    }
                    ex.PreguntasJuntas.add(ex.Preguntas1);
                    System.out.println(ex.Materias);
                    System.out.println(ex.PreguntasJuntas);

                    break;

            }
            System.out.println("Desea Realizar Algo Mas En Administracion?s/n");
            resp1 = read.next().charAt(0);
        }

    }

    static void Crear() {
        read = new Scanner(System.in);
        reg.Datos = new ArrayList();
        System.out.println("CREAR USUARIO");
        System.out.println("Nombre: ");//0
        String r = read.nextLine();
        reg.Datos.add(r);
        reg.Alumnos.add(r);
        System.out.println("Numero de Cuenta:");//1
        reg.Datos.add(read.nextLine());
        System.out.println("Fecha de Nacimiento");//2
        reg.Datos.add(read.nextLine());
        System.out.println("Edad: ");//3
        reg.Datos.add(read.nextLine());
        System.out.println("Ciudad de Residencia:");//4
        reg.Datos.add(read.nextLine());
        System.out.println("Nacionalidad:");//5
        reg.Datos.add(read.nextLine());
        System.out.println("ID: ");//6
        reg.Datos.add(read.nextLine());
        System.out.println("User: ");//7
        reg.Datos.add(read.nextLine());
        System.out.println("Password:");//8
        reg.Datos.add(read.nextLine());
        reg.Datos.add(0);//NOTAS 9
        reg.DatosJuntos.add(reg.Datos);
        System.out.println("USUARIO CREADO EXCITOSAMENTE");
    }
}

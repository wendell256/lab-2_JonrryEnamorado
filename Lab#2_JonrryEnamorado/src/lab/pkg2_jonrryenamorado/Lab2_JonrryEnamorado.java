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
    static boolean log = false;
    static int pos = 0;

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
                    break;

                case 3:
                    Login();
                    break;

                default:
                    System.out.println("OPCION NO VALIDA");

            }
            System.out.println("Desea Realizar Otra Operacion?s/n");
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
        reg.Datos.add(read.nextLine());
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
        String us = read.nextLine();
        reg.Alumnos.add(us);
        reg.Datos.add(us);
        System.out.println("Password:");//8
        reg.Datos.add(read.nextLine());
        reg.Datos.add(0);//NOTAS 9
        reg.DatosJuntos.add(reg.Datos);
        System.out.println("USUARIO CREADO EXCITOSAMENTE");
    }

    static void Login() {
        read = new Scanner(System.in);
        if (reg.Alumnos.size() < 1) {
            System.out.println("NO HAY USUARIOS CREADOS");
        } else {
            System.out.println("Ingrese Usuario: ");
            String usuario = read.nextLine();
            System.out.println("Ingrese Password: ");
            String pass = read.nextLine();
            while (!val(usuario, pass)) {
                System.out.println("ERROR USUARIO NO VALIDO");
                System.out.println("");
                System.out.println("Ingrese Usuario: ");
                usuario = read.nextLine();
                System.out.println("Ingrese Password: ");
                pass = read.nextLine();
            }
            ArrayList dat = new ArrayList();
            dat = (ArrayList) reg.DatosJuntos.get(pos);
            for (int i = 0; i < dat.size(); i++) {
                switch (i) {
                    case 0:
                        System.out.println("Nombre: " + dat.get(i));
                        break;
                    case 1:
                        System.out.println("Numero de Cuenta: " + dat.get(i));
                        break;
                    case 2:
                        System.out.println("Fecha de Nacimiento: " + dat.get(i));
                        break;
                    case 3:
                        System.out.println("Edad: " + dat.get(i));
                        break;
                    case 4:
                        System.out.println("Ciudad de Residencia: " + dat.get(i));
                        break;
                    case 5:
                        System.out.println("Nacionalidad: " + dat.get(i));
                        break;
                    case 6:
                        System.out.println("ID: " + dat.get(i));
                        break;
                    case 7:
                        System.out.println("User: " + dat.get(i));
                        break;
                    case 8:
                        System.out.println("Password: " + dat.get(i));
                        break;
                    case 9:
                        System.out.println("Notas: " + dat.get(i));
                        break;
                }
            }
        }
    }

    static boolean val(String usuario, String pass) {
        boolean tmp = false;
        for (int i = 0; i < reg.DatosJuntos.size(); i++) {
            ArrayList datos = new ArrayList();
            datos = (ArrayList) (reg.DatosJuntos.get(i));
            if (usuario.equals(datos.get(7)) && pass.equals(datos.get(8))) {
                tmp = true;
                pos = i;
            }
        }
        return tmp;
    }
}

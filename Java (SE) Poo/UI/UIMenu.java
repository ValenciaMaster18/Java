package UI;

import java.util.Scanner;

public class UIMenu {

    public static void mostrarMenu (){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    mostrarMenuPaciente();

                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion");
            }
        }while (response != 0);
    }

    static void mostrarMenuPaciente(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mi cita");
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Reservar una cita");
                    break;
                case 2:
                    System.out.println("::Mi cita");
                    break;
                case 0:
                    mostrarMenu();
                    break;
            }
        }while (response != 0);
    }
}
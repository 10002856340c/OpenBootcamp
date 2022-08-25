package Parqueadero;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Metodo1();
    }
    // ------------------------------------------------------------------------------------------------------------------------------//
    // Metodos

    public static void Metodo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de automoviles que va a ingresar : ");
        int NumeroAutos = sc.nextInt();
        if (NumeroAutos <= 5) {
            Metodo2();
        } else {
            System.out.println("El numero de autos posibles es 5");
        }
    }

    public static void Metodo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Usuario :");
        String UsuarioPU = sc.nextLine();

        System.out.println("Ingrese su Contraseña :");
        String UsuarioCU = sc.nextLine();

        // Atributos
        String Usuario = "ECCI";
        String Contraseña = "2CML";

        if (UsuarioPU.equals(Usuario) && UsuarioCU.equals(Contraseña)) {

            System.out.println(
                    "*********************************  Bienvenido al sistema *********************************** + \n");
            System.out.println("¿Que tipo de automovil va a ingresar al Parqueadero : + \n");
            System.out.println("1 - Carrro");
            System.out.println("2 - Moto");
            System.out.println("3 - Bicicleta");
            String OpcionUsuario = sc.nextLine();

            switch (OpcionUsuario) {

                case "1":

                    System.out.println("Ingrese la matricula del carro :");
                    String MatriculaCarro = sc.nextLine();
                    System.out.println("La matricula del carro es :" + MatriculaCarro);
                    break;
                case "2":
                    System.out.println("Ingrese la matricula de la moto :");
                    String MatriculaMoto = sc.nextLine();
                    System.out.println("La matricula del Moto es :" + MatriculaMoto);
                    break;
                case "3":
                    System.out.println("Ingre el numero de identificacion de la  bicicleta : ");
                    String MatriculaBici = sc.nextLine();
                    System.out.println("La matricula del Bicicleta es :" + MatriculaBici);
                    break;

            }

        } else {
            System.out.println("usuario y/o contraseña incorrectos");
        }
    }

}

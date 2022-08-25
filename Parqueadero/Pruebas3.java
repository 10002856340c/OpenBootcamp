package Parqueadero;

import java.util.Scanner;

public class Pruebas3 extends AtributosParqueadero {
        public static void main(String[] args) {

                IniciarSistemaParqueo();
        }

        public static void IniciarSistemaParqueo() {
                AtributosParqueadero atributos = new AtributosParqueadero();
                Scanner leer = new Scanner(System.in);// Para pedir números por teclado
                System.out.println("BIENVENIDO:\n");
                System.out.println("Ingrese su Usuario :");
                String Usuarioinput = leer.nextLine();
                System.out.println("Ingrese su contraseña :");
                String Contraseñainput = leer.nextLine();

                if (Usuarioinput.equals(atributos.Usuario) && Contraseñainput.equals(atributos.Contraseña)) {
                        do {
                                System.out.println(
                                                "*********** Bienvenido al sistema ************* \n");
                                System.out.println("¿Que tipo de automovil va a ingresar al Parqueadero :  \n");
                                System.out.println("1 - Carrro");
                                System.out.println("2 - Moto");
                                System.out.println("3 - Bicicleta");
                                atributos.A = leer.nextInt();
                                atributos.cuenta++;
                                if (atributos.A == 1) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println(
                                                        "*** Acontinuacion Ingresar la hora de Entrada en hora militar 00 : 00 *****");
                                        System.out.println("Ingresa la hora de entrada");
                                        atributos.HoraEntradaCarro = sc.nextLine();
                                        System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println(
                                                        "*** Acontinuacion Ingresar la hora de Salida en hora militar 00 : 00 *****");
                                        System.out.println("Ingresa la hora de Salida");
                                        atributos.HoraSalidaCarro = sc.nextLine();
                                        System.out.println("Ingrese el numero de placa del carro :");
                                        String e = sc.nextLine();
                                        atributos.numeroPlacaCarro.add(e);
                                        System.out.println(
                                                        "-----------------------------Datos de Hora del Carro No. --> "
                                                                        + atributos.cuentaCarros
                                                                        + "----------------------------------------------"
                                                                        + "\n");
                                        System.out.println(
                                                        "*) La entrada del carro No. --> " + atributos.cuentaCarros
                                                                        + " es :" +
                                                                        atributos.HoraEntradaCarro + " : ");
                                        System.out.println(
                                                        "*) La Salida del carro No.-->  " + atributos.cuentaCarros +
                                                                        atributos.HoraSalidaCarro + " : " + "\n");

                                        atributos.HorasCarros = Integer.valueOf(atributos.HoraSalidaCarro)
                                                        - Integer.valueOf(atributos.HoraEntradaCarro);
                                        atributos.ConversionHorasCarros = atributos.HorasCarros * 60;
                                        atributos.TotalPagarCarros = atributos.ConversionHorasCarros * 60;
                                        System.out.println(
                                                        "*) El total a pagar del carro No. --> "
                                                                        + atributos.cuentaCarros
                                                                        + " es :"
                                                                        + atributos.TotalPagarCarros);
                                        atributos.sumaTOTALCarros = atributos.sumaTOTALCarros
                                                        + atributos.TotalPagarCarros;

                                        atributos.cuentaCarros2++; // cuenta=cuenta+1
                                        atributos.cuentaCarros++; // cuenta=cuenta+1

                                } else if (atributos.A == 2) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println(
                                                        "*** Acontinuacion Ingresar la hora de Entrada en hora militar 00 : 00 *****");
                                        System.out.println("Ingresa la hora de entrada");
                                        atributos.HoraEntradaMoto = sc.nextLine();
                                        System.out.println(
                                                        "------------------------------------------------------------------------ -----------------------------------------------------");
                                        System.out.println(
                                                        "*** Acontinuacion Ingresaras la hora de Salida en hora militar 00 : 00 *****");
                                        System.out.println("Ingresa la hora de Salida");
                                        atributos.HoraSalidaMoto = sc.nextLine();
                                        System.out.println("Ingrese el numero de placa de la moto :");
                                        String x = sc.nextLine();
                                        atributos.numeroPlacaMoto.add(x);
                                        System.out.println(
                                                        "-----------------------------Datos de Hora de la Moto No. --> "
                                                                        + atributos.cuentaMotos
                                                                        + "----------------------------------------------"
                                                                        + "\n");
                                        System.out.println(
                                                        " la entrada de la moto es - " + atributos.cuentaMotos + " es :"
                                                                        +
                                                                        atributos.HoraEntradaMoto + " : ");

                                        System.out.println(
                                                        " la Salida de la moto es - " + atributos.cuentaMotos + " es :"
                                                                        +
                                                                        atributos.HoraSalidaMoto + " : " + "\n");

                                        atributos.HorasMotos = Integer.valueOf(atributos.HoraSalidaMoto)
                                                        - Integer.valueOf(atributos.HoraEntradaMoto);
                                        atributos.ConversionHorasMotos = atributos.HorasMotos * 60;
                                        atributos.TotalPagarMotos = atributos.ConversionHorasMotos * 40;
                                        System.out.println(
                                                        "*) El total a pagar de la Moto No. --> "
                                                                        + atributos.cuentaMotos
                                                                        + " es :"
                                                                        + atributos.TotalPagarMotos);
                                        atributos.sumaTOTALMotos = atributos.sumaTOTALMotos + atributos.TotalPagarMotos;
                                        atributos.cuentaMotos2++;
                                        atributos.cuentaMotos++;
                                } else if (atributos.A == 3) {

                                        Scanner sc = new Scanner(System.in);
                                        System.out.println(
                                                        "*** Acontinuacion Ingresaras la hora de Entrada en hora militar 00 : 00 *****"
                                                                        + "\n");
                                        System.out.println("Ingresa la hora de entrada");
                                        atributos.HoraEntradaBicicleta = sc.nextLine();
                                        System.out.println("Ingresa los minutos ");
                                        System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println(
                                                        "*** Acontinuacion Ingresaras la hora de Salida en hora militar 00 : 00 *****");
                                        System.out.println("Ingresa la hora de Salida");
                                        atributos.HoraSalidaBicicleta = sc.nextLine();

                                        System.out.println("Ingrese el numero de documento de la Bicicleta :");
                                        String z = sc.nextLine();
                                        atributos.numeroPlacaBicicleta.add(z);
                                        System.out.println(
                                                        "-----------------------------Datos de Hora de la Bicicleta No. --> "
                                                                        + atributos.cuentaBicicletas
                                                                        + "----------------------------------------------"
                                                                        + "\n");
                                        System.out.println(
                                                        " la entrada de la bicicleta es - " + atributos.cuentaBicicletas
                                                                        + " es :"
                                                                        +
                                                                        atributos.HoraEntradaBicicleta + " : ");

                                        System.out.println(
                                                        " la entrada de la bicicleta es - " + atributos.cuentaBicicletas
                                                                        + " es :"
                                                                        +
                                                                        atributos.HoraSalidaBicicleta + " : " + "\n");

                                        atributos.HorasBicicletas = Integer.valueOf(atributos.HoraSalidaBicicleta)
                                                        - Integer.valueOf(atributos.HoraEntradaBicicleta);
                                        atributos.ConversionHorasBicicletas = atributos.HorasBicicletas * 60;
                                        atributos.TotalPagarBicicletas = atributos.ConversionHorasBicicletas * 20;
                                        System.out.println(
                                                        "*) El total a pagar de la Bicicleta No. --> "
                                                                        + atributos.cuentaBicicletas
                                                                        + " es :"
                                                                        + atributos.TotalPagarBicicletas);
                                        atributos.sumaTOTALBicicletas = atributos.sumaTOTALBicicletas
                                                        + atributos.TotalPagarBicicletas;
                                        atributos.cuentaBicicletas2++;
                                        atributos.cuentaBicicletas++;
                                }

                        } while (atributos.cuenta < 5);
                        System.out.println("***********TOTAL DE AUTOMOTORES EN EL PARQUEADERO**************" + "\n");

                        System.out.println("El total de carros es -->" + atributos.cuentaCarros2);
                        System.out.println("El total de motos es --> " + atributos.cuentaMotos2);
                        System.out.println("El total de Bicicleta es --> " + atributos.cuentaBicicletas2 +
                                        "\n");
                        System.out.println(
                                        "********************* ***************************" + "\n");
                        System.out.println(
                                        "********DATOS DE PLACAS O IDENTIFICACION DE LOS AUTOMOTOR INGRESADOS******"
                                                        + "\n");
                        System.out.println("El numero de placa de los carros ingresados son --> "
                                        + atributos.numeroPlacaCarro);
                        System.out.println("El numero de placa de las motos ingresadas son --> "
                                        + atributos.numeroPlacaMoto);
                        System.out.println("los numeros dedocumentos de las bicicletas ingresadas son --> "
                                        + atributos.numeroPlacaBicicleta);
                        System.out.println("Acumulado total de tarifas de carros es --> " + atributos.sumaTOTALCarros);
                        System.out.println("Acumulado total de tarifas de Motos es --> " + atributos.sumaTOTALMotos);
                        System.out.println("Acumulado total de tarifas de Bicicletas es --> "
                                        + atributos.sumaTOTALBicicletas);
                } else {
                        System.out.println("Contraseña incorrecta");

                }
        }
}
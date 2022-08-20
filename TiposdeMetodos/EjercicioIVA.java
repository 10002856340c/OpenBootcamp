package TiposdeMetodos;

import java.util.Scanner;

public class EjercicioIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del prioducto :");
        int usuario = sc.nextInt();
        System.out.println("el valor del producto es :" + usuario);
        double IVA = usuario * 0.19;
        double TOTAL = usuario + IVA;
        System.out.println("El precio final del producto incluyendo el IVA  es de : " + Math.round(TOTAL) + " COP");

    }

}

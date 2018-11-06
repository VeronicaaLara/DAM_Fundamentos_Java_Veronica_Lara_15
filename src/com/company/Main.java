package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pedir dia mes y año de una fecha
        // indicar si es correcta
        // todos los meses del año tienen 30 dias

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        System.out.println("Introduce el año");
        int año =sc.nextInt();

        if (dia > 0 && dia <= 30 ) {

            if (mes >= 0 && mes <= 12) {


                if (año > 0){
                    System.out.println("La fecha es correcta");
                }else{
                    System.out.println("El año no es correcto");
                }
            }else {
                System.out.println("El mes no es correcto");
            }


        }else {
            System.out.println("El día no es correcto");
        }

        sc.close();

    }
}

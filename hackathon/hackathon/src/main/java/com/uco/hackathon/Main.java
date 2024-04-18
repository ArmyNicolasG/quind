package com.uco.hackathon;

import java.util.Scanner;

public class Main { // Algoritmo
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de equipos: ");
        String teams = scanner.nextLine();
        int amountTeams = Integer.parseInt(teams);

        String[] names = new String[amountTeams];

        for (int i = 1; i <= amountTeams; i++) {
            System.out.println("Ingrese el nombre del equipo " + i + ": ");
            names[i - 1] = scanner.nextLine();
        }

        System.out.println("¿Qué tipo de cronograma desea generar?\n1. Solo ida.\n2. Ida y vuelta.");
        String choice = scanner.nextLine();

        System.out.println("Partidas de ida:");
        for(int i = 0; i <= names.length - 1; i++) {
            for(int j = i + 1; j <= names.length - 1; j++){
                System.out.println(names[i] + " vs " + names[j]);
            }
        }

        if(choice.equals("2")){
            System.out.println("\nPartidas de vuelta:");
            for(int i = names.length - 1; i >= 0; i--) {
                for(int j = i - 1; j >= 0; j--){
                    System.out.println(names[i] + " vs " + names[j]);
                }
            }
        }


    }
}

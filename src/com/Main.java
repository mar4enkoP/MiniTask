package com;

import java.util.Random;

public class Main {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        miniTask();
    }

    private static void miniTask() {
        System.out.println("\n--------minesweeper---------");
        int size = 20;//field size
        String[][] matrix;
        matrix = new String[size + 2][size + 2];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Присваиваем значение элементу массива
                matrix[i][j] = String.valueOf(random.nextInt(5));
                matrix[i][j] = matrix[i][j].replace('0', ' ');  //replacement of 0 per gap
                matrix[i][j] = matrix[i][j].replace('4', '☉'); //replacement of 4 per ☉(Mina)
                if (j == 0 || i == 0 || i == size + 1 || j == size + 1) {
                    matrix[i][j] = "▩";
                    System.out.print(ANSI_BLACK + matrix[i][j] + "\t");
                }
                // Выводим элемент массива на экран
                if (matrix[i][j].equals("1"))
                    System.out.print(ANSI_GREEN + matrix[i][j] + "\t");
                if (matrix[i][j].equals("2"))
                    System.out.print(ANSI_BLUE + matrix[i][j] + "\t");
                if (matrix[i][j].equals("3"))
                    System.out.print(ANSI_RED + matrix[i][j] + "\t");
                if (matrix[i][j].equals("4"))
                    System.out.print(ANSI_WHITE + matrix[i][j] + "\t");
                if (matrix[i][j].equals("☉"))
                    System.out.print(ANSI_PURPLE + matrix[i][j] + "\t");
                if (matrix[i][j].equals(" "))
                    System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }


    }
}




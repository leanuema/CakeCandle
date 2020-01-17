package com.leandro.it;

public class Main {
    public static void main(String[] args) {

        int[] ar;
        ar = new int[] {4, 2, 1, 5};

        int acumulador;
         acumulador = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == ar.length-1){
                acumulador ++;
            }
            else if (ar[i] >= ar.length){
                acumulador ++;
            }
        }
        System.out.println(acumulador);
    }
}

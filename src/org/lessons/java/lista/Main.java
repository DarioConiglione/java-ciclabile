package org.lessons.java.lista;

public class Main {

    public static void main(String[] args) {
        int[] numeri = { 1, 34, 54, 43, 23, 76, 23, 54, 975 };
        ListaInteri interi = new ListaInteri(numeri);

        interi.addElemento(45);
        interi.addElemento(100);
        interi.addElemento(3);

        while (interi.hasAncoraElementi()) {
            System.out.println(interi.getElementoSuccessivo());
        }

    }

}

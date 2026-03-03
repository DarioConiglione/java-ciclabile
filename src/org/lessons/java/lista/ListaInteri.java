package org.lessons.java.lista;

public class ListaInteri {

    private int[] elencoInteri;
    private int index;

    public ListaInteri(int[] elencoInteri) {
        this.elencoInteri = elencoInteri;
    }

    public int getElementoSuccessivo() {
        int elemento = elencoInteri[index];
        elemento++;
        return elemento;

    }

    public boolean hasAncoraElementi() {
        return index < elencoInteri.length;

    }

}

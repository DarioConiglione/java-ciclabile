package org.lessons.java.lista;

public class ListaInteri {

    private int[] elencoInteri;
    private int index;

    public ListaInteri() {
        this.elencoInteri = new int[0];
        this.index = 0;
    }

    public ListaInteri(int[] elencoInteri) {
        this.elencoInteri = elencoInteri;
        this.index = 0;
    }

    public int getElementoSuccessivo() {
        int elemento = elencoInteri[index];
        elemento++;
        return elemento;

    }

    public boolean hasAncoraElementi() {
        return index < elencoInteri.length;

    }

    public void addElemento() {
        int[] nuovoElencoInteri = elencoInteri;
        for (int i = 0; i < elencoInteri.length; i++) {
            nuovoElencoInteri[i] = elencoInteri[i];
        }
    }

}

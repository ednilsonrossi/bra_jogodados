package br.com.ednilsonrossi.dadosbra.model;

import java.util.Random;

public class Dado {

    private int face;

    public Dado(){
        sorteia();
    }

    public int getFace() {
        return face;
    }

    public void lancar(){
        sorteia();
    }

    private void sorteia(){
        Random rand = new Random();

        this.face = rand.nextInt(6) + 1;
    }
}

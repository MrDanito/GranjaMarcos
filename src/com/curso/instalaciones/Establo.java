package com.curso.instalaciones;

import com.curso.animales.mamiferos.Buey;
import com.curso.animales.mamiferos.Caballo;
import com.curso.animales.mamiferos.Mamifero;
import com.curso.animales.mamiferos.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Establo {

    private static final int NUMERO_DE_MAMIFEROS=5;

    List<Mamifero> mamiferos =new ArrayList<Mamifero>();

    public void metermamifero(Mamifero mamifero) {

        if (mamiferos.size() >= NUMERO_DE_MAMIFEROS) {
            System.out.println("Lo siento, no caben más animales. El límite es 5 y tienes " +getNumeroDeCaballos()+ " caballos, "
                    +getNumeroDeBueyes()+ " bueyes y " +getNumeroDeVacas()+ " vacas.");
        } else {
            mamiferos.add(mamifero);

            System.out.println("Has metido un animal. Tienes " +mamiferos.size()+ " mamíferos metidos, " +getNumeroDeCaballos()+ " caballos, "
                    +getNumeroDeBueyes()+ " bueyes y " +getNumeroDeVacas()+ " vacas.");
        }
    }

    public Vaca sacarVaca() {
        for(Mamifero mamifero : this.mamiferos){
            if(mamifero instanceof Vaca){
                return (Vaca)this.mamiferos.remove(this.mamiferos.indexOf(mamifero));
            }
        }
        return null;
    }

    public int getNumeroDeVacas(){

        int numeroDeVacas=0;

        for (Mamifero mamifero : mamiferos) {
            if (mamifero instanceof Vaca){

                numeroDeVacas++;
            }
        }

        return numeroDeVacas;
    }

    public int getNumeroDeBueyes(){

        int numeroDeBueyes=0;

        for (Mamifero mamifero : mamiferos) {
            if (mamifero instanceof Buey){

                numeroDeBueyes++;
            }
        }

        return numeroDeBueyes;
    }

    public int getNumeroDeCaballos(){

        int numeroDeCaballos=0;

        for (Mamifero mamifero : mamiferos) {
            if (mamifero instanceof Caballo){

                numeroDeCaballos++;
            }
        }

        return numeroDeCaballos;
    }
}
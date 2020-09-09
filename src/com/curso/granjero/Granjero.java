package com.curso.granjero;

import com.curso.animales.Animal;
import com.curso.animales.aves.Gallina;
import com.curso.animales.mamiferos.Vaca;
import com.curso.instalaciones.Establo;
import com.curso.instalaciones.Gallinero;
import com.curso.instalaciones.Redil;

public class Granjero {

    public void llevarGallinaARedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = gallinero.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            //gallina.setEnRedil(true);
            redil.meterAnimal(gallina);
        } else {
            System.out.println("No había gallinas para llevar al redil");
        }
    }

    public void llevarVacaARedil(Establo establo, Redil redil) {
        Vaca vaca = establo.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            //vaca.setEnRedil(true);
            redil.meterAnimal(vaca);
        } else {
            System.out.println("No había vacas para llevar al redil");
        }
    }

    public void calmarAnimal(Animal animal) {
        System.out.println("No te asustes " + animal.getNombre() + ", que te muevo de sitio");
    }

    public void sacarGallinaDelRedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = redil.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            //gallina.setEnRedil(false);
            gallinero.meterAve(gallina);
        } else {
            System.out.println("No había gallinas para llevar al gallinero");
        }
    }

    public void sacarVacaDelRedil(Establo establo, Redil redil) {
        Vaca vaca = redil.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            //vaca.setEnRedil(false);
            establo.metermamifero(vaca);
        } else {
            System.out.println("No había vaca para llevar al establo");
        }
    }
}
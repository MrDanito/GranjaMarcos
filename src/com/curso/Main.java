package com.curso;

import com.curso.animales.aves.Gallina;
import com.curso.animales.aves.Pavo;
import com.curso.animales.mamiferos.Buey;
import com.curso.animales.mamiferos.Vaca;
import com.curso.granjero.Granjero;
import com.curso.instalaciones.Granja;

public class Main {
    public static void main(String[] args){

        Granja granja = new Granja();
        Vaca vaca1 = new Vaca("vaca1");
        Vaca vaca2 = new Vaca("vaca2");
        Vaca vaca3 = new Vaca("vaca3");
        Vaca vaca4 = new Vaca("vaca4");
        Vaca vaca5 = new Vaca("vaca5");
        Buey buey1 = new Buey("buey1");
        Gallina gallina1 = new Gallina("gallina1");
        Pavo pavo1 = new Pavo("pavo1");

        granja.getEstablo().metermamifero(vaca1);
        granja.getEstablo().metermamifero(vaca2);
        granja.getEstablo().metermamifero(vaca3);
        granja.getEstablo().metermamifero(vaca4);
        granja.getEstablo().metermamifero(vaca5);
        granja.getEstablo().metermamifero(buey1);

        granja.getGallinero().meterAve(gallina1);
        granja.getGallinero().meterAve(pavo1);

        granja.getGallinero().cogerHuevos();
        granja.getMatadero().matarAve(granja.getGallinero());
        granja.getGallinero().cogerHuevos();

        Granjero granjero = new Granjero();
        granjero.llevarGallinaARedil(granja.getGallinero(), granja.getRedil());
        granja.getRedil().informarEstado();
    }
}
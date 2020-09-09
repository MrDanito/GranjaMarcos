package com.curso.animales.mamiferos;

import com.curso.ifaces.IPastoreable;

public class Vaca extends Mamifero implements IPastoreable {

    private boolean isEnRedil = false;

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void pastorear() {
        if (isEnRedil){
            System.out.println("Soy una vaca, me llamo " + this.getNombre() + " y me están pastoreando");
        }else {
            System.out.println("No puedo pastorear si no estoy en el redil.");
        }
    }

    @Override
    public void setIsEnRedil(boolean value) {
        this.isEnRedil= value;
    }
}
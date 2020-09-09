package com.curso.animales.aves;

import com.curso.ifaces.IPastoreable;

public class Gallina extends Ave implements IPastoreable {

    private boolean isEnRedil = false;


    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void pastorear() {
        if (isEnRedil){
            System.out.println("Soy una gallina, me llamo "+this.getNombre() + " y me están pastoreando");
        }else {
            System.out.println("No puedo pastorear si no estoy en el redil.");
        }
    }

    @Override
    public void setIsEnRedil(boolean value) {
        this.isEnRedil = value;

    }


}
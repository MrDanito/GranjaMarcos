package com.curso.instalaciones;

import com.curso.animales.aves.Gallina;
import com.curso.animales.mamiferos.Vaca;
import com.curso.ifaces.IPastoreable;

import java.util.ArrayList;
import java.util.List;

public class Redil {
    List<IPastoreable> rebano = new ArrayList<>();

    public void meterAnimal(IPastoreable animal){
        this.rebano.add(animal);
    }

    public IPastoreable sacarAnimal(){
        if(!this.rebano.isEmpty())
            return this.rebano.remove(0);

        return null;
    }

    public Gallina sacarGallina() {
        for(IPastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                return (Gallina)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }

    public Vaca sacarVaca() {
        for(IPastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                return (Vaca)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }

    public void pastorearAnimales(){
        for(IPastoreable animal : rebano){
            animal.pastorear();
        }
    }

    public void informarEstado(){
        System.out.println(new StringBuilder().append("Tengo ")
                .append(this.rebano.size())
                .append(" animales. ")
                .append(this.getNumeroDeVacas())
                .append(" vacas y ")
                .append(this.getNumeroDeGallinas())
                .append(" gallinas.")
                .toString());
    }

    public int getNumeroDeVacas(){
        int vacas = 0;
        for(IPastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                vacas++;
            }
        }
        return vacas;
    }

    public int getNumeroDeGallinas(){
        int gallinas = 0;
        for(IPastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                gallinas++;
            }
        }
        return gallinas;
    }
}
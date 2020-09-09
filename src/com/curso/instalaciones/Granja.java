package com.curso.instalaciones;

public class Granja {
    private Establo establo = new Establo();
    private Gallinero gallinero = new Gallinero();
    private Matadero matadero = new Matadero();
    private Redil redil = new Redil();

    /**
     * @return the establo
     */
    public Establo getEstablo() {
        return establo;
    }

    /**
     * @param establo the establo to set
     */
    public void setEstablo(Establo establo) {
        this.establo = establo;
    }

    /**
     * @return the gallinero
     */
    public Gallinero getGallinero() {
        return gallinero;
    }

    /**
     * @param gallinero the gallinero to set
     */
    public void setGallinero(Gallinero gallinero) {
        this.gallinero = gallinero;
    }

    /**
     * @return the matadero
     */
    public Matadero getMatadero() {
        return matadero;
    }

    /**
     * @param matadero the matadero to set
     */
    public void setMatadero(Matadero matadero) {
        this.matadero = matadero;
    }

    /**
     * @return the redil
     */
    public Redil getRedil() {
        return redil;
    }

    /**
     * @param redil the redil to set
     */
    public void setRedil(Redil redil) {
        this.redil = redil;
    }
}
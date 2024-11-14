package JDCV;

class Espada extends Arma {

    public Espada() {
        this.dano = 3; // Daño adicional por espada  
    }

    @Override
    public double getDano() {
        return dano;
    }
}

package JDCV;

class Chancla extends Arma {

    public Chancla() {
        this.dano = 7; // Daño adicional por chancla 
    }

    @Override
    public double getDano() {
        return dano;
    }
}

package JDCV;

class PunoLimpio extends Arma {

    public PunoLimpio() {
        this.dano = 1; // Daño adicional por chancla 
    }

    @Override
    public double getDano() {
        return dano;
    }
}

package JDCV;

class Hacha extends Arma {

    public Hacha() {
        this.dano = 5; // Daño adicional por hacha  
    }

    @Override
    public double getDano() {
        return dano;
    }
}

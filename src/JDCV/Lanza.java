package JDCV;

class Lanza extends Arma {

    public Lanza() {
        this.dano = 3; // Daño adicional por lanza  
    }

    @Override
    public double getDano() {
        return dano;
    }
}

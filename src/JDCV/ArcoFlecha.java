package JDCV;

class ArcoFlecha extends Arma {

    public ArcoFlecha() {
        this.dano = 2; // Daño adicional por arco  
    }

    @Override
    public double getDano() {
        return dano;
    }
}

package JDCV;

class MartilloGuerra extends Arma {

    public MartilloGuerra() {
        this.dano = 4; // Daño adicional por martillo  
    }

    @Override
    public double getDano() {
        return dano;
    }
}

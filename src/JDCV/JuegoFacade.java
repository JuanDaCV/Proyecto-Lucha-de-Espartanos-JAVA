package JDCV;

class JuegoFacade {

    public Personaje crearPersonaje(String nombre, String tipoArma, boolean tieneEscudo) {
        Arma arma = null;
        if (tipoArma.equalsIgnoreCase("e")) {
            arma = new Espada();
        } else if (tipoArma.equalsIgnoreCase("l")) {
            arma = new Lanza();
        } else if (tipoArma.equalsIgnoreCase("h")) {
            arma = new Hacha();
        } else if (tipoArma.equalsIgnoreCase("af")) {
            arma = new ArcoFlecha();
        } else if (tipoArma.equalsIgnoreCase("m")) {
            arma = new MartilloGuerra();
        } else if (tipoArma.equalsIgnoreCase("c")) {
            arma = new Chancla();
        }
        Escudo escudo = tieneEscudo ? new Escudo() : null;
        return new Personaje(nombre, arma, escudo);
    }
}

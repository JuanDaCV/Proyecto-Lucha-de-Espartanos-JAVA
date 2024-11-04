package JDCV;

import java.util.Random;

class Personaje {

    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;
    private Arma arma;
    private Escudo escudo;

    // Constructor  
    public Personaje(String nombre, Arma arma, Escudo escudo) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
        this.escudo = escudo;
    }

    // Método de ataque modificado para incluir el daño del arma  
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        double dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + (arma != null ? arma.getDano() : 0);
        oponente.recibirDano(dano);
        System.out.println("        " + this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    // Método para recibir daño modificado para incluir la reducción del escudo  
    public void recibirDano(double dano) {
        if (escudo != null) {
            dano = escudo.aplicarReduccion(dano); // Aplicar reducción del escudo  
        }
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}

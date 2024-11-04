package JDCV;

class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;
    private static final int DELAY_SECONDS = 6; // Tiempo de retardo entre turnos

    // Constructor para inicializar los personajes
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // Método para iniciar la pelea
    public void iniciarPelea() {
        System.out.println("    ▲ La pelea comienza entre [ " + jugador1.getNombre() + " ] y [" + jugador2.getNombre() + " ] ▼ \n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // Mostrar el resultado de la pelea
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ☺☻ ha ganado la pelea. ☺☻");
        } else {
            System.out.println(jugador2.getNombre() + " ☺☻ ha ganado la pelea. ☺☻");
        }
    }

    // Método que representa un turno de ataque
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("        → Turno de [" + atacante.getNombre() + "]." + "\n         ♥ Puntos vida de (" + defensor.getNombre() + ") : " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println("           [" + defensor.getNombre() + "] ahora tiene " + defensor.getPuntosDeVida() + " ♥ de vida. \n");

        try {
            Thread.sleep(DELAY_SECONDS * 1000); // Pause the execution for DELAY_SECONDS seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

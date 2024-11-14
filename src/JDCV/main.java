package JDCV;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu Inicia Aqui
        System.out.println("    ----- ♂ ↨ Lucha de Espartanos ↨ ♂ -----");

        JuegoFacade facade = new JuegoFacade();

        System.out.print(" ► Nombre del Espartano1 : ");
        String nombre1 = scanner.nextLine();
        System.out.print(" ► Tipo de Arma del Espartano1 \n"
                + "  Opciones:"
                + "\n   (a)  Arco/Flecha"
                + "\n   (c)  Chacla"
                + "\n   (e)  Espada"
                + "\n   (h)  Hacha"
                + "\n   (l)  Lanza"
                + "\n   (m)  MartilloGuerra"
                + "\n   (p)  Puño Limpio \n"
                + "Digita el caracter de tu arma : "
        );
        String tipoArma1 = scanner.nextLine();
        System.out.print(" ► ¿El Espartano1 tiene escudo? (true/false) : ");
        boolean tieneEscudo1 = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el buffer  

        System.out.print(" ► Nombre del Espartano2 : ");
        String nombre2 = scanner.nextLine();
        System.out.print(" ► Tipo de Arma del Espartano1 \n"
                + "  Opciones:"
                + "\n   (a)  Arco/Flecha"
                + "\n   (c)  Chacla"
                + "\n   (e)  Espada"
                + "\n   (h)  Hacha"
                + "\n   (l)  Lanza"
                + "\n   (m)  MartilloGuerra"
                + "\n   (p)  Puño Limpio \n"
                + " → Digita el caracter de tu arma : "
        );
        String tipoArma2 = scanner.nextLine();
        System.out.print(" ► ¿El Espartano2 tiene escudo? (true/false) : ");
        boolean tieneEscudo2 = scanner.nextBoolean();
        System.out.println(" ");

        //Patron Fachade
        Personaje jugador1 = facade.crearPersonaje(nombre1, tipoArma1, tieneEscudo1);
        Personaje jugador2 = facade.crearPersonaje(nombre2, tipoArma2, tieneEscudo2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
    }
}

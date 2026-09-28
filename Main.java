package Ejercicio8_batallaRPG;

public class Main {
    public static void main(String[] args) {
        Personaje guerrero = new Personaje("Thorin", 100, 30);
        Personaje mago = new Personaje("Merlín", 70, 45);

        int turno = 1;
        while (guerrero.estaVivo() && mago.estaVivo()) {
            System.out.println("--- Turno " + turno + " ---");
            guerrero.atacar(mago);
            mago.atacar(guerrero);
            turno++;
        }

        System.out.println("--- Después de la batalla ---");
        guerrero.atacar(mago);
        mago.atacar(guerrero);
    }
}

package Ejercicio8_batallaRPG;

public class Personaje {
    private String nombre;
    private int puntosVida;
    private int poderAtaque;

    public Personaje(String nombre, int puntosVida, int poderAtaque) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.poderAtaque = poderAtaque;
    }

    public void atacar(Personaje oponente) {
        if (!estaVivo()) {
            System.out.println(nombre + " está derrotado y no puede atacar.");
            return;
        }
        if (!oponente.estaVivo()) {
            System.out.println(nombre + " no puede atacar a " + oponente.nombre + ": ya está derrotado.");
            return;
        }
        System.out.println(nombre + " ataca a " + oponente.nombre + " con poder " + poderAtaque + ".");
        oponente.recibirDanio(poderAtaque);
    }

    public void recibirDanio(int cantidad) {
        if (!estaVivo()) {
            return;
        }
        puntosVida = Math.max(0, puntosVida - cantidad);
        System.out.println("  " + nombre + " recibe " + cantidad + " de daño. Vida: " + puntosVida);
        if (!estaVivo()) {
            System.out.println("  ¡" + nombre + " fue derrotado!");
        }
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public String getNombre() {
        return nombre;
    }
}

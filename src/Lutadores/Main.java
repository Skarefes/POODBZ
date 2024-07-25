package Lutadores;

import Lutadores.Fighters;

public class Main {
    public static void main(String[] args) {
        Fighters f[] = new Fighters[3];
        f[0] = new Fighters("Vegeta", "Sayadin", 30, 61, 1.56f, 31, 5,1);
        f[1] = new Fighters("Piccolo", "Namek", 38, 80, 1.89f, 18, 7, 3);
        f[2] = new Fighters("Mestre Kame", "Human", 60, 50, 1.49f, 40, 10, 5);

        Ringue vs = new Ringue();

        vs.marcarLuta(f[1], f[2]);

        vs.lutar();


    }
}
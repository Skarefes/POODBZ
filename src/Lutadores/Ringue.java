package Lutadores;

import Lutadores.Fighters;

import java.util.Random;

public class Ringue {
    private Fighters desafiado;
    private Fighters desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Fighters p1, Fighters p2){
        if (p1 != p2){
            System.out.println("Luta marcada");
            this.aprovada = true;
            this.desafiado = p1;
            this.desafiante = p2;
            System.out.println("Entre " + this.desafiado.getNome() + " CONTRA " + this.desafiante.getNome());
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if(aprovada){
            System.out.println("COMECOU A LUTA DO ");
            this.desafiado.apresentar();
            System.out.println("CONTRA O ");
            this.desafiante.apresentar();

            Random dado = new Random();
            int duelo = dado.nextInt(3);
            switch (duelo) {
                case 0:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                    this.desafiante.setDerrotas(this.getDesafiante().getDerrotas() + 1);
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                    this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
                    break;
                case 2:
                    System.out.println("EMPATE !!");
                    this.desafiado.setEmpates(this.desafiado.getEmpates() + 1);
                    this.desafiante.setEmpates(this.desafiante.getEmpates() + 1);
                    break;
            }
        }
    }

    public Fighters getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Fighters desafiado) {
        this.desafiado = desafiado;
    }

    public Fighters getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Fighters desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

package br.com.fiapride.model;

import jdk.swing.interop.SwingInterOpUtils;

public class Controle {
    private String pilha;
    private boolean comando;


    private Televisao dispositivo; // desempenha o papel da televisão dentro do controle

    public Controle( String pilha , boolean comando, Televisao dispositivo){
        this.pilha = pilha;
        this.comando = comando;
        this.dispositivo = dispositivo;

        System.out.println("Controle vinculado ao dispositivo: " + this.dispositivo.getMarca());
    }

    public Controle(String pilha, boolean comando) {
    }

    public void exibeResumo(){
        System.out.printf("\n--- DISPOSITIVO VINCULADO --- ");

        if (comando){
            System.out.println("\nControle ligado.");
        }else{
            System.out.printf("\nDispositivo precisa de pilha.");
        }

    }

    public String getPilha() {
        return this.pilha;
    }

    public boolean isComando() {
        return this.comando;
    }

    public Televisao getDispositivo() {
        return this.dispositivo;
    }
}

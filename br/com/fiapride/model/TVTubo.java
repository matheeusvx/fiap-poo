package br.com.fiapride.model;

public class TVTubo extends Televisao {

    private boolean entradaAV;

    public TVTubo(String cor, int tamanho, String marca, boolean entradaAV) {
        super(cor, tamanho, marca);
        this.entradaAV = entradaAV;

        if (!entradaAV) {
            System.out.println("TV de tubo sem entrada AV.");
        }
    }

    // Getter
    public boolean hasEntradaAV() {
        return entradaAV;
    }

    // Setter
    public void setEntradaAV(boolean entradaAV) {
        this.entradaAV = entradaAV;
    }
}
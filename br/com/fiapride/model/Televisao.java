package br.com.fiapride.model;
public class Televisao { // <-- Use o nome do SEU objeto
    // As características que você pensou
    private String cor;
    private int tamanho;
    private String marca;

    public Televisao(String cor , int tamanho , String marca){
        this.setCor(cor);
        this.setMarca(marca);
        this.setTamanho(tamanho);
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
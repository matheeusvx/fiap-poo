package br.com.fiapride.model;
public class Televisao {

    private String cor;
    private int polegadas;
    private String marca;

    public Televisao(String cor , int tamanho , String marca){
        this.setCor(cor);
        this.setMarca(marca);
        this.setPolegadas(tamanho);
    }

    public String getCor() {
        return cor;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String ligar() {
        return "A televisão está sendo ligada.";
    }
}
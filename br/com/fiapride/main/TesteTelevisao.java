package br.com.fiapride.main;
import br.com.fiapride.model.Controle;
import br.com.fiapride.model.Televisao;
public class TesteTelevisao {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        // 1. Instanciando o objeto (criando o espaço na memória)
        Televisao minhaTelevisao = new Televisao("Preta", 55, "LG" );

        System.out.println("--- Características da TV --- || Marca: " + minhaTelevisao.getMarca() + " || Cor: " + minhaTelevisao.getCor() + " || Tamanho: " + minhaTelevisao.getTamanho() + " polegadas");

        Controle dispositivoVinculado = new Controle("Duracell", true, minhaTelevisao);

        dispositivoVinculado.exibeResumo();
    }
}



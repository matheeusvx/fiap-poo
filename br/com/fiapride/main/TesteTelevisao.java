package br.com.fiapride.main;
import br.com.fiapride.model.Controle;
import br.com.fiapride.model.Televisao;
import br.com.fiapride.model.TVSmart;
import br.com.fiapride.model.TVTubo;
import java.util.ArrayList;
import java.util.List;

public class TesteTelevisao {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        // 1. Instanciando o objeto (criando o espaço na memória)
        Televisao minhaTelevisao = new Televisao("Preta", 55, "LG");

        System.out.println("--- Características da TV --- || Marca: " + minhaTelevisao.getMarca() + " || Cor: " + minhaTelevisao.getCor() + " || Polegadas: " + minhaTelevisao.getPolegadas() + " polegadas");

        Controle dispositivoVinculado = new Controle("Duracell", true, minhaTelevisao);

        dispositivoVinculado.exibeResumo();

        TVSmart smart1 = new TVSmart("Cinza", 40, "Samsung", false);
        if (smart1.isSmart()) {
            System.out.println("TV Smart identificada: " + smart1.getMarca() +
                    " || Polegadas: " + smart1.getPolegadas());
        } else {
            System.out.println("Essa TV NÃO é Smart.");
        }

        TVTubo tubo1 = new TVTubo("Preta", 29, "Philco", true);

        if (tubo1.hasEntradaAV()) {
            System.out.println("TV de tubo com entrada AV: "
                    + tubo1.getMarca() + " || Polegadas: " + tubo1.getPolegadas());
        } else {
            System.out.println("TV de tubo SEM entrada AV.");
        }

        List<Televisao> lista = new ArrayList<>();

        lista.add(new TVSmart("Preta", 50, "Samsung", true));
        lista.add(new TVTubo("Cinza", 29, "Philco", true));

        for (Televisao tv : lista) {
            System.out.println(tv.ligar());
        }
    }
}



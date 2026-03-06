package br.com.fiapride.main;
import br.com.fiapride.model.Televisao;
public class TesteTelevisao {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        // 1. Instanciando o objeto (criando o espaço na memória)
        Televisao minhaTelevisao = new Televisao();

        // 2. Definindo os atributos diretamente
        minhaTelevisao.marca = "Samsung";
        minhaTelevisao.tamanho = 55;

        // 3. Testando algum comportamento (se você criou na Aula 02)
        // minhaTelevisao.ligar();

        // 4. Imprimindo o resultado no console
        System.out.println("Marca da televisão: " + minhaTelevisao.marca);
        System.out.println("Tamanho: " + minhaTelevisao.tamanho + " polegadas");

            }
        }



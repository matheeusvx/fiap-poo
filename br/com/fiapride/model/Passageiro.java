package br.com.fiapride.model;

// Passageiro é a classe, é a planta da casa
public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    // CONSTRUTOR
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    // Método para adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido para recarga!");
        }
    }

    // Método para pagar viagem
    public void pagarViagem(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Viagem paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // GET SALDO
    public double getSaldo() {
        return this.saldo;
    }

    // SET SALDO
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro: saldo negativo não permitido!");
        }
    }

    // GET NOME
    public String getNome() {
        return this.nome;
    }

    // SET NOME
    private void setNome(String nome) {
        this.nome = nome;
    }

    // GET CPF
    public String getCpf() {
        return this.cpf;
    }

    // SET CPF
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
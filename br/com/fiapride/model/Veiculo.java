package br.com.fiapride.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoDoCarro;
    private boolean estaRegular;

    // INICIO DOS GETTERS E SETTERS
    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoDoCarro() {
        return this.anoDoCarro;
    }

    public boolean isEstaRegular() {
        return this.estaRegular;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }


    private void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    private void setEstaRegular(boolean estaRegular) {
        if (estaRegular == true){
            System.out.println("Está regular");
        }else{
            System.out.println("Não está regular, verifique o motivo");
        }
    }



    // FIM DOS GETTERS E SETTERS

    public Veiculo(String modelo , String placa , int anoDoCarro, boolean estaRegular){
        this.modelo = modelo;
        this.setPlaca(placa);
        this.setAnoDoCarro(anoDoCarro);
        this.setEstaRegular(false);
        this.setNovaPlaca(placa);
        System.out.println("Modelo do carro: "+ this.modelo + " Placa inicial: "+ this.placa);
    }

    // metodo de atualizar a placa

    public void atualizarPlaca(String novaPlaca){
        System.out.println("Solicitada alteração da placa no sistema do Detran. Modelo do carro: " +this.modelo);
        this.setPlaca(novaPlaca);
    }

    private void setNovaPlaca (String novaPlaca){
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()){
            this.placa = novaPlaca;
            System.out.println("Sucesso! Sua placa agora é: " + this.placa);
        }else{
            System.out.println("Erro de validação: a placa informada é inválida.");
        }
    }
}

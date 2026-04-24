package br.com.fiapride.model;

public class TVSmart extends Televisao{
    private boolean isSmart;
    public TVSmart(String cor , int tamanho , String marca, boolean isSmart){
        super (cor, tamanho, marca);
        this.isSmart = isSmart;
    }

    public boolean isSmart() { // getters
        return isSmart;
    }

    public void setSmart(boolean smart) { // setters
        isSmart = smart;
    }

    @Override
    public String ligar() {
        return "Ligando TV Smart com acesso à internet e aplicativos.";
    }
}

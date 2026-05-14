package br.com.devdojo.javacore.Gassociacao.dominio;

public class Local {
    private String nomeEndereco;

    public void imprime(){
        System.out.println("Nome endereço: " + nomeEndereco);
    }

    public Local(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }
}

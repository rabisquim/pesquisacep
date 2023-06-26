package br.com.alura.pesquisacep.modelos;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;


    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "CEP: " + cep +
                "\nLogradouro: " + logradouro +
                "\nComplemento: " + complemento +
                "\nBairro: " + bairro +
                "\nLocalidade: " + localidade +
                "\nUF: " + uf;
    }


}

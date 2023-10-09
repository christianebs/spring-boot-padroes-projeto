package com.github.christianebs.model;

public class EnderecoBuilder {
    private Endereco endereco;

    public EnderecoBuilder() {
        this.endereco = new Endereco();
    }

    public EnderecoBuilder comCep(String cep) {
        endereco.setCep(cep);
        return this;
    }

    public EnderecoBuilder comLogradouro(String logradouro) {
        endereco.setLogradouro(logradouro);
        return this;
    }

    public EnderecoBuilder comBairro(String bairro) {
        endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder comLocalidade(String localidade) {
        endereco.setLocalidade(localidade);
        return this;
    }

    public Endereco build() {
        return endereco;
    }
}

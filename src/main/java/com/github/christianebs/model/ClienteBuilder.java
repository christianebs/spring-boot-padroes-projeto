package com.github.christianebs.model;

public class ClienteBuilder {
    private Cliente cliente;

    public ClienteBuilder() {
        this.cliente = new Cliente();
    }

    public ClienteBuilder comId(Long id) {
        cliente.setId(id);
        return this;
    }

    public ClienteBuilder comNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder comEndereco(Endereco endereco) {
        cliente.setEndereco(endereco);
        return this;
    }

    public Cliente build() {
        return cliente;
    }
}

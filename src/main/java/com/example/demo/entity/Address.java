package com.example.demo.entity;

public class Address {

    private Long id;

    private String address;

    private Integer numero;

    private String cidade;

    private String complemento;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address(Long id, String address, Integer numero, String cidade, String complemento) {
        this.id = id;
        this.address = address;
        this.numero = numero;
        this.cidade = cidade;
        this.complemento = complemento;
    }
}

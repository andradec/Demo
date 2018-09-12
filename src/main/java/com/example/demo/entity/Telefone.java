package com.example.demo.entity;

public class Telefone {

    private Long id;

    private Tipo tipo;

    private Integer number;

    public Telefone(Long id, Tipo tipo, Integer number) {
        this.id = id;
        this.tipo = tipo;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

package com.example.demo.entity;

public class PessoaFisica extends Pessoa {

    private Long id;

    private Integer CPF;

    public PessoaFisica(Long id, Integer CPF) {
        this.id = id;
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }
}

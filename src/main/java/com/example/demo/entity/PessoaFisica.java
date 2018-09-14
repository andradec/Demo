package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class PessoaFisica extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "CPF")
    private Integer CPF;

    public PessoaFisica(Long id, String name, LocalDate birthday, Address endereco, Telefone telefone, Long id1, Integer CPF) {
        super(id, name, birthday, endereco, telefone);
        this.id = id1;
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

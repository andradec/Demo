package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public abstract class Pessoa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Birthday")
    private LocalDate birthday;

    @Column(name = "Address")
    private Address endereco;

    @Column(name = "Telefone")
    private Telefone telefone;

    public Pessoa(Long id, String name, LocalDate birthday, Address endereco, Telefone telefone) {

        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Address getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}

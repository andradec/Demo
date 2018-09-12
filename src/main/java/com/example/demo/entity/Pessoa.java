package com.example.demo.entity;

import java.time.LocalDate;

public abstract class Pessoa
{
    private Long id;

    private String name;

    private LocalDate birthday;

    private Address endereco;

    private Telfone telfone;

    public Pessoa(Long id, String name, LocalDate birthday, Address endereco, Telfone telfone) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.endereco = endereco;
        this.telfone = telfone;
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

    public Telfone getTelfone() {
        return telfone;
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

    public void setTelfone(Telfone telfone) {
        this.telfone = telfone;
    }
}

package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public enum  Tipo {


    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    CELULAR( "Celular"),
    FAX("Fax");


    String descricao;

    Tipo(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }
}

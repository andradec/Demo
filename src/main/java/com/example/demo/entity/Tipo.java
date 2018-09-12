package com.example.demo.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum  Tipo {

    @Enumerated(value = EnumType.STRING)
            private String tipo;

    COMERCIAL("C", "Comercial"),
    RESIDENCIAL("R", "Residencial"),
    CELULAR("Cel", "Celular"),
    FAX("F", "Fax");


    String descricao;

    Tipo(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }
}

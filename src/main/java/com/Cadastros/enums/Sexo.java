package com.Cadastros.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Sexo {
    A("A", "Ambos"),
    M("M", "Masculino"),
    F("F", "Feminino");

    private String chave;

    private String descricao;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    Sexo(String chave, String descricao){
        this.chave = chave;
        this.descricao = descricao;
    }

    @JsonValue
    public String getValor(){
        switch(this) {
            case M:
            case A:
            case F:
                return getChave();
        }
        return "Inválido";
    }

}
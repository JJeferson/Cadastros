package com.Cadastros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="cidade")
public class Cidade  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long   id_Cidade;
    private String Nome;
    private String Estado;

    public Cidade() {  
    } 

    public Cidade(String nome, String estado) {
        this.Nome   = nome;
        this.Estado = estado;
    }
 
}

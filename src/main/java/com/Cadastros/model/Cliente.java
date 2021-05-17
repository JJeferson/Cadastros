package com.Cadastros.model;

import com.Cadastros.enums.Sexo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long   id_Cliente;

    private String NomeCompleto;

    @Enumerated(EnumType.STRING)
    @Column(length = 1)
    private Sexo sexo;

    private Date DataNascimento;

    private Integer idade;

    Cidade  Cidade;
}

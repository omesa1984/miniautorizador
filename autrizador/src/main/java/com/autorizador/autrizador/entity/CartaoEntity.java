package com.autorizador.autrizador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CartaoEntity {

    /*o atributo "numeroCartao" é String, é o campo identificador do Cartão, e limitado a 16 dígito
    o atributo "senha" é String mas aceita só número limitado a 4 dígitado 
    os dois campos são String e só aceitan números porque podem iniciar com o dígito 0*/

    @Id
    @Column(nullable = false)
    private String numeroCartao;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Double valor;

    public CartaoEntity(String numeroCartao, String senha, Double valor) {
        this.numeroCartao = numeroCartao;
        this.senha = senha;
        this.valor = valor;
    }

    public CartaoEntity() {
    }
    
}

package com.github.juliherms.entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Representa uma classe de entidade de produto
 */
@Entity
public class Produto extends PanacheEntity {
    
    public String nome;
    public BigDecimal valor;

    @CreationTimestamp
    public Date dataCriacao;

    @UpdateTimestamp
    public Date dataAtualizacao;
}

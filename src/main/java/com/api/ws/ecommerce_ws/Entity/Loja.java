package com.api.ws.ecommerce_ws.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "lojas")
public class Loja {
    @GeneratedValue
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToMany
    private Endereco endereco;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "dataIntegracao")
    private String dataIntegracao;
}

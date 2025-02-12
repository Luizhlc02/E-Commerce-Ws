package com.api.ws.ecommerce_ws.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "produto")
public class Produto {
    @GeneratedValue
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nomeProduto;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "valor")
    private int valor ;
    @Column(name = "estoque")
    private int estoque;
}

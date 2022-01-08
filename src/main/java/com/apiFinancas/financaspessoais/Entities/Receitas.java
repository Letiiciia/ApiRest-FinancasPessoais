package com.apiFinancas.financaspessoais.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Receitas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private double valor;
    @Column
    private BigDecimal valor;
    @Column
    @CreationTimestamp
    private Date dataRecebimento;
    @Column
    @CreationTimestamp
    private Date dataRecebimentoEsperado;
    @Column
    private String descricao;
    @Column
    private String conta;
    @Column
    private String tipoReceita;
}

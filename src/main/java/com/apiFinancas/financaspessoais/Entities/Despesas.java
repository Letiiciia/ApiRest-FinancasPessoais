package com.apiFinancas.financaspessoais.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Despesas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private BigDecimal valor;
    @Column
    private Date dataPagamento;
    @Column
    private Date dataPagamentoEsperado;
    @Column
    private String tipoDespesa;
    @Column
    private String conta;
}

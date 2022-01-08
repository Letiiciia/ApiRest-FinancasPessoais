package com.apiFinancas.financaspessoais.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Despesas {
    private BigDecimal valor;
    private Date dataPagamento;
    private Date dataPagamentoEsperado;
    private String tipoDespesa;
    private String conta;
}

package com.apiFinancas.financaspessoais.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Receitas {
    private Long id;
    //private double valor;
    private BigDecimal valor;
    private Date dataRecebimento;
    private Date dataRecebimentoEsperado;
    private String descricao;
    private String conta;
    private String tipoReceita;
}

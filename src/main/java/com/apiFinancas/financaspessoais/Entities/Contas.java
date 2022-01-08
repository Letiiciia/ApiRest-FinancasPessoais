package com.apiFinancas.financaspessoais.Entities;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Contas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private BigDecimal saldo;
    @Column
    private String tipoConta;
    @Column
    private String instituicaoFinanceira;
}

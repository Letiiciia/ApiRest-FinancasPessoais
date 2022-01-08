package com.apiFinancas.financaspessoais.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Contas {
    private BigDecimal saldo;
    private String tipoConta;
    private String instituicaoFinanceira;
}

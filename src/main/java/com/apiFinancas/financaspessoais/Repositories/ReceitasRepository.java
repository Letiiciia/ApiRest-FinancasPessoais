package com.apiFinancas.financaspessoais.Repositories;

import com.apiFinancas.financaspessoais.Entities.Receitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitasRepository extends JpaRepository<Receitas, Long> {
}

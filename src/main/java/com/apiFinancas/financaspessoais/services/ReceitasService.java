package com.apiFinancas.financaspessoais.services;

import com.apiFinancas.financaspessoais.Entities.Receitas;
import com.apiFinancas.financaspessoais.Repositories.ReceitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReceitasService {

    @Autowired
    ReceitasRepository receitasRepository;

    public ResponseEntity<Receitas> cadastrarReceitas(Receitas receitas) {
        try {
            Receitas novaReceita = receitasRepository.save(receitas);
            return ResponseEntity.status(HttpStatus.CREATED).body(novaReceita);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}

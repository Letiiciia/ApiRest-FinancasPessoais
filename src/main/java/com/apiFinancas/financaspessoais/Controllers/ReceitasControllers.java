package com.apiFinancas.financaspessoais.Controllers;

import com.apiFinancas.financaspessoais.Entities.Receitas;
import com.apiFinancas.financaspessoais.services.ReceitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receitas")
public class ReceitasControllers {

    @Autowired
    ReceitasService receitasService;

    @PostMapping
    public ResponseEntity<ResponseEntity<Receitas>> cadastrarReceitas(@RequestBody Receitas receitas) {
        ResponseEntity<Receitas> novasReceitas = receitasService.cadastrarReceitas(receitas);
        return ResponseEntity.status(HttpStatus.CREATED).body(novasReceitas);
    }

}

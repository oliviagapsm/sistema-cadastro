package com.cadastro.resource;

import com.cadastro.service.dto.PessoaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CadastroResource {



    @PostMapping("/cadastro")
    public ResponseEntity<Void> Pessoa(@RequestBody PessoaDTO pessoaDTO) {
        cadastroService.Pessoa(pessoaDTO);
        return ResponseEntity.created(null).build();
    }
}

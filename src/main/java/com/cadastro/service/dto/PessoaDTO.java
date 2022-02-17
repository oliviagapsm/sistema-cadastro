package com.cadastro.service.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PessoaDTO {
    private Integer id;
    private String nome;
    private char email;

    EnderecoDTO endereco;
}

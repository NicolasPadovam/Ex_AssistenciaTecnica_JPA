package br.fiap.assistenciaTecnica.web.dto;

import br.fiap.assistenciaTecnica.domain.Cliente;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EquipamentoDTO {

    private Long id;
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;

}

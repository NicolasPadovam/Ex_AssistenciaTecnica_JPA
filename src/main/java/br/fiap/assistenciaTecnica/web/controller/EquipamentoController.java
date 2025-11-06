package br.fiap.assistenciaTecnica.web.controller;

import br.fiap.assistenciaTecnica.domain.Equipamento;
import br.fiap.assistenciaTecnica.service.EquipamentoService;
import br.fiap.assistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento cadastrar(@RequestBody EquipamentoDTO dto) {
        return service.cadastrar(dto);
    }
}

package br.fiap.assistenciaTecnica.web.controller;

import br.fiap.assistenciaTecnica.service.ClienteService;
import br.fiap.assistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }


    @PostMapping
    //requestbody -> vai quebrar o JSON e transformar em ClienteDTO
    public void cadastrar(@RequestBody ClienteDTO clienteDTO){


    }
}

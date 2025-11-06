package br.fiap.assistenciaTecnica.web.controller;

import br.fiap.assistenciaTecnica.domain.Cliente;
import br.fiap.assistenciaTecnica.domain.Equipamento;
import br.fiap.assistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.assistenciaTecnica.service.ClienteService;
import br.fiap.assistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController - API que so usa json
@RestController
//localhost:8080/cliente
@RequestMapping("/cliente")

public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    //requestbody -> vai quebrar o JSON e transformar em ClienteDTO
    public Cliente cadastrar(@RequestBody ClienteDTO clienteDTO){
       //Jackson ele junta esse objeto para um json e manda pra aplicação
        return service.cadastrar(clienteDTO);
    }

    //Get porque vai pegar algum elemento
    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    //PathVariable -  pega o numero da url e atibui a este metodo
    public Cliente buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @GetMapping("/{id}/equipamento")
    public List<Equipamento> listarEquipamentoPorCliente(@PathVariable Long id){
        return service.listarEquipamentoPorCliente(id);
    }

}

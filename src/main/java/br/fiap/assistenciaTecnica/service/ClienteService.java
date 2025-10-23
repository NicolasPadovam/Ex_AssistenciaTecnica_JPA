package br.fiap.assistenciaTecnica.service;

import br.fiap.assistenciaTecnica.domain.Cliente;
import br.fiap.assistenciaTecnica.repository.ClienteRepository;
import br.fiap.assistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    //chamar o Repository para ter acesso aos métodos CRUD
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {this.repository = repository;}


    public Cliente cadastrar(ClienteDTO clienteDTO){
        var cliente = new Cliente();

        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setSenha(clienteDTO.getSenha());

        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        //orELse retorna um valor depois
        return repository.findById(id).orElse(null);
    }
}

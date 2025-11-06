package br.fiap.assistenciaTecnica.service;

import br.fiap.assistenciaTecnica.domain.Cliente;
import br.fiap.assistenciaTecnica.domain.Equipamento;
import br.fiap.assistenciaTecnica.repository.ClienteRepository;
import br.fiap.assistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.assistenciaTecnica.web.config.SenhaConfig;
import br.fiap.assistenciaTecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    //chamar o Repository para ter acesso aos métodos CRUD
    private final ClienteRepository repository;
    private final EquipamentoRepository equipamentoRepository;
    private final SenhaConfig senhaConfig;

    public ClienteService(ClienteRepository repository, EquipamentoRepository equipamentoRepository, SenhaConfig senhaConfig) {
        this.repository = repository;
        this.equipamentoRepository = equipamentoRepository;
        this.senhaConfig = senhaConfig;
    }

    public Cliente cadastrar(ClienteDTO clienteDTO){
        var cliente = new Cliente();

        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        //codificar a senha
        cliente.setSenha(senhaConfig.encoder().encode(clienteDTO.getSenha()));

        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        //orELse retorna um valor depois
        return repository.findById(id).orElse(null);
    }

    public List<Equipamento> listarEquipamentoPorCliente(Long id){
        return equipamentoRepository.findByClienteId(id);
    }
}

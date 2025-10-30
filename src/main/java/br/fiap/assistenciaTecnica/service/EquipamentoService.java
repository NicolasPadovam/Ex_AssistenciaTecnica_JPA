package br.fiap.assistenciaTecnica.service;

import br.fiap.assistenciaTecnica.domain.Equipamento;
import br.fiap.assistenciaTecnica.repository.ClienteRepository;
import br.fiap.assistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.assistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {

    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO dto){

    }
}

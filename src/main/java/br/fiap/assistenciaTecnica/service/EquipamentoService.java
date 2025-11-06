package br.fiap.assistenciaTecnica.service;

import br.fiap.assistenciaTecnica.domain.Equipamento;
import br.fiap.assistenciaTecnica.repository.ClienteRepository;
import br.fiap.assistenciaTecnica.repository.EquipamentoRepository;
import br.fiap.assistenciaTecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipamentoService {

    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO dto){
        //vai checar se tem algum idCliente para conseguir cadastrar um equipamento
        var cliente = clienteRepository.findById(dto.getIdCliente())
                .orElseThrow(()-> new NoSuchElementException("Cliente não encontrado"));

        var equipamentoEntity = new Equipamento();
        equipamentoEntity.setCliente(cliente);
        equipamentoEntity.setMarca(dto.getMarca());
        equipamentoEntity.setTipo(dto.getTipo());
        equipamentoEntity.setModelo(dto.getModelo());
        equipamentoEntity.setNumeroSerie(dto.getNumeroSerie());
        equipamentoEntity.setDataCadastro(dto.getDataCadastro());

        return equipamentoRepository.save(equipamentoEntity);
    }
}

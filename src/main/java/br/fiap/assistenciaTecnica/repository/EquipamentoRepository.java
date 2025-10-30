package br.fiap.assistenciaTecnica.repository;

import br.fiap.assistenciaTecnica.domain.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}

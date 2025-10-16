package br.fiap.assistenciaTecnica.repository;

import br.fiap.assistenciaTecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}

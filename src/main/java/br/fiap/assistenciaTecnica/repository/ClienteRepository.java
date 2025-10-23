package br.fiap.assistenciaTecnica.repository;

import br.fiap.assistenciaTecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD -  extendendo o JPA com todos os comandos, sendo o Hibernate o implementador
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}

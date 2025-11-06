package br.fiap.assistenciaTecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    //gerar um valor, bom para ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_EQUIP")
    private Long id;

    //CARREGAMENTO PREGUIÇOSO (Lazy) - So é inicializado quando usado
    @ManyToOne(fetch = FetchType.EAGER)
    //CHAVE ESTRANGEIRA PARA FAZER JOIN
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    @Column(name = "TIPO", length = 50, nullable = false)
    private String tipo;

    @Column(name = "MARCA", length = 50)
    private String marca;

    @Column(name = "MODELO", length = 50)
    private String modelo;

    @Column(name = "NUMERO_SERIE", length = 80, unique = true)
    private String numeroSerie;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDate dataCadastro;

}

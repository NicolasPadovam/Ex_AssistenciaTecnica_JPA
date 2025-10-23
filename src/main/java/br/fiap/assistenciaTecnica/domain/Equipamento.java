package br.fiap.assistenciaTecnica.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    //gerar um valor, bom para ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_EQUIP")
    private Long id;

    //CARREGAMENTO PREGUIÇOSO - So é inicializado quando usado
    @ManyToOne(fetch = FetchType.LAZY)
    //CHAVE ESTRANGEIRA PARA FAZER JOIN
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;



}

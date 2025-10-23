package br.fiap.assistenciaTecnica.web.dto;

import lombok.Data;
import lombok.Getter;
//@Data
// Lombok faz o get, set e as outros metodos padrões

// Serve para transitar entre o controller e o service
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

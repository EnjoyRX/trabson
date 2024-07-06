package com.lucas.trabalho.Tecnico;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lucas.trabalho.Chamado.Chamado;
import com.lucas.trabalho.Enums.Perfil;
import com.lucas.trabalho.Pessoa.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @OneToMany(mappedBy = "tecnico")
    List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfil(Perfil.TECNICO);
    }

    public Tecnico(TecnicoDTO tecnico) {
        super(tecnico.getId(), tecnico.getNome(), tecnico.getCpf(), tecnico.getEmail(), tecnico.getSenha());
        addPerfil(Perfil.TECNICO);
    }


    public List<Chamado> getChamados() {
        return this.chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}

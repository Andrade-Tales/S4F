package br.com.safe4woman.S4F.dto;

 // PACOTE DTO: Data Transfer Object (DTO) ou simplesmente Transfer Object é um padrão de projetos
 // bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema,
 // diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

import br.com.safe4woman.S4F.model.Contato;
import br.com.safe4woman.S4F.model.StatusContato;

import javax.validation.constraints.NotBlank;

// Classe RequisicaoNovoContato: Aqui contém os objetos que serão mostrados para o client com contrutor padrão.

public class RequisicaoNovoContato {

    // @NotBlank Anotação usada para que o espaço não fique em branco, uso obrigatório do tipo de dado específico
    // no preenchimento dos dados para cadastro de um novo contato.
    @NotBlank(message = "O nome do contato é obrigatório!")
    private String nomeContato;

    @NotBlank(message = "O endereço do contato é obrigatório!")
    private String endereco;
    @NotBlank(message = "A foto do contato é obrigatório!")
    private String fotoContato;
    @NotBlank(message = "O parentesco do contato é obrigatório!")
    private String parentesco;

    private String descricao;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFotoContato() {
        return fotoContato;
    }

    public void setFotoContato(String fotoContato) {
        this.fotoContato = fotoContato;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // SETANDO OS OBJETOS PARA REQUISIÇÃO DE CRIAÇÃO DE UM NOVO CONTATO COM SEUS RESPECTIVOS CAMPOS;
    public Contato toContato() {
        Contato contato = new Contato();
        contato.setDescricao(descricao);
        contato.setNomeContato(nomeContato);
        contato.setEndereco(endereco);
        contato.setFotoContato(fotoContato);
        contato.setParentesco(parentesco);
        contato.setStatus(StatusContato.ACOMPANHANDO);
        return contato;
    }


}
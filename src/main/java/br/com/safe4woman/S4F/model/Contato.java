package br.com.safe4woman.S4F.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeContato;
    private BigDecimal valorNegociado;
    private LocalDate dataDaEntrega;
    private String fotoContato;

    private String endereco;

    private String parentesco;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusContato status;

    public Contato() {
    }

    public void setStatus(StatusContato status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public StatusContato getStatus() {
        return status;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDate getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(LocalDate dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public String getFotoContato() {
        return fotoContato;
    }

    public void setFotoContato(String fotoContato) {
        this.fotoContato = fotoContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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


}

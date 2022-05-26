package br.com.safe4woman.S4F.model;


import javax.persistence.*;

// CLASSE, MÉTODOS E OBJETOS;
@Entity
public class ContatoDeSeguranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeContato;
    private Long telefone;
    private String email;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusContato status;

    public ContatoDeSeguranca() {
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

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusContato getStatus() {
        return status;
    }

    public void setStatus(StatusContato status) {
        this.status = status;
    }

    // CLASSE ORIGINAL:
//@Entity
//public class Pedido {
//
//    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nomeProduto;
//    private BigDecimal valorNegociado;
//    private LocalDate dataDaEntrega;
//    private String urlProduto;
//    private String urlImagem;
//    private String descricao;
//
//    @Enumerated(EnumType.STRING)
//    private StatusPedido status;
//
//    // CONTRUTOR PADRÃO;
//	public Pedido() {
//	}
//
//    // ENCAPSULAMENTO DOS MÉTODOS COM GETTER E SETTER;
//	public String getNomeProduto() {
//        return nomeProduto;
//    }
//
//    public void setNomeProduto(String nomeProduto) {
//        this.nomeProduto = nomeProduto;
//    }
//
//    public BigDecimal getValorNegociado() {
//        return valorNegociado;
//    }
//
//    public void setValorNegociado(BigDecimal valorNegociado) {
//        this.valorNegociado = valorNegociado;
//    }
//
//    public LocalDate getDataDaEntrega() {
//        return dataDaEntrega;
//    }
//
//    public void setDataDaEntrega(LocalDate dataDaEntrega) {
//        this.dataDaEntrega = dataDaEntrega;
//    }
//
//    public String getUrlProduto() {
//        return urlProduto;
//    }
//
//    public void setUrlProduto(String urlProduto) {
//        this.urlProduto = urlProduto;
//    }
//
//    public String getUrlImagem() {
//        return urlImagem;
//    }
//
//    public void setUrlImagem(String urlImagem) {
//        this.urlImagem = urlImagem;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public StatusPedido getStatus() {
//        return status;
//    }
//
//    public void setStatus(StatusPedido status) {
//        this.status = status;
//    }

}

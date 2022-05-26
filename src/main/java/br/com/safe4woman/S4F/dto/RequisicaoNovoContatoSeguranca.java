package br.com.safe4woman.S4F.dto;


import br.com.safe4woman.S4F.model.ContatoDeSeguranca;
import br.com.safe4woman.S4F.model.StatusContato;
import br.com.safe4woman.S4F.repository.ContatoDeSegurancaRepository;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoContatoSeguranca {
    @NotBlank(message = "O nome do contato é obrigatório")
    private String nomeContato;
    @NotBlank(message = "O telefone do contato é obrigatório")
    private Long telefone;
    @NotBlank(message = "O email do contato é obrigatório")
    private String email;

    private String descricao;
    private StatusContato status;


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

    public ContatoDeSeguranca toContatoDeSeguranca() {
        ContatoDeSeguranca contatoDeSeguranca = new ContatoDeSeguranca();
        contatoDeSeguranca.setNomeContato(nomeContato);
        contatoDeSeguranca.setTelefone(telefone);
        contatoDeSeguranca.setEmail(email);
        contatoDeSeguranca.setDescricao(descricao);
        contatoDeSeguranca.setStatus(StatusContato.AGUARDANDO);
        return contatoDeSeguranca;
    }

}


// CLASSE ORIGINAL:
//public class RequisicaoNovoPedido {
//
//    @NotBlank(message = "O nome do produto é obrigatório!")
//    private String nomeProduto;
//    @NotBlank(message = "A url do produto é obrigatório!")
//    private String urlProduto;
//    @NotBlank(message = "A url da imagem é obrigatório!")
//    private String urlImagem;
//    private String descricao;
//
//    public String getNomeProduto() {
//        return nomeProduto;
//    }
//
//    public void setNomeProduto(String nomeProduto) {
//        this.nomeProduto = nomeProduto;
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
//    public Pedido toPedido() {
//        Pedido pedido = new Pedido();
//        pedido.setDescricao(descricao);
//        pedido.setNomeProduto(nomeProduto);
//        pedido.setUrlImagem(urlImagem);
//        pedido.setUrlProduto(urlProduto);
//        pedido.setStatus(StatusPedido.AGUARDANDO);
//        return pedido;
//    }



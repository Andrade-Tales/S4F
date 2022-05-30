package br.com.safe4woman.S4F.controller;

// IMPORTAÇÃO DOS PACOTES/BIBLIOTECAS USADAS NA CLASSE:
import br.com.safe4woman.S4F.dto.RequisicaoNovoContato;
import br.com.safe4woman.S4F.model.Contato;
import br.com.safe4woman.S4F.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


// Classe ContatoController: Aqui contém os end-points para a requisição web e também seus métodos
// GetMapping e PostMapping.

// @Controller: Basicamente ele é o responsável por controlar as requisições indicando quem deve
// receber as requisições para quem deve responde-las.

// @RequestMapping é a anotação utilizada tradicionalmente para implementar URL handler, ela suporta os
// métodos Post, Get, Put, Delete e Pacth.
@Controller
@RequestMapping("contato")
public class    ContatoController {

    // @Autowired: fornece controle sobre onde e como a ligação entre os beans deve ser realizada.
    // Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários
    // e / ou vários argumentos.
    @Autowired
    private ContatoRepository contatoRepository;

    // @GetMapping: Ele mapeia a classe para o banco.
    @GetMapping("formulario")
    public String formulario(RequisicaoNovoContato requisicao) {
        return "contato/formulario";
    }



    //@PostMapping é uma maneira mais simples de implementar URL handler da anotação @RequestMapping com o
    // método Post.
    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoContato requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "contato/formulario";
        }

        Contato contato = requisicao.toContato();
        contatoRepository.save(contato);

        return "redirect:/home";
    }

    // LÓGICA QUE FAZ O USUÁRIO NÃO CONSEGUIR CADASTRAR SE NOME DO PRODUTO ESTIVER VAZIO;
//        if(requisicao.getNomeProduto() == null || requisicao.getNomeProduto().isEmpty()){
//            return "pedido/formulario";
//        }

//        PORÉM DEFASADO COM A ANOTAÇÃO @NotBlank GERADO PELO HIBERNATE VALIDATOR | ANOTAÇÃO DE MENSAGEM PARA EMITIR UM ERRO: NA CLASSE DOS
//        PEDIDOS (RequisiçãoNovoPedido) SE USA ESSAS ANOTAÇÕES
//           @NotBlank(message:="O nome do produto é obrigatório!")
//        ASSIM SE OS VALORES FOREM NULOS AUTOMATICAMENTE EMITE UMA MENSAGEM DE ERRO!
}

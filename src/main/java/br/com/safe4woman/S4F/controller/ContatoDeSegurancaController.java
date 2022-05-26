package br.com.safe4woman.S4F.controller;

import br.com.safe4woman.S4F.dto.RequisicaoNovoContatoSeguranca;
import br.com.safe4woman.S4F.model.ContatoDeSeguranca;
import br.com.safe4woman.S4F.repository.ContatoDeSegurancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("contato")
public class ContatoDeSegurancaController {

    // INJEÇÃO DE DEPENDÊNCIA;
    @Autowired
    private ContatoDeSegurancaRepository contatoDeSegurancaRepository;

    // MÉTODO GET;
    @GetMapping("formulario")
    public String formulario(RequisicaoNovoContatoSeguranca requisicao) {
        return "contato/formulario";
    }

    // MÉTODO POST;
    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoContatoSeguranca requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "contato/formulario";
        }

        ContatoDeSeguranca contatoDeSeguranca = requisicao.toContatoDeSeguranca();
        contatoDeSegurancaRepository.save(contatoDeSeguranca);
        return "redirect:/home";
    }
}

// CÓDIGO ORIGINAL:
//@Controller
//@RequestMapping("pedido")
//public class PedidoController {
//
//    @Autowired
//    private ContatoDeSegurancaRepository pedidoRepository;
//
//    @GetMapping("formulario")
//    public String formulario(RequisicaoNovoPedido requisicao) {
//        return "pedido/formulario";
//    }
//
//    @PostMapping("novo")
//    public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
//        if (result.hasErrors()) {
//            return "pedido/formulario";
//        }
//
//        Pedido pedido = requisicao.toPedido();
//        pedidoRepository.save(pedido);
//
//        return "redirect:/home";
//    }

// LÓGICA QUE FAZ O USUÁRIO NÃO CONSEGUIR CADASTRAR SE NOME DO PRODUTO ESTIVER VAZIO;
//        if(requisicao.getNomeProduto() == null || requisicao.getNomeProduto().isEmpty()){
//            return "pedido/formulario";
//        }

//        PORÉM DEFASADO COM A ANOTAÇÃO @NotBlank GERADO PELO HIBERNATE VALIDATOR | ANOTAÇÃO DE MENSAGEM PARA EMITIR UM ERRO: NA CLASSE DOS
//        PEDIDOS (RequisiçãoNovoPedido) SE USA ESSAS ANOTAÇÕES
//           @NotBlank(message:="O nome do produto é obrigatório!")
//        ASSIM SE OS VALORES FOREM NULOS AUTOMATICAMENTE EMITE UMA MENSAGEM DE ERRO!


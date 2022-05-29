package br.com.safe4woman.S4F.controller;

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

@Controller
@RequestMapping("contato")
public class    ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoContato requisicao) {
        return "contato/formulario";
    }

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

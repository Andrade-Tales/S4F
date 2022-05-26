package br.com.safe4woman.S4F.controller;


import br.com.safe4woman.S4F.model.ContatoDeSeguranca;
import br.com.safe4woman.S4F.model.StatusContato;
import br.com.safe4woman.S4F.repository.ContatoDeSegurancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ContatoDeSegurancaRepository repository;

    @GetMapping()
    public String home(Model model) {
        List<ContatoDeSeguranca> contatoDeSegurancas = repository.findAll();
        model.addAttribute("contato", contatoDeSegurancas);
        return "home";
    }

    @GetMapping("/{status}")
    public String porStatus(@PathVariable("status") String status, Model model) {
        List<ContatoDeSeguranca> contatoDeSegurancas = repository.findByStatus(StatusContato.AGUARDANDO.valueOf(status.toUpperCase()));
        model.addAttribute("contatos", contatoDeSegurancas);
        model.addAttribute("status", status);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/home";
    }
}

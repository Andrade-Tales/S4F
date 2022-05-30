package br.com.safe4woman.S4F.repository;

import br.com.safe4woman.S4F.model.Contato;
import br.com.safe4woman.S4F.model.StatusContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Classe ContatoRepository: A anotação @Repository (Repositório) é um objeto que isola os objetos ou entidades do
// domínio do código que acessa o banco de dados. Temos que um repositório implementa parte das regras de
// negócio no que se refere à composição das entidades
@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

    // Método que busca na lista de contatos por status;
    List<Contato> findByStatus(StatusContato aguardando);

}
package br.com.safe4woman.S4F.repository;


import br.com.safe4woman.S4F.model.ContatoDeSeguranca;
import br.com.safe4woman.S4F.model.StatusContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoDeSegurancaRepository extends JpaRepository<ContatoDeSeguranca, Long> {
    List<ContatoDeSeguranca> findByStatus(StatusContato aguardando);
}


// CÓDIGO ANTIGO:
//@Repository
//public interface ContatoDeSegurancaRepository extends JpaRepository<Pedido, Long> {
//
//    List<Pedido> findByStatus(StatusPedido aguardando);
//
//}
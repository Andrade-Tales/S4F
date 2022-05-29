package br.com.safe4woman.S4F.repository;



import br.com.safe4woman.S4F.model.Contato;
import br.com.safe4woman.S4F.model.StatusContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

    List<Contato> findByStatus(StatusContato aguardando);

}
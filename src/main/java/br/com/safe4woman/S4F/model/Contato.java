package br.com.safe4woman.S4F.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

// Classe Contato: Onde está os dados de contato, contendo indicação de entidade na classe.
// Aqui se cria a tabela com suas colunas.

// A anotação @Entity é utilizada para informar que uma classe também é uma entidade.
// A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados,
// onde os dados de objetos desse tipo poderão ser persistidos.
@Entity
public class Contato {

    // A anotação @Id é utilizada para informar ao JPA qual campo/atributo de uma entidade estará relacionado à chave
    // primária da respectiva tabela no banco de dados. Essa é uma anotação obrigatória e um erro será
    // gerado em tempo de execução caso ela não esteja presente.

    // A anotação @GeneratedValue serve para falar que o campo mapeado será gerado automaticamente pelo
    // banco de dados, ai temos algumas estratégias para que o próprio banco consiga fazer esse trabalho,
    // quando usamos Identity falamos que deve pegar o último registro daquela tabela e seguir com base naquele.
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


    // Anotação Enumerated: O @Enumerated é usado para podermos instruir um provedor JPA a converter uma
    // enumeração em seu valor ordinal ou String. Se colocarmos a anotação @Enumerated (EnumType. ORDINAL)
    // no campo enum, o JPA usará o valor Enum. ordinal() ao persistir uma determinada entidade no banco de dados.
    // OU SEJA: ENUMERATED persiste e usa outros métodos dentro do framework de persistência para fazer com que
    // a comunicação entre aplicação e banco fique menos acoplada e de fácil inserção de dados.

    @Enumerated(EnumType.STRING)
    private StatusContato status;

    // Construtor padrão.
    public Contato() {
    }

    // MÉTODOS GETTER E SETTER;

        public void setStatus (StatusContato status){
            this.status = status;
        }

        public Long getId () {
            return id;
        }

        public void setId (Long id){
            this.id = id;
        }

        public String getNomeContato () {
            return nomeContato;
        }

        public StatusContato getStatus () {
            return status;
        }

        public void setNomeContato (String nomeContato){
            this.nomeContato = nomeContato;
        }

        public BigDecimal getValorNegociado () {
            return valorNegociado;
        }

        public void setValorNegociado (BigDecimal valorNegociado){
            this.valorNegociado = valorNegociado;
        }

        public LocalDate getDataDaEntrega () {
            return dataDaEntrega;
        }

        public void setDataDaEntrega (LocalDate dataDaEntrega){
            this.dataDaEntrega = dataDaEntrega;
        }

        public String getFotoContato () {
            return fotoContato;
        }

        public void setFotoContato (String fotoContato){
            this.fotoContato = fotoContato;
        }

        public String getEndereco () {
            return endereco;
        }

        public void setEndereco (String endereco){
            this.endereco = endereco;
        }

        public String getParentesco () {
            return parentesco;
        }

        public void setParentesco (String parentesco){
            this.parentesco = parentesco;
        }

        public String getDescricao () {
            return descricao;
        }

        public void setDescricao (String descricao){
            this.descricao = descricao;
        }
    }


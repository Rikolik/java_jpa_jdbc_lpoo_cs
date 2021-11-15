package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_endereco", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, length = 8)
    private String cep;

    @Column(length = 100)
    private String complemento;

    public Endereco() {

    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return this.cep;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setId(int id) throws Exception {
        if (id <= 0)
            throw new Exception("Erro: ID não pode ser menor ou igual a zero!");

        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

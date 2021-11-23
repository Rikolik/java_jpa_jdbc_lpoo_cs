package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tb_patente")
public class Patente implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_patente", sequenceName = "seq_patente_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_patente", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(length = 20)
    private String cor;

    public Patente(){

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
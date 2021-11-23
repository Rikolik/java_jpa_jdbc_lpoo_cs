package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tb_artefato")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public class Artefato implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_artefato", sequenceName = "seq_artefato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_artefato", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(precision = 2)
    private Float peso;

    @Column(precision = 2, nullable = false)
    private Float valor;

    public Artefato(){

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getValor() {
        return valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
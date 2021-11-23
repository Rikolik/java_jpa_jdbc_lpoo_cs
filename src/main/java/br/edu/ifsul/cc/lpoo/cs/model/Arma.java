package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_arma")
@DiscriminatorValue("A")
public class Arma extends Artefato {
    @Column(precision = 2)
    private Float comprimento_cano;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @ManyToMany
    @JoinTable(name = "tb_arma_municao", joinColumns = {@JoinColumn(name = "artefato_id")}, //agregacao, vai gerar uma tabela associativa.
            inverseJoinColumns = {@JoinColumn(name = "municao_id")})
    private List<Municao> municoes;

    public Arma(){

    }

    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public List<Municao> getMunicoes() {
        return municoes;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setMunicoes(List<Municao> municoes) {
        this.municoes = municoes;
    }
}
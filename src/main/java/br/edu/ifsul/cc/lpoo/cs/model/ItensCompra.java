package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name = "tb_itenscompra")
public class ItensCompra implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_itenscompra", sequenceName = "seq_itenscompra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_itenscompra", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(precision = 2, nullable = false)
    private Float quantidade;

    @Column(precision = 2, nullable = false)
    private Float valor;

    @ManyToOne
    @JoinColumn(name = "artefato_id", nullable = false)
    private Artefato artefato;

    @ManyToOne
    @JoinColumn(name = "compra_id", nullable = false)
    private Compra compra;

    public ItensCompra(){

    }

    public Integer getId() {
        return id;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public Artefato getArtefato() {
        return artefato;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
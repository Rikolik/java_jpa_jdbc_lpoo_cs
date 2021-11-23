package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_compra")
public class Compra implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_compra", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;

    @Column(precision = 2)
    private Float total;

    @ManyToOne
    @JoinColumn(name = "jogador_nickname", nullable = false)
    private Jogador jogador;

    @OneToMany(mappedBy = "compra")
    private List<ItensCompra> itens;

    public Compra(){

    }

    public Integer getId() {
        return id;
    }

    public Calendar getData() {
        return data;
    }

    public Float getTotal() {
        return total;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public List<ItensCompra> getItens() {
        return itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setItens(List<ItensCompra> itens) {
        this.itens = itens;
    }
}
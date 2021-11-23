package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_partida")
public class Partida implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_partida", sequenceName = "seq_partida_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_partida", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar inicio;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fim;

    @OneToMany
    @JoinTable(name = "tb_partida_jogador", joinColumns = {@JoinColumn(name = "jogador_nickname")}, inverseJoinColumns = {@JoinColumn(name = "partida_id")})
    private List<Jogador> jogadores;

    public Partida() {

    }

    public Integer getId() {
        return this.id;
    }

    public Calendar getInicio() {
        return this.inicio;
    }

    public Calendar getFim() {
        return this.fim;
    }

    public List<Jogador> getJogadores() {
        return this.jogadores;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}

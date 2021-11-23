package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 * @author Henrique
 */

@Entity
@Table (name = "tb_jogador")
public class Jogador implements Serializable {
    @Id
    private String nickname;

    @Column (nullable = false)
    private String senha;

    @Column
    private Integer pontos;

    @Column (nullable = false)
    @Temporal (TemporalType.TIMESTAMP)
    private Calendar data_cadastro;

    @Column
    @Temporal (TemporalType.TIMESTAMP)
    private Calendar data_ultimo_login;

    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @OneToMany(mappedBy = "jogador")//mappedBy deve apontar para a referencia de jogador dentro de Compra.
    private List<Compra> compras; //agregacao por composicao

    @ManyToMany
    @JoinTable(name = "tb_jogador_artefato", joinColumns = {@JoinColumn(name = "jogador_nickname")}, inverseJoinColumns = {@JoinColumn(name = "artefato_id")})
    private List<Artefato> artefatos;

    @ManyToMany
    @JoinTable(name = "tb_jogador_patente", joinColumns = {@JoinColumn(name = "jogador_nickname")}, inverseJoinColumns = {@JoinColumn(name = "patente_id")})
    private List<Patente> patentes;

    public Jogador() {

    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSenha() {
        return this.senha;
    }

    public Integer getPontos() {
        return this.pontos;
    }

    public Calendar getData_cadastro() {
        return this.data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return this.data_ultimo_login;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public List<Artefato> getArtefatos() {
        return artefatos;
    }

    public List<Patente> getPatentes() {
        return patentes;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }

    public void setPatentes(List<Patente> patentes) {
        this.patentes = patentes;
    }
}

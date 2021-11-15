package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import java.util.Calendar;
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
}

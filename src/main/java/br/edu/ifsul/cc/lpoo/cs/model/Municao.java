package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_municao")
@DiscriminatorValue("M")
public class Municao extends Artefato{
    @Column(nullable = false)
    private Boolean explosiva;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Calibre calibre;

    public Municao(){

    }

    public Boolean getExplosiva() {
        return explosiva;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }
}
package br.edu.ifsul.cc.lpoo.cs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaJPA implements InterfacePersistencia{

    public EntityManagerFactory factory;
    public EntityManager entity;

    public PersistenciaJPA () {
        factory = Persistence.createEntityManagerFactory("pu_CS");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }
}

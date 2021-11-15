package br.edu.ifsul.cc.lpoo.cs.dao;

public interface InterfacePersistencia {
    Boolean conexaoAberta();

    void fecharConexao();
}

package br.edu.ifsul.cc.lpoo.cs.test;

import br.edu.ifsul.cc.lpoo.cs.dao.PersistenciaJPA;
import org.junit.Test;

public class TestPersistenciaJPA {

    @Test
    public void testConexaoGeracaoTabelas() {
        PersistenciaJPA persistencia = new PersistenciaJPA();

        if (persistencia.conexaoAberta()) {
            System.out.println("Abriu conexão com BD via JPA!");

            persistencia.fecharConexao();
        }
        else {
            System.out.println("Não abriu conexão com BD via JPA!");
        }
    }
}

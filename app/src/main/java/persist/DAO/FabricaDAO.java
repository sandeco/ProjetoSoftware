package persist.DAO;

import persist.SQLiteDAO.PessoaDaoSqlite;

public class FabricaDAO {

    public static PessoaDAO criarPessoaDao(){
        return new PessoaDaoSqlite();
    }

}

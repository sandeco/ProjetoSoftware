package persist.SQLiteDAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import model.Pessoa;
import persist.DAO.PessoaDAO;
import persist.DatabaseHelper;

public class PessoaDaoSqlite extends GenericDaoSqlite implements PessoaDAO {



    @Override
    public long salvar(Pessoa p) {

        SQLiteDatabase db = getWritebleDB();
        ContentValues values = new ContentValues();
        values.put("nome",p.getNome());
        long id = db.insert("pessoa",null,values);
        return id;
    }

    @Override
    public void criar(Pessoa p) {

    }

    @Override
    public Pessoa buscar(int id) {
        return null;
    }

    @Override
    public void alterar(Pessoa p) {

    }

    @Override
    public void excluir(Pessoa p) {

    }

    @Override
    public List<Pessoa> listarTodos() {
        return null;
    }
}

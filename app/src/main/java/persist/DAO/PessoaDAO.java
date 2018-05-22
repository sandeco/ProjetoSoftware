package persist.DAO;

import java.util.List;

import model.Pessoa;

public interface PessoaDAO {

    void   criar(Pessoa p);
    Pessoa buscar(int id);
    void   alterar(Pessoa p);
    void   excluir(Pessoa p);

    List<Pessoa> listarTodos();
}

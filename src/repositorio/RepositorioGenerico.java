package repositorio;

import dominio.EntidadeBase;
import java.util.List;
import java.util.Optional;

public interface RepositorioGenerico<T extends EntidadeBase<ID>, ID> {
    void salvar(T entidade);
    Optional<T> buscarPorId(ID id);
    List<T> buscarTodos();
    void deletar(ID id);
}

package repositorio;

import dominio.EntidadeBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class RepositorioBase<T extends EntidadeBase<ID>, ID> implements RepositorioGenerico<T, ID> {
    
    // Simulando um banco de dados em memória
    protected final Map<ID, T> bancoDeDados = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        if (entidade.getId() == null) {
            throw new IllegalArgumentException("A entidade precisa ter um ID para ser salva.");
        }
        bancoDeDados.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(bancoDeDados.get(id));
    }

    @Override
    public List<T> buscarTodos() {
        return new ArrayList<>(bancoDeDados.values());
    }

    @Override
    public void deletar(ID id) {
        bancoDeDados.remove(id);
    }
}

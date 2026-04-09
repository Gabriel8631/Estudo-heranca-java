import java.util.Optional;

public class UsuarioRepositorio extends RepositorioBase<Usuario, Long> {

    // O CRUD (salvar, buscar, deletar) já foi herdado da classe pai.
    // Aqui implementamos APENAS o que for específico de Usuário.

    public Optional<Usuario> buscarPorEmail(String email) {
        return bancoDeDados.values().stream()
                .filter(usuario -> usuario.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}

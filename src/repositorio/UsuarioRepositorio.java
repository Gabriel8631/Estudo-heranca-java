package repositorio;

import dominio.Usuario;
import java.util.Optional;

public class UsuarioRepositorio extends RepositorioBase<Usuario, Long> {

    // O CRUD base já foi herdado! 
    // Aqui implementamos APENAS consultas específicas do Usuário:
    public Optional<Usuario> buscarPorEmail(String email) {
        return bancoDeDados.values().stream()
                .filter(usuario -> usuario.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}

public class Usuario extends EntidadeBase<Long> {
    private String nome;
    private String email;

    public Usuario(Long id, String nome, String email) {
        this.setId(id);
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    // Getters e Setters omitidos para brevidade...
}

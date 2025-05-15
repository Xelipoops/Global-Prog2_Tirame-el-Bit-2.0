package Clases;

public class Usuario {
    private String auth0Id , username;

    public Usuario(String auth0Id, String username, Cliente cliente) {
        this.auth0Id = auth0Id;
        this.username = username;
        cliente.addUsuario(this);
    }
}

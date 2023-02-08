package modelo;
public class Usuario extends Pessoa {

    private boolean aceito;

    public Usuario(String nome, String senha, Boolean nivel) {
        super(nome, senha, nivel);
        this.aceito = false;
    }

    public Boolean getAceito() {
        return this.aceito;
    }
    public void setAceito(Boolean aceito) {
        this.aceito = aceito;
    }

}

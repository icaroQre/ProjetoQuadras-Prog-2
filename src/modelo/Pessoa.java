package modelo;
public class Pessoa {
    
    private String nome;
    private String senha;
    private boolean nivel;

    public Pessoa(String nome, String senha, Boolean nivel){

        this.nome = nome;
        this.senha = senha;
        this.nivel = nivel;

    }

    public String getNome (){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha (){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public Boolean getNivel (){
        return this.nivel;
    }
    public void setNivel (Boolean nivel){
        this.nivel = nivel;
    }
    
}

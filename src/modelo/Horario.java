package modelo;
public class Horario {
    
    private String usuario;
    private Integer horario;
    private String data;

    public Horario (String usuario, Integer horario){

        this.usuario = usuario;
        this.horario = horario;

    }

    public String getUsuario() {
        return this.usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Integer getHorario() {
        return this.horario;
    }
    public void setHorario(Integer horario) {
        this.horario = horario;
    }

}

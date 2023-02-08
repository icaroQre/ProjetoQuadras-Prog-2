package modelo;
import java.util.ArrayList;
import java.util.List;

public class Quadra {
    
    ArrayList <Horario> listaHorarios = new ArrayList<>();

    public Quadra () {

    }

    public ArrayList<Horario> getListaHorarios(){
        return this.listaHorarios;
    }

    public void reservarQuadra(Horario horario) {

        //cadastra o horario na lista se ainda estiver disponivel
        //caso seja um usuario se usuario.aceito = true;

    }

}

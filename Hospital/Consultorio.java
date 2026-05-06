package hospital;

import java.util.Observable;

public class Consultorio extends Observable {

    private Integer ano;
    private Integer mes;
    private String nomeEspecialidade;
    private String nomeConsultorio;

    public Consultorio(Integer ano, Integer mes, String nomeEspecialidade, String nomeConsultorio) {
        this.ano = ano;
        this.mes = mes;
        this.nomeEspecialidade = nomeEspecialidade;
        this.nomeConsultorio = nomeConsultorio;
    }

    public void realizarConsulta() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "ano=" + ano +
                ", mes=" + mes +
                ", nomeEspecialidade='" + nomeEspecialidade + '\'' +
                ", nomeConsultorio='" + nomeConsultorio + '\'' +
                '}';
    }
}
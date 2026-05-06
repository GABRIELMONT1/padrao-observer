package hospital;

public class Main {
    public static void main(String[] args) {

        Consultorio consultorio = new Consultorio(2024, 5, "Cardiologia", "A");

        Paciente paciente1 = new Paciente("João");
        Paciente paciente2 = new Paciente("Maria");

        paciente1.agendar(consultorio);
        paciente2.agendar(consultorio);

        consultorio.realizarConsulta();

        System.out.println(paciente1.getUltimaNotificacao());
        System.out.println(paciente2.getUltimaNotificacao());
    }
}
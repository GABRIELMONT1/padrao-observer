package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsultorioTeste {

    @Test
    void deveNotificarUmPaciente() {
        Consultorio consultorio = new Consultorio(2024, 5, "Cardiologia", "A");
        Paciente paciente = new Paciente("Joao");
        paciente.agendar(consultorio);
        consultorio.realizarConsulta();
        assertEquals("Joao, consulta realizada no Consultorio{ano=2024, mes=5, nomeEspecialidade='Cardiologia', nomeConsultorio='A'}", paciente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPacientes() {
        Consultorio consultorio = new Consultorio(2024, 5, "Cardiologia", "A");
        Paciente paciente1 = new Paciente("Joao");
        Paciente paciente2 = new Paciente("Maria");
        paciente1.agendar(consultorio);
        paciente2.agendar(consultorio);
        consultorio.realizarConsulta();
        assertEquals("Joao, consulta realizada no Consultorio{ano=2024, mes=5, nomeEspecialidade='Cardiologia', nomeConsultorio='A'}", paciente1.getUltimaNotificacao());
        assertEquals("Maria, consulta realizada no Consultorio{ano=2024, mes=5, nomeEspecialidade='Cardiologia', nomeConsultorio='A'}", paciente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarPaciente() {
        Consultorio consultorio = new Consultorio(2024, 5, "Cardiologia", "A");
        Paciente paciente = new Paciente("Joao");
        consultorio.realizarConsulta();
        assertNull(paciente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPacienteConsultorioA() {
        Consultorio consultorioA = new Consultorio(2024, 5, "Cardiologia", "A");
        Consultorio consultorioB = new Consultorio(2024, 5, "Cardiologia", "B");
        Paciente paciente1 = new Paciente("Joao");
        Paciente paciente2 = new Paciente("Maria");
        paciente1.agendar(consultorioA);
        paciente2.agendar(consultorioB);
        consultorioA.realizarConsulta();
        assertEquals("Joao, consulta realizada no Consultorio{ano=2024, mes=5, nomeEspecialidade='Cardiologia', nomeConsultorio='A'}", paciente1.getUltimaNotificacao());
        assertNull(paciente2.getUltimaNotificacao());
    }
}
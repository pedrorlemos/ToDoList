package model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TarefaTest {

    @Test
    void naoDeveCriarTarefaComTituloVazio() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tarefa("","estudar pelo curso do nélio", LocalDate.of(2026,11,25)));
    }

    @Test
    void naoDeveCriarTarefaComTituloNulo() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tarefa(null,"estudar pelo curso do nélio", LocalDate.of(2026,11,25)));
    }

    @Test
    void naoDeveCriarTarefaComDataLimiteNula(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Tarefa("estudar java", "estudar pelo curso do nélio", null));
    }

    @Test
    void naoDeveAlterarTituloNuloComSetTitulo(){
        Tarefa tarefa1 = new Tarefa("estudar java", "estudar pelo curso do nélio", LocalDate.of(2026, 11, 25));
        Assertions.assertThrows(IllegalArgumentException.class, () -> tarefa1.setTitulo(""));
    }
}

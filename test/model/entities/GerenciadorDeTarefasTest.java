package model.entities;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class GerenciadorDeTarefasTest{
    @Test
    void deveDeixarDeEstarVazioAoAdicionarTarefa() {

        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Tarefa tarefa1 = new Tarefa("estudar java", "estudar pelo curso do nélio", LocalDate.of(2026,11,25));

        gerenciador.adicionarTarefa(tarefa1);
        Assertions.assertFalse(gerenciador.estaVazio());

    }

}
package application;

import model.entities.GerenciadorDeTarefas;
import model.entities.Tarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main{
    public static void main(String[] args){

        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        gerenciador.adicionarTarefa(new Tarefa("estudar java", "estudar pelo curso do nélio", LocalDate.parse("25/11/2026",dtf)));
        gerenciador.adicionarTarefa(new Tarefa("arrumar o quarto", "arrumar quarto do meu irmao", LocalDate.parse("22/10/2026",dtf)));
        gerenciador.adicionarTarefa(new Tarefa("comprar pão", "comprar pão no 5 irmaos", LocalDate.parse("20/10/2026",dtf)));


        List<Tarefa> teste = gerenciador.getTarefas();
        teste.remove(1);
        System.out.println("teste: "+ teste.size());
        System.out.println("original: "+ gerenciador.getTarefas().size());

    }
}
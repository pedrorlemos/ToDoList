package model.entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas = new  ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    private boolean indiceValido(int indice) {
        return indice >= 0 && indice < tarefas.size();
    }

    public boolean estaVazio(){
        return tarefas.isEmpty();
    }

    public boolean removerTarefa(int indice){
        indice = indice - 1;
        if(!indiceValido(indice)){
            return false;
        }
        tarefas.remove(indice);
        return true;
    }

    public boolean concluirTarefa(int indice){
        indice = indice - 1;
        if(!indiceValido(indice)){
            return false;
        }
        tarefas.get(indice).concluir();
        return true;
    }

    public boolean alterarDescricao(int indice,String descricao){
        indice = indice - 1;
        if(!indiceValido(indice)){
            return false;
        }
        tarefas.get(indice).setDescricao(descricao);
        return true;
    }

    public List<Tarefa> getTarefas(){
        return new ArrayList<>(tarefas);
    }

    public List<Tarefa> getTarefasPendentes(){
        List<Tarefa> pendentes = new ArrayList<>();
        for(int i = 0; i < tarefas.size(); i++) {
            if (!tarefas.get(i).isConcluido()) {
                pendentes.add(tarefas.get(i));
            }
        } return pendentes;
    }
}

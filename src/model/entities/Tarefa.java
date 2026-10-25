package model.entities;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataLimite;
    private boolean concluido;


    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        validarTitulo(titulo);
        if(dataLimite == null) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.concluido = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setTitulo(String titulo) {
        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void concluir(){
        this.concluido = true;
    }

    private void validarTitulo(String titulo){
        if(titulo == null) {
            throw new IllegalArgumentException("Título inválido");
        }
        if(titulo.isBlank()) {
            throw new IllegalArgumentException("Título inválido");
        }
    }

    @Override
    public String toString() {
        return " | Tarefa: " + titulo
                + " | Descrição: " + descricao
                + " | Prazo: " + dataLimite + "|";
    }
}



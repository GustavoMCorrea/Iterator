package org.example;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private LocalDate dataUltimaRecarga;

    public Cliente(String nome, String telefone, String cpf, LocalDate dataUltimaRecarga) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataUltimaRecarga = dataUltimaRecarga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataUltimaRecarga() {
        return dataUltimaRecarga;
    }

    public void setDataUltimaRecarga(LocalDate dataUltimaRecarga) {
        this.dataUltimaRecarga = dataUltimaRecarga;
    }
}

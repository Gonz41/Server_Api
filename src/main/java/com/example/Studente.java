package com.example;

public class Studente {
    private String nome;
    private String cognome;
    private String nascita;

    public Studente(){}

    public Studente(String n, String cognome, String na){
        this.nome = n;
        this.cognome = cognome;
        this.nascita = na;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getNascita() {
        return nascita;
    }


    public void setNascita(String nascita) {
        this.nascita = nascita;
    }

    @Override
    public String toString(){
        String s = "Nome:"+nome+"\t\tCognome:"+cognome+"\t\tNascita:"+nascita+",";
        return s;
    }
}

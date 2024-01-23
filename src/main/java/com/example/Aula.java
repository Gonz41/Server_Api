package com.example;

import java.util.ArrayList;

public class Aula {
    ArrayList<Studente> alunni;
    Integer numero;
    String sezione;
    String aula;

    public Aula(){
        alunni = new ArrayList<Studente>();
    }

    public Aula(Integer numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        alunni = new ArrayList<Studente>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Studente> getStudente() {
        return alunni;
    }

    public void setStudente(ArrayList<Studente> alunni) {
        this.alunni = alunni;
    }

    public void addStudente(Studente s){
        alunni.add(s);
    }

    @Override
    public String toString(){
        String string = numero + "," + sezione + "," + aula + ":";
        for(Studente s : alunni){
            string += s.toString() + "/";
        }
        return string;
    }
}

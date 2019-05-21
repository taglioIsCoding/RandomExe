/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioere;

/**
 *
 * @author Gianni
 */
public class Persona {
    protected String nome;
    protected String cognome;
    protected int gDiNascita;

    public Persona(String nome, String cognome, int gDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.gDiNascita = gDiNascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setgDiNascita(int gDiNascita) {
        this.gDiNascita = gDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getgDiNascita() {
        return gDiNascita;
    }
    
    public void printAll(){
        System.out.println(this.getNome());
        System.out.println(this.getCognome());
        System.out.println(this.getgDiNascita());
    }
    
    
}

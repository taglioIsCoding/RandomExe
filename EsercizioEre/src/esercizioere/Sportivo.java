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
public class Sportivo extends Persona{
    
    protected String federazione;
    
    public Sportivo(String nome, String cognome, int gDiNascita, String federzione) {
        super(nome, cognome, gDiNascita);
        this.federazione = federazione;
    }

    public void setFederazione(String federazione) {
        this.federazione = federazione;
    }

    public String getFederazione() {
        return federazione;
    }
    
    @Override
    public void printAll(){
        System.out.println(this.getCognome());
        System.out.println(this.getFederazione());
        
    }
    
}

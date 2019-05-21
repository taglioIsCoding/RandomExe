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
public class Skater extends Sportivo {
    
    private double skateSize;
    
    public Skater(String nome, String cognome, int gDiNascita, String federzione, double skateSize) {
        super(nome, cognome, gDiNascita, federzione);
        this.skateSize = skateSize;
        
    }

    public void setSkateSize(double skateSize) {
        this.skateSize = skateSize;
    }

    public double getSkateSize() {
        return skateSize;
    }
    
    @Override
    public void printAll(){
        System.out.println(this.getNome());
        System.out.println(this.getFederazione());
        System.out.println(this.getSkateSize());
    }    
}
    
    
    


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
public class EsercizioEre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Paolino = new Persona("Paolino", "Bianchi", 5);
        Sportivo io = new Sportivo("Paolino", "Bianchi", 5, "Sii");
        Sportivo z = new Skater("Paolino", "Bianchi", 5, "Sii", 8.6);
        
        z.printAll();
    }
    
}

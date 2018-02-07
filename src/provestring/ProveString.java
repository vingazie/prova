/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provestring;


import javax.swing.JOptionPane;
import java.util.regex.Pattern;
/**
 *
 * @author Vincenzo
 */
public class ProveString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ATTENZIONE!!! Le prime due dichiarazioni equivalgono alla creazione di un oggetto.
        //String è una classe particolare per cui non è strettamente necessario
        //richiamare un costruttore con new per creare una nuova stringa.
        String nome1 = "Pippo";
        String nome2 = "Pippo";
        String nome3 = new String ("Pippo");
        String a = "Pi";
        String b = "ppo";
        String nome4 = a + b;
        char[] nome5 = {'P','i','p','p','o'};
        
        String nome6 = JOptionPane.showInputDialog("Inserisci un nome");
        int etaPippo = 30;
        
        String nomeX = "Pippo2";
         
        containsNumber(nomeX);
        
        System.out.println("Confronto tra due stringhe dichiarate normalmente");
        //La stringa "Pippo" creata e assegnata inizialmente al riferimento nome1, 
        //è un oggetto unico in memoria, anche se viene assegnata 
        //successivamente al riferimento nome2 (confronto profondo)
        System.out.println(nome1==nome2); //ci dà true perchè è esattamente lo stesso oggetto
        
        //la seguente operazione ci dà true perchè nome1 e nome2 
        //sono puntatori allo stesso oggetto e hanno, ovviamente, lo stesso valore 
        System.out.println(nome1.equals(nome2));
        
        
        System.out.println("Confronto tra due stringhe di cui una creata con new String");
        System.out.println(nome1==nome3);
        
        System.out.println(nome1.equals(nome3));
        
        System.out.println("Confronto tra due stringhe di cui una creata da una concatenazione");
        //ci dà false perchè nome proviene dalla concatenazione di due oggetti diversi "Pi" e "ppo"
        System.out.println(nome1==nome4);
        
        //ci dà true perchè fa un confronto superficiale
        System.out.println(nome1.equals(nome4));
        
        
        System.out.println("Confronto tra due stringhe di cui una creatacome array di caratteri");
        //System.out.println(nome1==nome5);
        
        System.out.println(nome1.equals(nome5));
        
        System.out.println("Confronto tra due stringhe di cui una presa in input");
        System.out.println(nome1==nome6);
        
        System.out.println(nome1.equals(nome6));
        
        
        //concatenazione automatica tra una String e un tipo nativo
        System.out.println("L'età di Pippo è : " + etaPippo);
        
        //TODO - concatenazione automatica tra String e un altro oggetto (rimandata a studio Object e toString)
        
        //TODO - metodo equalsIgnoreCase
        
        //TODO - metodo compareTo
        if (nome2.compareTo(nome6)==0){
            System.out.println("[CompareTo] primo nome uguale al secondo nome");
        }
        else{
            System.out.println("[CompareTo] primo nome diverso dal secondo nome");
        }
        
        if (nome2.equalsIgnoreCase(nome6)){
            System.out.println("[equalsIgnoreCase ] primo nome uguale al secondo nome");
        }
        else{
            System.out.println("[equalsIgnoreCase ] primo nome diverso dal secondo nome");
        }
        
        //Stringa oggetto immutabile e condiviso
        String frase = "Ciao Mondo";
        
        System.out.println("La frase risultato operazione: [" + frase.replace("Mondo", "Universo") + "]");
        String altraFrase = frase.replace("Mondo", "Universo");
        System.out.println("La frase è: [" + frase + "]");
        System.out.println("L'altra frase è: [" + altraFrase + "]");
        
        frase = frase.replace("Mondo","Universo");
        System.out.println("La frase è: [" + frase + "]");
        
        
        StringBuffer parola = new StringBuffer("prova");
        parola.reverse();
        System.out.println("La parola è: [" + parola + "]");
        
        
    }

    private static boolean containsNumber(String parola) {
        
        return Pattern.matches(".\\d.",parola);
        
        //Set numbers = new Set({1,2,3,4,5,6,7,8,9,0});
        
    }
    
    
    
}

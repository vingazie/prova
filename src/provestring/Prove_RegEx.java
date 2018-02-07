/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provestring;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Vincenzo
 * Questo programma spiega l'utilità delle espressioni regolari
 * In particolare offre tre possibili modi per risolvere il 
 * problema proposto in laboratorio
 */
public class Prove_RegEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringa = "";
        String vuoiContinuare;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Inserisci una stringa");
            stringa = sc.nextLine();
            
            if (stupidContainsNumber(stringa)){
                System.out.println("Parola contiene numero");
            }
            else{
                System.out.println("Parola senza numeri");
            }
            System.out.println("Vuoi continuare s/n?");
            vuoiContinuare = sc.nextLine();
        }while(vuoiContinuare.equals("s"));
    }

    
    //Nelle espressioni regolari il punto . indica un qualsiasi carattere
    //L'asterisco messo dopo un simbolo particolare indica che 
    //possono esserci zero, una o più occorrenze di quel simbolo
    //Quindi .* significa una sequenza di lunghezza imprecisata di 
    //composta da qualsiasi carattere.
    //Quindi la stringa usata in questo metodo significa
    //una qualsiasi stringa iniziale (anche vuota)
    //seguita da un numero seguito da una qualsiasi stringa finale (anche vuota)

    private static boolean smartContainsNumber(String stringa) {
        return Pattern.matches(".*\\d.*",stringa);
    }
    
    
    //Questa è una versione meno intelligente 
    //Viene controllato carattere per carattere se si trova un numero
    //Si usa la funzione sottostringa in modo che prenda
    //tutte le sottostringhe di lunghezza 1 controllando
    // l'espressione regolare \\d significa un singolo numero
    private static boolean containsNumber(String stringa) {
        System.out.println("Lunghezza stringa: "+ stringa.length());
        for(int i=0;i<stringa.length();i++){
            if(Pattern.matches("\\d",stringa.substring(i, i+1))){
                return true;
            }
        }
        return false;
    }
    
    //Questo metodo confronta se ogni carattere 
    //è uguale a uno dei dieci simboli numerici.
    //funziona ugualmente ma ci costringe a mettere in or
    //dieci condizioni.
    private static boolean stupidContainsNumber(String stringa) {
    for(int i=0;i<stringa.length();i++){
        if(stringa.substring(i, i+1).equals("0") ||
           stringa.substring(i, i+1).equals("1")||     
           stringa.substring(i, i+1).equals("2") ||     
           stringa.substring(i, i+1).equals("3") ||     
           stringa.substring(i, i+1).equals("4")||
           stringa.substring(i, i+1).equals("5")||
           stringa.substring(i, i+1).equals("6")||
           stringa.substring(i, i+1).equals("7")||     
           stringa.substring(i, i+1).equals("8") ||
           stringa.substring(i, i+1).equals("9")){
            return true;
        }
    }
    return false;
}
    
}
   
    
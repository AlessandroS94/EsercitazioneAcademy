package it.academy.corso;

import it.academy.corso.impl.Tv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
    	Tv tv= new Tv();
    	
    	ArrayList <String> canalini = new ArrayList<>();
       canalini=tv.getCanali();
       
       int n;
       
       System.out.println("quanti canali vuoi inserire ?");
       n= input.nextInt();
       
       System.out.println("inserisci i canali");
       for(int i=0; i<n;i++)
       {
       
       canalini.add(input.next());
       
       }
       System.out.println(canalini);
       
       System.out.println(tv.toStringRicorsivo(0));
        
        System.out.println("--------------------------");
      try {
        tv.cambiaCanaleHub(1);
        
        System.out.println(tv.getCanaleGuardato());
      }
      catch(InputMismatchException e){
    	  System.out.println("Errore "+e);
    	  System.out.println("canale non trovato");
    	  
      }
    		  
        
        
    
}
}
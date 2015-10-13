package dicegame;

import java.util.*;


public class Main {

   
    public static void main(String[] args) {
        Random dice = new Random();
        PlayerHuman player = new PlayerHuman();
        int target, chosen;
        
        do {            
            target = dice.nextInt(6)+1;
            chosen = player.guess();
            
            if(target!=chosen)
                System.out.println("Pudlo! Wylosowalem: " + target + ", Twoj wybor to: " + chosen);
            
        }while(target!=chosen);
        
        System.out.println("Brawo! Wylosowalem: " + target + ", Twoj wybor to: " + chosen);
    };
}

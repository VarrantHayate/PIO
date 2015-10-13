package dicegame;

import dicegame.players.PlayerComp;
import dicegame.players.Player;
import java.util.*;


public class Main {

   
    public static void main(String[] args) {
        Random dice = new Random();
        Player player = new PlayerComp();       //TYP: PLAYER JAKO KLASA NADRZĘDNA! + wszystkie klasy w javie dziedziczą po OBJECT, unikaj
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

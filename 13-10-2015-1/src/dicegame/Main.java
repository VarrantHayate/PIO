package dicegame;

import java.util.*;

//Poznaj i zrozum metodę OTWARTE ZAMKNIĘTE
//GitHub!

public class Main {

   
    public static void main(String[] args) {
        Random dice = new Random();
        Player player = new Player();
        int target;
        
        do {            
            target = dice.nextInt(6)+1;
            
            if(target!=player.guess())
                System.out.println("Pudlo! Wylosowalem: " + target + ", Twoj wybor to: " + player.guess());
            
        }while(target!=player.guess());
        
        System.out.println("Brawo! Wylosowalem: " + target + ", Twoj wybor to: " + player.guess());
    };
}

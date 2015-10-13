package dicegame;
import java.util.*;

public class PlayerHuman {
    
    private
        Scanner odczyt = new Scanner(System.in);
        int dice;
    
    public int guess() {
        System.out.print("Podaj liczbe: ");
        dice = odczyt.nextInt();
        return dice;   
    }
    
}

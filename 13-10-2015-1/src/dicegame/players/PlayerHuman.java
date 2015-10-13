package dicegame.players;
import java.util.*;

public class PlayerHuman extends Player {
    
    private
        Scanner odczyt = new Scanner(System.in);
        int dice;
    
    @Override
    public int guess() {
        System.out.print("Podaj liczbe: ");
        dice = odczyt.nextInt();
        return dice;   
    }
    
}

package dicegame;
import java.util.*;

public class Player {
    
    private
        Random dice = new Random();
    
    public int guess() {
        return dice.nextInt(6)+1;   
    }
    
}

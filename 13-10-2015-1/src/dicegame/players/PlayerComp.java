package dicegame.players;
import java.util.*;

public class PlayerComp extends Player {
    
    private
        Random dice = new Random();
    
    @Override
    public int guess() {
        return dice.nextInt(6)+1;   
    }
    
}

import interfaces.ICard;
import interfaces.ILift;

/**
 * Created by Dell on 28.11.2016.
 */
public class Skipass implements ICard {
    private ILift liftStrategy;
    private long id;

    public Skipass(ILift liftStrategy){
        this.liftStrategy = liftStrategy;
    }

    public void showBalance() {

    }

    public void getPass() {
        liftStrategy.getPass();
    }
}

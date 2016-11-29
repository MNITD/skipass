import interfaces.ICard;
import interfaces.ILift;

/**
 * Created by Dell on 28.11.2016.
 */
public class Skipass implements ICard {
    private ILift liftStrategy;
    private long id;
    private boolean isActive;

    public Skipass(ILift liftStrategy, long id){
        this.liftStrategy = liftStrategy;
        this.id = id;
        isActive = true;
    }

    public boolean checkValidation(){
        return isActive && liftStrategy.checkValidation();
    }

    public long getId() {
        return id;
    }
    public void disable(){
        isActive = false;
    }
    public void reactivate(){
        isActive = true;
    }
}

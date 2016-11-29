package lift;

import interfaces.ILift;

/**
 * Created by Dell on 28.11.2016.
 */
public class NumbersLiftStrategy implements ILift {
    private int numberOfTimesToLift;

    public NumbersLiftStrategy(int numberOfTimesToLift) {
        this.numberOfTimesToLift = numberOfTimesToLift;
    }

    public boolean checkValidation() {
         if (numberOfTimesToLift > 0){
            numberOfTimesToLift--;
             return true;
        }
        return false;
    }

}

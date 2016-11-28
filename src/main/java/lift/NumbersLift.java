package lift;

import interfaces.ILift;

/**
 * Created by Dell on 28.11.2016.
 */
public class NumbersLift implements ILift {
    private int numberOfTimesToLift;

    public boolean checkValidation() {
        return numberOfTimesToLift > 0 ;
    }

    public void getPass() {
        numberOfTimesToLift--;
    }
}

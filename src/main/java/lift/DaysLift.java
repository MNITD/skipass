package lift;

import interfaces.ILift;

import java.util.Date;

/**
 * Created by Dell on 28.11.2016.
 */
public class DaysLift implements ILift {
    private Date endData;

    public boolean checkValidation() {
        return true;
    }

    public void getPass() {

    }
}

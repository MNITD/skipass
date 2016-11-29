package lift;

import interfaces.ILift;

import java.util.Date;

/**
 * Created by Dell on 28.11.2016.
 */
public class DaysLiftStrategy implements ILift {
    private Date endDate;

    public DaysLiftStrategy(long endDate) {
        this.endDate.setTime(endDate);
    }

    public boolean checkValidation() {
        Date currentDate = new Date();
        if (currentDate.getTime() > endDate.getTime()) {
            return false;
        }
        return true;
    }

}

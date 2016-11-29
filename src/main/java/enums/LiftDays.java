package enums;

import interfaces.ILift;

/**
 * Created by Dell on 28.11.2016.
 */
public enum LiftDays {
    ONE_DAY,
    TWO_DAYS,
    FIVE_DAYS;

    public int toInt(){
        switch (this){
            case ONE_DAY:
                return 1;
            case TWO_DAYS:
                return 2;
            case FIVE_DAYS:
                return 5;
            default:
                return 0;
        }
    }
    public long toMS() {
        return this.toInt()*1000*60*60*24;
    }
}

package enums;

/**
 * Created by Dell on 28.11.2016.
 */
public enum LiftNumbers {
    TEN_LIFTS,
    TWENTY_LIFTS,
    FIFTY_LIFTS,
    HUNDRED_LIFTS;

    public int toInt(){
        switch (this){
            case TEN_LIFTS:
                return 10;
            case TWENTY_LIFTS:
                return 20;
            case FIFTY_LIFTS:
                return 50;
            case HUNDRED_LIFTS:
                return 100;
            default:
                return 0;
        }
    }
}

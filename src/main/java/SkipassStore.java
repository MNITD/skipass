import decorators.WeekSkipassDecorator;
import lift.DaysLift;
import lift.ILift;
import lift.NumbersLift;

/**
 * Created by Dell on 28.11.2016.
 */
public class SkipassStore {
    public ICard getSkipass(SkipassTypes type,){
        ICard card;
        ILift lift;
        switch (type){
            case WEEK_DAYS:
                 lift = generateLift(true);
                card = new Skipass(lift);
                card = new WeekSkipassDecorator(card);
                break;
            case WEEK_TIMES:
                 lift = generateLift(false);
                break;
            case WEEKEND_DAYS:
                lift = generateLift(true);
                break;
            case SEASONE:
                break;
            default:
                break;
        }
    }
    public ILift generateLift(boolean isDaysLift){
        if(isDaysLift){
            return generateDaysLift();
        }
        else{
            return generateNumbersLift();
        }
    }

    public DaysLift generateDaysLift(){
        return new DaysLift();
    }
    public NumbersLift generateNumbersLift(){
        return new NumbersLift();
    }

}


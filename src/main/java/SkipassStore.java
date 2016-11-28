import decorators.SeasonSkipassDecorator;
import decorators.WeekSkipassDecorator;
import decorators.WeekendSkipassDecorator;
import enums.LiftType;
import enums.SkipassTypes;
import interfaces.ICard;
import lift.DaysLift;
import interfaces.ILift;
import lift.NumbersLift;

/**
 * Created by Dell on 28.11.2016.
 */
public class SkipassStore {
    public ICard generateSkipass(SkipassTypes skipassType, LiftType liftType){
        ICard card;
        ILift lift= null;

        switch(liftType){
            case DAYS:
                lift = generateDaysLift();
                break;
            case NUMBERS:
                lift = generateNumbersLift();
                break;
            default:
                break;
        }
        card = new Skipass(lift);

        switch (skipassType){
            case WEEK:
                card = new WeekSkipassDecorator(card);
                break;
            case WEEKEND:
                card = new WeekendSkipassDecorator(card);
                break;
            case SEASON:
                card = new SeasonSkipassDecorator(card);
                break;
            default:
                break;
        }
        return card;
    }

    public DaysLift generateDaysLift(){
        return new DaysLift();
    }
    public NumbersLift generateNumbersLift(){
        return new NumbersLift();
    }

}


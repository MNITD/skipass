import decorators.SeasonSkipassDecorator;
import decorators.WeekSkipassDecorator;
import decorators.WeekendSkipassDecorator;
import enums.LiftDays;
import enums.LiftNumbers;
import enums.SkipassTypes;
import interfaces.ICard;
import interfaces.IObservable;
import interfaces.IObserver;
import lift.DaysLiftStrategy;
import interfaces.ILift;
import lift.NumbersLiftStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observer;

/**
 * Created by Dell on 28.11.2016.
 */
public class SkipassSystem implements IObserver {
    private ArrayList<ICard> skipasses;
    private ArrayList<PassLog>loglist;
    private IObservable observable;

    public SkipassSystem(IObservable observable) {
        this.skipasses = new ArrayList<ICard>();
        this.loglist = new ArrayList<PassLog>();
        this.observable = observable;
        observable.addListener(this);
    }

    public ILift generateLiftStrategy(LiftNumbers liftNumber) {
        return generateNumbersLiftStrategy(liftNumber);
    }

    public ILift generateLiftStrategy(LiftDays liftDays) {
        return generateDaysLiftStrategy(liftDays);
    }

    public ICard generateSkipass(SkipassTypes skipassType, ILift lift) {
        ICard card;
        long id = 0;
        if (!skipasses.isEmpty()) {
            id = ((Skipass) skipasses.get(skipasses.size() - 1)).getId() + 1;
        }
        card = new Skipass(lift, id);

        switch (skipassType) {
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
        skipasses.add(card);
        return card;
    }

    private DaysLiftStrategy generateDaysLiftStrategy(LiftDays liftDays) {
        Date date = new Date();
        long msEndLimit = date.getTime() + liftDays.toMS();
        // to get days, should divide on 1000 * 60 * 60 * 24
        return new DaysLiftStrategy(msEndLimit);
    }

    private NumbersLiftStrategy generateNumbersLiftStrategy(LiftNumbers liftNumbers) {
        return new NumbersLiftStrategy(liftNumbers.toInt());
    }

    public void blockSkipass(long id) {
        setActivityState(id, false);
    }

    public void unblockSkipass(long id) {
        setActivityState(id, true);
    }

    private void setActivityState(long id, boolean state) {
        for (ICard card : skipasses) {
            if (((Skipass) card).getId() == id) {
                if (state) {
                    ((Skipass) card).reactivate();
                } else {
                    ((Skipass) card).disable();
                }
            }
        }
    }


    public static void main(String[] args) {
        Turnstile turnstile = new Turnstile();
        SkipassSystem skipSystem = new SkipassSystem(turnstile);
        ILift lift = skipSystem.generateLiftStrategy(LiftDays.FIVE_DAYS);
        ICard skipass = skipSystem.generateSkipass(SkipassTypes.WEEK, lift);



    }

    public void update() {
        loglist.add((PassLog) observable.getState());
    }
}


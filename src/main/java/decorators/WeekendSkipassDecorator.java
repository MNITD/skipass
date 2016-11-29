package decorators;


import interfaces.ICard;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Dell on 28.11.2016.
 */
public class WeekendSkipassDecorator extends SkipassDecorator {

    public WeekendSkipassDecorator(ICard card) {
        super(card);
    }

    public String getType() {
        return "WeekendSkipass";
    }

    public boolean checkValidation() {
        return getCard().checkValidation()
                && (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)> 4);
    }


    public ICard getCard(){
        return super.getCard();
    }

}

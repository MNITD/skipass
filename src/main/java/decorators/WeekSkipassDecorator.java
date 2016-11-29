package decorators;

import interfaces.ICard;

import java.util.Calendar;

/**
 * Created by Dell on 28.11.2016.
 */
public class WeekSkipassDecorator extends SkipassDecorator {

    public WeekSkipassDecorator(ICard card){
        super(card);
    }
    public String getType() {
        return "WeekSkipass";
    }

    public boolean checkValidation() {
        return getCard().checkValidation()
                && (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)< 5);
    }

    public ICard getCard(){
        return super.getCard();
    }
}

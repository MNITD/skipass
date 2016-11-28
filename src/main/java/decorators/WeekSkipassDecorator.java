package decorators;

import javax.smartcardio.Card;

/**
 * Created by Dell on 28.11.2016.
 */
public class WeekSkipassDecorator extends SkipassDecorator {

    public WeekSkipassDecorator(Card card){
        super(card);
    }
    public String getType() {
        return "WeekSkipass";
    }

    public boolean checkValidation() {
        return false;
    }
    public Card getCard(){
        return super.getCard();
    }
}

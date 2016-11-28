package decorators;

import interfaces.ICard;

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
        return false;
    }
    public ICard getCard(){
        return super.getCard();
    }
}

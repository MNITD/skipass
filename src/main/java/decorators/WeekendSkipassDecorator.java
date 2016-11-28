package decorators;


import interfaces.ICard;

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
        return false;
    }
    public ICard getCard(){
        return super.getCard();
    }
}

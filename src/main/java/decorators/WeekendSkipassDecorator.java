package decorators;


/**
 * Created by Dell on 28.11.2016.
 */
public class WeekendSkipassDecorator extends SkipassDecorator {

    public WeekendSkipassDecorator(Card card) {
        super(card);
    }

    public String getType() {
        return "WeekendSkipass";
    }

    public boolean checkValidation() {
        return false;
    }
    public Card getCard(){
        return super.getCard();
    }
}

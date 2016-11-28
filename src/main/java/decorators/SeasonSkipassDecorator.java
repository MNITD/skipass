package decorators;


/**
 * Created by Dell on 28.11.2016.
 */
public class SeasonSkipassDecorator extends SkipassDecorator{
    public SeasonSkipassDecorator(Card card) {
        super(card);
    }

    public String getType() {
        return "SeasonSkipass";
    }

    public boolean checkValidation() {
        return false;
    }

    public Card getCard(){
        return super.getCard();
    }
}

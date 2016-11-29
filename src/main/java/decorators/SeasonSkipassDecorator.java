package decorators;


import interfaces.ICard;

/**
 * Created by Dell on 28.11.2016.
 */
public class SeasonSkipassDecorator extends SkipassDecorator{

    public SeasonSkipassDecorator(ICard card) {
        super(card);
    }

    public String getType() {
        return "SeasonSkipass";
    }

    public boolean checkValidation() {
        return getCard().checkValidation();
    }

    public ICard getCard(){
        return super.getCard();
    }

}

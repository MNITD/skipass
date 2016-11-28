package decorators;



/**
 * Created by Dell on 28.11.2016.
 */
public abstract class SkipassDecorator {
    private ICard card;
    public SkipassDecorator(Card card){
        this.card = card;
    }
    public abstract String getType();
    public abstract boolean checkValidation();
    public Card getCard(){
        return card;
    }

}

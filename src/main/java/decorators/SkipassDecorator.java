package decorators;


import interfaces.ICard;

/**
 * Created by Dell on 28.11.2016.
 */
public abstract class SkipassDecorator implements ICard{
    private ICard card;
    public SkipassDecorator(ICard card){
        this.card = card;
    }
    public abstract String getType();
    public abstract boolean checkValidation();
    public ICard getCard(){
        return card;
    }

}

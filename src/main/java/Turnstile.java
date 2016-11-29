import interfaces.ICard;
import interfaces.IObservable;
import interfaces.IObserver;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dell on 28.11.2016.
 */
public class Turnstile implements IObservable {

    private ArrayList<IObserver>observers;
    private PassLog passLog;

    public Turnstile() {
        this.observers = new ArrayList<IObserver>();
    }

    public Object getState() {
        return null;
    }

    public void addListener(IObserver observer) {
        observers.add(observer);
    }

    public void notifyListeners() {
        for (IObserver observer : observers){
            observer.update();
        }
    }
    public boolean checkValidation(ICard card){
        passLog = new PassLog();

        passLog.setCardId(((Skipass)card).getId());
        passLog.setDate(new Date());
        passLog.setSuccess(card.checkValidation());
        passLog.setReason("");

        notifyListeners();
        return passLog.isSuccess();
    }
}

package interfaces;

/**
 * Created by Dell on 29.11.2016.
 */
public interface IObservable {
    Object getState();
    void addListener(IObserver observer);
    void notifyListeners();
}

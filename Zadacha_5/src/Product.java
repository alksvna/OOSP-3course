import java.util.ArrayList;
import java.util.List;
public class Product implements Observable {
    private String product;
    private double discount;
    private List<Observer> observers;
    public Product(String product, double discount) {
        this.product = product;
        this.discount = discount;
        this.observers = new ArrayList<>();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(product, discount);
        }
    }
}

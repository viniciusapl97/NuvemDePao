import java.util.List;
import java.util.ArrayList;


public class Basket {

    private Customer customer;
    private List<OrderItem> items;

    public Basket (Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }



}

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items;
    private OrderStatus status;
    private double total;

    public Order(int id, Customer customer, List<OrderItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>(items);
        this.status = OrderStatus..PENDING;
        this.total = calculateTotal();
    }

    //Getters
    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
    public OrderStatus getStatus() { return status; }
    public double getTotal() { return total; }

    //Falta implementar a lógica de fechamento do pedido, alterar os status do pedido, cancelar o pedido

}
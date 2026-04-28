import java.util.List;
import java.util.ArrayList;


public class Basket {

    //Para a lógica implementada na basket me baseei nesse artigo do devmedia:
    //https://www.devmedia.com.br/desenvolvendo-um-carrinho-de-compras-com-java-ee-6/27502

    private Customer customer;
    private List<OrderItem> items;

    public Basket (Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    //Adicionar produto
    public void addItem(Product product, int quantity) {
        for (OrderItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("Updated quantity for: " + product.getName());
                return;
            }
        }
        items.add(new OrderItem(product, quantity));
        System.out.println("Added to basket: "+ product.getName());
    }

    //Remover um produto da basket pelo ID
    public void removeItem(int productId) {
        for (int i=0; i < items.size(); i++) {
            if (items.get(i).getProduct().getId() == productId) {
                System.out.println("Removed item: " + items.get(i).getProduct().getName());
                items.remove(i);
                return
            }
        }
        System.out.println("Product not found in basket.")
    }

    //Limpar a basket
    public void clear(){
        items.clear();
        System.out.println("Basket cleared");
    }

    public List<OrderItem> getItems() { return item; }
    public Customer getCustomer() { return customer; }

    public boolean isEmpty() { return items.isEmpty(); }

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total +=item.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basket for: ").append(customer.getName()).append("\n");
        for (OrderItem item : items) {
            sb.append("  - ").append(item).append("\n");
        }
        sb.append("Total: R$").append(String.format("%.2f", getTotal()));
        return sb.toString();
    }

}

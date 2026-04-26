public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }
        this.quantity = quantity;
    }

    // Calcular o subtotal deste item
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{product='" + product.getName() +
                "', quantity=" + quantity +
                ", subtotal=R$" + String.format("%.2f", getSubtotal()) + "}";
    }

}

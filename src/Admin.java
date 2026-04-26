public class Admin extends User {

    //Admin não tem atributos extras por enquanto, no construtor vai passar a role fixa.
    public Admin(int id, String name, String email, String password){
        super (id, name, email, password, Role.ADMIN);
    }

    public void addProduct(int productId){
        System.out.println("User " + getName() + " added product ID: #" + productId);
    }

    public void removeProduct(int productId){
        System.out.println("User " + getName() + " removed product ID: #" + productId);
    }

    public void approveOrder(int orderId){
        System.out.println("User " + getName() + " approved order ID: #" + orderId);
    }

    public void cancelOrder(int orderId){
        System.out.println("User " + getName() + " canceled order ID: #" + orderId);
    }

    @Override
    public String toString() {
        return "Admin{id=" + getId() + ", name='" + getName() + "', email='" + getEmail() + "'}";
    }
}

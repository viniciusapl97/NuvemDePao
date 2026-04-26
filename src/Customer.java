import java.util.ArrayList;
import java.util.List;


public class Customer extends User{

    private String phone;
    private String address;

    public Customer(int id, String name, String email, String password, String phone, String address){
        super(id, name, email, password, Role.CUSTOMER);
        this.phone = phone;
        this.address = address;
    }

    // Getters e Setters específicos do Customer
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }


    @Override
    public String toString() {
        return "Customer{id=" + getId() + ", name='" + getName() +
                "', phone='" + phone + "', address='" + address + "'}";
    }



}

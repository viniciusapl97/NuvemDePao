public class Product {

    //Atributos
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean available;


    //Métodos
    //Construtor
    public Product(int id, String name, String description, double price){

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = true;

    }

    //Getters -> leitura de dados

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isAvailable(){
        return available;
    }

    //Setters -> alteração de dados do objeto

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=R$" + String.format("%.2f", price) +
                ", available=" + (available ? "Yes" : "No") +
                '}';
    }

}

public class Product {

    //2 attributes has been created for the Product class
    public String name;
    public int price;


    //Constructor
    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }


    //2 methods has been created to get the name of the product and to get the price of the product//
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
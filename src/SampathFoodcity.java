public class SampathFoodcity {

    /* Created attributes for example: I have created an attribute called products
    and assigned a value of 300 where the admin can add a maximum of 300 products */
    Product[] products = new Product[300];
    int productCount = 0;
    Product[] customerOrder = new Product[300];
    double totalPayment = 0;
    int orderCount = 0;


    /* Method creation to add products as an admin where I have used if condition to add a maximum
    of 300 products and once the product has been added a message shows as "Product added successfully."
    and if the product list is full then it shows a message as "Product list is full, cannot add more products."*/
    public void addProduct(String name, int price) {
        if (productCount < 300) {
            products[productCount++] = new Product(name, price);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product list is full, cannot add more products.");
        }
    }

    //Method creation to remove product as an admin
    public void removeProduct(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                for (int j=i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                productCount--;
                System.out.println("Product removed successfully.");
                return;
            }//if
        }//for
        System.out.println("Product not found.");
    }

    //Method creation to view product list as an admin
    public void viewProductList() {
        System.out.println("Product List.");
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " = " + product.getPrice());
        }
    }

    /* Method creation to order products as a customer where I have used equalsIgnoreCase to ignore the
    case when a customer types the product name & once product has been added to the cart a message shows as
    "Product added to the cart successfully." and if the order list is full then it shows a message as
    "Order list is full, cannot order more products." and if the customer a product that is not in the system
     then a message shows as "Product not found."*/
    public void orderProduct(String productName) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equalsIgnoreCase(productName)) {
                if (orderCount < 300) {
                    customerOrder[orderCount++] = products[i];
                    totalPayment += 50.0;
                    System.out.println("Product added to the cart successfully.");
                } else {
                    System.out.println("Order list is full, cannot order more products.");
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }

    //Method creation to view order list as a customer
    public void viewCustomerOrder() {
        System.out.println("Cart List:");
        for (int i = 0; i < orderCount; i++) {
            Product product = customerOrder[i];
            System.out.println(product.getName() + " = " + product.getPrice());
        }
    }

    //A return method have been created to get and return the total payment a customer has to pay
    public double getTotalPayment(){
        return totalPayment;
    }
}


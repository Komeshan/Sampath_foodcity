import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Variables has been created for instance the username of the admin
        is a String value which is "admin" */
        SampathFoodcity sampathFoodcity = new SampathFoodcity();
        boolean adminLoggedIn = false;
        boolean customerLoggedIn = false;
        String adminUsername = "admin";
        String adminPassword = "8100";
        String cusUsername = "cussampath";
        String cusPassword = "1234";
        Scanner scanner = new Scanner(System.in);


        //console window main menu
        while (true) {
            System.out.println("\n===== Sampath Foodcity Menu =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("\nSelect an option: ");
            int choice = scanner.nextInt();


            /* If admin, entering the UN & PW and this is done by a scanner method
            where it helps to take the input of the user and store it under the scanner name
            for example "inputUsername" */
            if (choice == 1) {
                System.out.print("\n*** Admin Login *** \nEnter username: ");
                String inputUsername = scanner.next();
                System.out.print("Enter password: ");
                String inputPassword = scanner.next();

                /* If condition used to check whether UN & PW are correct and if the UN & PW match
                a message shows as "Logged in as Admin" and if it doesn't match then a message
                shows as Invalid credentials, please try again */
                if (inputUsername.equals(adminUsername) && inputPassword.equals(adminPassword)) {
                    adminLoggedIn = true;
                    System.out.println("Logged in as Admin");
                } else {
                    System.out.println("Invalid credentials, please try again");
                }

                //Admin menu once logged in
                while (adminLoggedIn) {
                    System.out.println("\n===== Admin Menu =====");
                    System.out.println("1. Add Product");
                    System.out.println("2. Remove Product");
                    System.out.println("3. View Product List");
                    System.out.println("4. Exit (Logout)");
                    System.out.print("\nSelect an option: ");
                    int adminChoice = scanner.nextInt();

                    /* Choice 1 in admin menu to add product name & price, a scanner method
                    is used to capture the name and the price of the product */
                    if (adminChoice == 1) {
                        System.out.print("Enter product name: ");
                        String name = scanner.next();
                        System.out.print("Enter product price: ");
                        int price = scanner.nextInt();
                        sampathFoodcity.addProduct(name, price);

                    /* Choice 2 in admin menu to add product name & price, a scanner method
                    is used to capture the name and the price of the product */
                    } else if (adminChoice == 2) {
                        System.out.print("Enter product name to remove: ");
                        String removeName = scanner.next();
                        sampathFoodcity.removeProduct(removeName);

                    // Choice 3 in admin menu to view product name & price //
                    } else if (adminChoice == 3) {
                        sampathFoodcity.viewProductList();

                    // Choice 4 in admin menu to log out from admin menu //
                    } else if (adminChoice == 4) {
                        adminLoggedIn = false;
                        System.out.println("Logged out as Admin.");

                    //
                    } else {
                        System.out.println("Invalid option");

                    }
                }





            } else if (choice == 2) {
                System.out.print("\n*** Customer Login *** \nEnter username: ");
                String inputUsername = scanner.next();
                System.out.print("Enter password: ");
                String inputPassword = scanner.next();

                if (inputUsername.equals(cusUsername) && inputPassword.equals(cusPassword)) {
                    System.out.println("Logged in as customer.");
                    customerLoggedIn = true;

                } else {
                    System.out.println("Invalid credentials, please try again");
                }

                while (customerLoggedIn) {
                    System.out.println("\n===== Customer Menu =====");
                    System.out.println("1. View Product List");
                    System.out.println("2. Order Product");
                    System.out.println("3. View Cart List");
                    System.out.println("4. View Total Payment");
                    System.out.println("5. Logout");
                    System.out.print("\nSelect an option: ");
                    int customerChoice = scanner.nextInt();

                    if (customerChoice == 1) {
                        sampathFoodcity.viewProductList();

                    } else if (customerChoice == 2) {
                        System.out.print("Enter product name to order: ");
                        String orderName = scanner.next();
                        sampathFoodcity.orderProduct(orderName);

                    } else if (customerChoice == 3) {
                        sampathFoodcity.viewCustomerOrder();

                    } else if (customerChoice == 4) {
                        System.out.println("Total Payment: $" + sampathFoodcity.getTotalPayment());

                    } else if (customerChoice == 5) {
                        customerLoggedIn = false;
                        System.out.println("Logged out as customer.");

                    } else {
                        System.out.println("Invalid option");
                    }
                }
            } else if (choice == 3) {
                System.exit(0);
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
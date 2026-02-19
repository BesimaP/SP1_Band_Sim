package Assignment_2;

public class Main {
    public static void main(String [] args) {
        //4 products
        Product p1 = new Product("Phone", 8999, new String[]{"electronics", "Sale"});
        Product p2 = new Product("Laptop", 13999, new String[]{"electronics", "new"});
        Product p3 = new Product("Watch", 3999, new String[]{"electronics", "new"});
        Product p4 = new Product("Ipad", 5999, new String[]{"electronics", "Sale"});

        //Array
        Product[] products = {p1, p2, p3, p4};

        System.out.println("~~~~~~~~~~~PRODUCTS~~~~~~~~~~~");
        for (Product product : products) {
            product.printInfo();
        }


        System.out.println("~~~~~~PRODUCTS ON DISCOUNT~~~~~~");
        for (Product p : products) {
            if (p.hasTag("Sale")) {
                p.printInfo();
            }
        }

        System.out.println("\n~~~~~MOST EXPENSIVE PRODUCT~~~~~~");
        Product expensive = findMostExpensive(products);
        expensive.printInfo();
    }

    public static Product findMostExpensive(Product[] products) {
        Product mostExpensive = products[0];
        for (Product p : products) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }
}

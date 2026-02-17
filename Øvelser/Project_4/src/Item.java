    public class Item {
        String name;
        int price;
        double weight;

        Item (String name, int price, double weight){
            this.name = name;
            this.price = price;
            this.weight = weight;
        }
    }

    public class Item1 {
        String name;
        int price;
        double weight;
        int stock;

        Item1(String name, int price, double weight, int stock) {
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.stock = stock;
        }
    }

    void applyDiscount(Item[] items, int discount){
        for(int i = 0; i < items.length; i++){
            items[i].price = items[i].price - discount;
        }
    }

    boolean hasItem(Item[] inventory, String itemName){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i].name.equals(itemName)){
                return true;
            }
        }
        return false;
    }

    int findMostExpensive(Item[] items){
        int mostExpensiveIndex = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i].price > items[mostExpensiveIndex].price){
               mostExpensiveIndex = i;
            }
        }
        return mostExpensiveIndex;
    }

    int calculateInventoryValue(Item[] inventory) {
        int total = 0;
        for (int i = 0; i < inventory.length; i++) {
            total = total + inventory[i].price;
        }
        return total;
    }

    double calculateInventoryWeight(Item[] inventory){
        double totalWeight = 0;
        for(int i = 0; i < inventory.length; i++){
            totalWeight = totalWeight + inventory[i].weight;
        }
    return totalWeight;
    }

    void sellItem(Item1[] inventory, String itemName, int quantity) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].name.equals(itemName)) {
                if (inventory[i].stock >= quantity) {
                    inventory[i].stock = inventory[i].stock - quantity;
                    System.out.println("Sold " + quantity + " " + itemName);
                } else {
                    System.out.println("Not enough stock for " + itemName);
                }
                return;
            }
        }
    }

    void restockItem(Item1[] inventory, String itemName, int quantity) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].name.equals(itemName)) {
                inventory[i].stock = inventory[i].stock + quantity;
                System.out.println("Restocked " + quantity + " " + itemName);
                return;
            }
        }
    }

    void printLowStock(Item1[] inventory, int threshold) {
        System.out.println("Low stock items:");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].stock < threshold) {
                System.out.println("- " + inventory[i].name + ": " + inventory[i].stock);
            }
        }
    }

    int calculateTotalInventoryValue(Item1[] inventory) {
        int total = 0;
        for (int i = 0; i < inventory.length; i++) {
            total = total + (inventory[i].price * inventory[i].stock);
        }
        return total;
    }

    void main () {
            Item item = new Item("Sword", 150, 2.5);
            Item item2 = new Item("Potion", 50, 0.3);
            System.out.println("Name: " + item.name + "\n" + "Price: " + item.price + "\n" + "Weight: " + item.weight);
            System.out.println("Name: " + item2.name + "\n" + "Price: " + item2.price + "\n" + "Weight: " + item2.weight);
            Item item3 = new Item("Milk", 25, 1);
            Item item4 = new Item("Milk", 18, 1);
            int totalPrice = item3.price + item4.price;
            System.out.println("Total price: " + totalPrice + " kr.");

            Item[] items = new Item[3];
            items[0] = new Item("Sword", 150, 2.5);
            items[1] = new Item("Shield", 100, 3.0);
            items[2] = new Item("Potion", 50, 0.3);

            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].name + ": " + items[i].price);
            }

            applyDiscount(items, 10);

            for (int i = 0; i < items.length; i++) {
                System.out.println("Item with discount: " + items[i].name + ": " + items[i].price);
            }

            Item[] inventorys = new Item[5];
            inventorys[0] = new Item("Sword", 150, 2.5);
            inventorys[1] = new Item("Shield", 100, 3.0);
            inventorys[2] = new Item("Potion", 50, 0.3);
            inventorys[3] = new Item("Armor", 300, 5.0);
            inventorys[4] = new Item("Potion", 50, 0.3);


            System.out.println("Has Sword: " + hasItem(inventorys, "Sword"));
            System.out.println("Has Helmet: " + hasItem(inventorys, "Helmet"));

            int index = findMostExpensive(items);
            System.out.println("Most expensive: " + items[index].name + " costs " + items[index].price);

            int value = calculateInventoryValue(inventorys);
            double weight = calculateInventoryWeight(inventorys);

            System.out.println("Total value: " + value);
            System.out.println("Total weight: " + weight);

        Item1[] inventory = new Item1[4];
        inventory[0] = new Item1("Sword", 150, 2.5, 10);
        inventory[1] = new Item1("Shield", 100, 3.0, 5);
        inventory[2] = new Item1("Potion", 50, 0.3, 20);
        inventory[3] = new Item1("Armor", 300, 5.0, 3);

        sellItem(inventory, "Sword", 7);
        sellItem(inventory, "Potion", 15);
        restockItem(inventory, "Shield", 10);

        printLowStock(inventory, 5);

        int value1 = calculateTotalInventoryValue(inventory);
        System.out.println("Total inventory value: " + value1);
    }
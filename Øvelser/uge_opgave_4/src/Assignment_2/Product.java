package Assignment_2;

    public class Product {
        String name;
        double price;
        String[] tags;

        public Product (String name, double price, String[] tags){
            this.name = name;
            this.price = price;
            this.tags = tags;
        }

        public void printInfo(){
            System.out.println("Product: " + name + "\n" + "Price: " + price + " kr.");
            System.out.println("Tags: ");
            for(int i = 0; i < tags.length; i++){
                System.out.println(tags[i]);
            }
            System.out.println();
        }

        public boolean hasTag(String tag){
           for(String t : tags){
               if(t.equals(tag)){
                  return true;
               }
           }
           return false;
        }
    }

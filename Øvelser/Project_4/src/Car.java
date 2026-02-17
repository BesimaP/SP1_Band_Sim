    public class Car {
        String brand;
        int speed;

        Car(String brand, int speed){
            this.brand = brand;
            this.speed = speed;
        }
    }

    void checkSpeed(Car c){
        if (c.speed > 130){
            System.out.println("Too fast!");
        } else {
            System.out.println("OK");
        }
    }

    int findFirstSpeeding(Car[] cars, int speedLimit){
        for(int i = 0; i < cars.length; i++){
            if(cars[i].speed > speedLimit){
                return i;
            }
        }
    return -1;
    }

    void main(){
        Car car = new Car ("Audi", 150);
        Car car2 = new Car ("Skoda", 120);
        checkSpeed(car);
        checkSpeed(car2);

        Car [] cars = new Car[4];
        cars[0] = new Car("Tesla", 100);
        cars[1] = new Car("Toyota", 120);
        cars[2] = new Car("Ferrari", 180);
        cars[3] = new Car("Ford", 110);

        int index = findFirstSpeeding(cars, 130);
        if (index != -1){
            System.out.println(cars[index].brand + " is speeding at " + cars[index].speed);
        } else {
            System.out.println("No speeding cars");
        }
    }



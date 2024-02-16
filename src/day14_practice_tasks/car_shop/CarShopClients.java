package day14_practice_tasks.car_shop;

import java.util.ArrayList;

public class CarShopClients {
    public static void main(String[] args) {
        CarShop[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };
        for (CarShop car : cars) {
            if ((car instanceof Honda && (car.year >= 2010 && car.year <= 2011)) ||
                    (car instanceof Audi && (car.year >= 2015 && car.year <= 2019)) ||
                    (car instanceof Tesla && (car.year >= 2015 && car.year <= 2016))) {
                System.out.println("Eligible for recall: "+car+" "+car.model + "-" + car.year);
            }
        }
        CarShop highestPrice = cars[0];
        for (CarShop each : cars) {
            if (each.price > highestPrice.price) {
                highestPrice = each;
            }
        }
        System.out.println("Highest price: "+ highestPrice.model +" "+ highestPrice.price);
        CarShop lowestPrice = cars[0];
        for (CarShop each : cars) {
            if (each.price < lowestPrice.price) {
                lowestPrice = each;
            }
        }
        System.out.println("Lowest price: " + lowestPrice.model +" " +lowestPrice.price);
        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (CarShop car : cars) {
            if (car instanceof Tesla) {
                teslaCars.add((Tesla) car);
            }
        }
        System.out.println("Tesla Cars: ");
        for (Tesla tesla : teslaCars) {
            System.out.println(tesla.model + "-" + tesla.year);
        }
    }
}

package day14_practice_tasks.car_shop;

public class CarShop {
        String model;
        String color;
        int year;
        double price;

        public CarShop(String model, String color, int year, double price) {
                this.model = model;
                this.color = color;
                this.year = year;
                this.price = price;
        }

        @Override
        public String toString() {
                return getClass().getSimpleName();
        }
}

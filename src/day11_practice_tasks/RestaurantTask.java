package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantTask {
    public static class Chef{
        String name;
        int employeeID;
        double hourlyRate;
        boolean isFullTime;

        public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
            this.name = name;
            this.employeeID = employeeID;
            this.hourlyRate = hourlyRate;
            this.isFullTime = isFullTime;
        }
        public void makeOrder(){
            System.out.println(name + " is making an order");
        }
        public void washDishes(){
            System.out.println(name+ " is washing the dishes");
        }

        @Override
        public String toString() {
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", isFullTime=" + isFullTime +
                    '}';
        }
    }
    public static class Server{
        String name;
        int employeeID;
        double hourlyRate;
        boolean isFullTime;

        public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
            this.name = name;
            this.employeeID = employeeID;
            this.hourlyRate = hourlyRate;
            this.isFullTime = isFullTime;
        }
        public void makeOrder(){
            System.out.println(name + " is making an order");
        }
        public void washDishes(){
            System.out.println(name+ " is washing the dishes");
        }
        public String toString() {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", isFullTime=" + isFullTime +
                    '}';
        }
    }
    public static class Restaurant{
        String owner;
        String location;
        int numberOfStars;
        ArrayList<Server> servers= new ArrayList<>(Arrays.asList());
        ArrayList<Chef> chefs= new ArrayList<>(Arrays.asList());


        public Restaurant(String owner,String location, int numberOfStars) {
            this.owner = owner;
            this.location = location;
            this.numberOfStars = numberOfStars;
        }
        public void hireServer(Server server){

            servers.add(server);
        }
        public void hireServer(Server[] servers){
           this.servers.addAll(Arrays.asList(servers));

        }
        public void hireChef(Chef chef){

            chefs.add(chef);
        }
        public void hireChef(Chef[] chefs){
            this.chefs.addAll(Arrays.asList(chefs));

        }
        public void terminateChef(int employeeId){
            chefs.remove(employeeId);

    }
        public void terminateServer(int employeeId){
            servers.remove(employeeId);

        }

        @Override
        public String toString() {
            return "Restaurant{" +
                    "owner='" + owner + '\'' +
                    ", location='" + location + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ", servers=" + servers +
                    ", chefs=" + chefs +
                    '}';
        }
    }
    public static class LocalRestaurant{
        public static void main(String[] args) {
            Restaurant restaurant1 = new Restaurant("McDonalds", "Maryand", 5);

            Server server1 = new Server ("Anna",1010, 15, true);
            Server server2 = new Server ("Max",1011, 16, false);
            Server[] servers = {server1, server2};
            Chef chef1 = new Chef("Peter", 80,40,true);
            Chef chef2 = new Chef("Ben",81,45,false);
            Chef [] chefs = {chef1, chef2};


            restaurant1.hireChef(chefs);
            restaurant1.hireServer(servers);
            System.out.println(Arrays.toString(chefs));
            System.out.println(Arrays.toString(servers));
            System.out.println(restaurant1);
            server1.washDishes();
            chef2.makeOrder();

        }
    }

}
/*
Restaurant Task (EXTRA SPICY)
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status



Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status




Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information



Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information

 */
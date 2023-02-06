import java.util.Scanner;

public class CarpoolConundrum {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many cars?");
	int Cars = input.nextInt();
	
	System.out.println("How many drivers?");
	int Drivers = input.nextInt();
	
	System.out.println("How many passengers?");
	int Passengers = input.nextInt();
	
	System.out.println("How many cars were not driven?");
	int CarsND = input.nextInt();
	
	System.out.println("How many cars were driven?");
	int CarsD = input.nextInt();
	
	double PassengerAvg = Passengers/CarsND;
	double CarSpace = 4.0;
	double CpCap = CarSpace * CarsD;
	
	System.out.println("There are " + Cars + " cars available.");
    System.out.println("There are only " + Drivers + " drivers available.");
    System.out.println("There will be " + CarsND + " empty cars today.");
    System.out.println("We can transport " + CpCap + " people today.");
    System.out.println("We have " + Passengers +" to carpool today");
    System.out.println("We need to put about " + PassengerAvg + "  in cars");
	
	}
}

 
	public class TestCar{
	
		public static void main(String[]args){
		
		Car car = new Car("Fiat", "Uno", 2022, "Azul", 60.000);
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Model: " + car.getModel());
		System.out.println("Year: " + car.getYear());
		
		
		System.out.println("Fuel Type: " + car.fuelType);
		System.out.println("Transmission Type: " + car.transmissionType);
		System.out.println("Number Of Doors: " + car. numberOfDoors);
		System.out.println("Horse Power: " + car.horsePower);
		System.out.println("hasAirConditioning: " + car.hasAirConditioning);
		
		
		}
 }
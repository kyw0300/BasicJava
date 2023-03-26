package chapter07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		
		Bus veve = new Bus();
		System.out.println(veve.vehivehi);
	}
}

package comp3111.lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{
	private int battery;
	public MobileComputer() {
		secret = "MobileComputer secret";
		battery = 5;
	}
	@Override
	public void work() {
		if(battery > 0) {
			System.out.println("It is working on my lap.");
			battery--;
		}else
			System.out.println("Running out of battery");
	}
	
	/* Problem: The situation is the main class pass MobileComputer object to Charger class but there is two charge function.
	 * Compile have no idea which charge function should Charger object refer to. One is Charger class it's own charge(),
	 * another charge() is under MobileComputer.
	 * 
	 *  Fix: We simply add the Chargeable interface after the class name.
	 *  
	 *  Explaination: Java support multi-inheritance of type. As with multiple inheritance of implementation, 
	 *  a class can inherit different implementations of a method defined (as default or static) in the interfaces 
	 *  that it extends.
	 * 	We cannot simple extends MobileComputer with Chargeable. It is because we cannot prioritize 
	 *  different superclass. Compiler simply don't know which method or constructor should take precedence first.
	 *  To avoid the issues of multiple inheritance of state, we use implements keyword to inherit fields like 
	 *  charge() from Charger Class on MobileComputer Class!
	 *  Now, main class call charge() of Charger class, 
	 *  then the charge() of Charger class call the charge() of the MobileComputer.
	 */
	public void charge()  {
		if(battery < 10) {
			battery++;
		}
	}
}

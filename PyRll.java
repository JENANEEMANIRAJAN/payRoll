package payRoll;

 class employee {
	public static double calPay(int salary) {
		return salary*25;
	}
	public static double calPay(int hrly, int hrswrk) {
		return hrly*hrswrk;
	}
}
public class PyRll{
	public static void main(String[] args) {
		employee em = new employee();
		System.out.println(employee.calPay(1000000));
		System.out.println(employee.calPay(3,24));
		
		
	}

}

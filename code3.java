package day3;

public class code3 {
	public static void main(String[] args) {
		try {
			System.out.println("vishu");
			System.out.println(10 / 0);
		} catch (NullPointerException ne) {
			System.out.println("u r getting ne" + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");}
}

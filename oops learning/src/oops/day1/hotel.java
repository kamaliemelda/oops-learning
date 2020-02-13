package oops.day1;

public class hotel {
	static String name="saravana bavan";
	static int doorno=7;
	int mealsrate=100;

	public static void main(String[] args) {
		hotel customer1=new hotel();
		customer1.eat();
		 preparedfood();
	int box	=customer1. paybill(200);
	System.out.println(box);
	
	System.out.println(customer1.mealsrate);
	
		
		// TODO Auto-generated method stub

	}

	private static void preparedfood() {
		
		System.out.println("prepared");
		// TODO Auto-generated method stub
		
	}

	 
			// TODO Auto-generated method stub
		
	

	private void eat() {
		System.out.println("eat well");
		//paybill();
		// TODO Auto-generated method stub
		
	}

	private int paybill(int i) {
		System.out.println(i);
		float balance=33.25f;
		return (int) balance;
		
		
		// TODO Auto-generated method stub
		
	}

}

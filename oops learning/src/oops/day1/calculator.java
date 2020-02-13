package oops.day1;

public class calculator {

	static String brand="ABC";
	static int price=650;
	static boolean isscientific=true;
	String owner="kumar";
	



	public static void main(String[] args) {
		calculator calc=new calculator();
		calc=null;
		calc.add(10,20);
		float box=calc.sub(15,20.5f);
		System.out.println(box);
		scientificcalculation();
				
		// TODO Auto-generated method stub

	}


	private static void scientificcalculation() {
		calculator calc1=new calculator();
		System.out.println(calc1.owner);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(isscientific);
		// TODO Auto-generated method stub
		
	}


	private float sub(int i, float j) {
		
	
		float total1=i-j;
		return total1;
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}


	private void add(int i, int j) {
		int total=i+j;
		System.out.println(total);
		System.out.println(owner);
		
		
		// TODO Auto-generated method stub
		
	}


	 {
		// TODO Auto-generated method stub
		
	}

}

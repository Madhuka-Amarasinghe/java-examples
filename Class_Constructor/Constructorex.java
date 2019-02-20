public class Constructorex{
	String fruiteName;
	int qty;

	public Constructorex(){
		this.fruiteName = "Apple";
		 this.qty = 10;
	}

	Constructorex(String name, int quantity){
		this.fruiteName = name;
		this.qty = quantity;

	}

	public static void main(String arg[]){

		Constructorex f1 = new Constructorex();
		Constructorex f2 = new Constructorex("BlueBerry",30);
		
		System.out.println("Fruite Name :"+f1.fruiteName+",,"+"Quentity :"+f1.qty);
		System.out.println("Fruite Name :"+f2.fruiteName+",,"+"Quantity :"+f2.qty);
	}

}
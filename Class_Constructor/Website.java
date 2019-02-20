public class Website{

	String siteName;
	int siteAge;

	Website(String name, int age){
		this.siteName = name;
		this.siteAge = age;	
	}

	public static void main(String arg[]){
		Website obj1 = new Website("OrecTec", 1);
		Website obj2 = new Website("Google", 20);

		System.out.println("Site Name :"+obj1.siteName+"--"+ "Site Age :"+obj1.siteAge);
		System.out.println("Site Name :"+obj2.siteName+"--"+ "Site Age :"+obj2.siteAge);
	}

}
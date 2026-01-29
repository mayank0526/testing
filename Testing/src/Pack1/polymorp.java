package Pack1;

class car
{
	int cylinders;
	int valves;
	int power;
	boolean powerstearing;
	
	car(){
		cylinders =4;
		valves=4;
		power=1100;
		powerstearing=false;
		
	}
	
	car(boolean powerstearing){
	
	this.powerstearing=powerstearing;
}
	
	car(int cylinders,int valves,int power){
		this.cylinders=cylinders;
		this.power=power;
		this.valves=valves;
		this.powerstearing=false;
	}
}


public class polymorp {

	public static void main(String[] args) {
		 car honda = new car();
		System.out.println(honda.cylinders);
		
		car kia = new car();
		System.out.println("IS POWER STEARING:" + kia.powerstearing);
		 
		car mg = new car(3,50,1100);
		System.out.println(mg.cylinders);
		System.out.println(mg.valves);
		System.out.println(mg.power);
		System.out.println(mg.powerstearing);

	}

}

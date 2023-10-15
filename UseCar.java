package composition;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.price=45000;
		e.hp=150;
		e.noOfPiston=5;
		Car c1=new Car();
		c1.brand="BMW";
		c1.price=1500000;
		c1.color="Black";
		c1.engine=e;
		//System.out.println(c1.brand+" "+c1.price+" "+c1.color+" "+c1.engine.price+" "+
		//		c1.engine.hp+" "+c1.engine.noOfPiston);
		Engine e1=new Engine();
		e1.price=78651;
		e1.hp=450;
		e1.noOfPiston=4;
		Car c2=new Car();
		c2.brand="MG";
		c2.price=4566671;
		c2.color="Red";
		c2.engine=e1;
		Car c3=new Car();
		c3.brand="Tata";
		c3.price=453549;
		c3.color="Yellow";
		c3.engine=e1;
		
		Car[] cars= {c2,c3};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].color+" "+
					cars[i].engine.price+" "+cars[i].engine.hp+" "+cars[i].engine.noOfPiston);
		}
	}
}

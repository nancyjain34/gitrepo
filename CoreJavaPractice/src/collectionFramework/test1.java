package collectionFramework;
public class test1 extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car();
		obj1.setModel("Kia Motors");
		obj1.setColor("Red");
		obj1.setRelease("2021 Model");
		System.out.println(obj1.getModel());
		System.out.println(obj1.getColor());
		System.out.println(obj1.getRelease());
	}

}

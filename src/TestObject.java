import java.util.ArrayList;


public class TestObject {

	private String name;
	private int ammount;
	private double value;
	private char designation;
	private ArrayList<Object> holder;
	
	public TestObject(String n, int a, double v, char c){
		name = n;
		ammount = a;
		value = v;
		designation = c;
		holder = new ArrayList<Object>();
		holder.add(name);
		holder.add(new Integer(ammount));
		holder.add(new Double(value));
		holder.add(new Character(designation));
	}
	
	public String toString(){
		return name + " " + ammount + " " + value + " " + designation + " " + holder.toString();
	}
	
	public static void main(String[] args) throws Exception {
		TestObject test1 = new TestObject("One",1,1.1,'a');
		System.out.println(test1);
		Serializer.write(test1, "TestObjectFile.xml");
		TestObject testRecall = Serializer.read("TestObjectFile.xml");
		System.out.println(testRecall);
	}

}

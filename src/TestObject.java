import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XstreamTest;


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
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public int getAmmount(){
		return ammount;
	}
	
	public void setAmmount(int a){
		ammount = a;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setValue(double v){
		value = v;
	}
	
	public char getDesignation(){
		return designation;
	}
	
	public void setDesignation(char c){
		designation = c;
	}
	
	public ArrayList<Object> getHolder(){
		return holder;
	}
	
	public void setHolder(ArrayList<Object> h){
		holder = h;
	}
	
	public TestObject(){
		name = "Default";
		ammount = 0;
		value = 1;
		designation = 'z';
		holder = new ArrayList<Object>();
	}
	
	public String toString(){
		return name + " " + ammount + " " + value + " " + designation + " " + holder.toString();
	}
	
	public static void main(String[] args) throws Exception {
		TestObject test1 = new TestObject("One",1,1.1,'a');
		TestObject1 test2 = new TestObject1();
		test2.setName("test2");
		Serializer.write(test1, "TestObjectFile.xml");
		Serializer.write(test2, "TestObjectFile1.xml");
		System.out.println(test1);
		TestObject testRecall = Serializer.read("TestObjectFile.xml");
		TestObject1 test2Recall = Serializer.read1("TestObjectFile1.xml");
		System.out.println(testRecall);
		System.out.println(test2Recall.getName());
		
		XstreamTest test3 = new XstreamTest("Sandwhich", "Standard PB&J");
		BufferedOutputStream write = new BufferedOutputStream(new FileOutputStream("TestObjectFile2.xml"));
		XStream xstream = new XStream();
		xstream.toXML(test3,write);
	}

}

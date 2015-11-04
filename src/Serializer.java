import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;


public class Serializer {
	public static void write(TestObject f, String filename) throws Exception{
        XMLEncoder encoder =
           new XMLEncoder(
              new BufferedOutputStream(
                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public static TestObject read(String filename) throws Exception {
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        TestObject o = (TestObject)decoder.readObject();
        decoder.close();
        return o;
    }

	public static void write(TestObject1 f, String filename) throws Exception {
		XMLEncoder encoder =
		           new XMLEncoder(
		              new BufferedOutputStream(
		                new FileOutputStream(filename)));
		        encoder.writeObject(f);
		        encoder.close();
	}
	
	public static TestObject1 read1(String filename) throws Exception {
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        TestObject1 o = (TestObject1)decoder.readObject();
        decoder.close();
        return o;
    }
}

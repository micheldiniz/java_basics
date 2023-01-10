package car_dealership;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		VehicleSerializable a = new VehicleSerializable("test", "test", 0.0);

		try {
			FileOutputStream fo = new FileOutputStream("/tmp/test.ser");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			
			out.writeObject(a);
			out.close();
			fo.close();

			System.out.println("Serialized data is saved in /tmp/test.ser");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package cm.qa.TestDataMaintains;

import java.io.IOException;
import java.util.List;

public class GetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Demo2 demo = new Demo2();

		List<String> str1 = demo.getValues(2,"Sheet1");

		System.out.println("Username:" + str1.get(0));
		System.out.println("Password:" + str1.get(1));
		System.out.println("Name:" + str1.get(2));
		System.out.println("Address:" + str1.get(3));
		System.out.println("Phnnumber:" + str1.get(4));

	}

}

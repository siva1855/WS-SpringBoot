package siva.ve.test;

import in.nit.service.ParentService;
import siva.ve.service.ChildService;

public class ChildTest {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Done");
		} catch (Exception ex) {
			System.out.println(ex);
		}

		ParentService parentService = new ParentService();
		parentService.parentMethod();

		ChildService childService = new ChildService();
		childService.childMethod();
	}

}

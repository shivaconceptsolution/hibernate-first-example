package scs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class InsertRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student stu = new Student();
		stu.setRno(1002);
		stu.setSname("ABC");
		stu.setBranch("IT");
		stu.setFees(450000);
		s.save(stu);
	    tx.commit();
	    s.close();
	

	}

}

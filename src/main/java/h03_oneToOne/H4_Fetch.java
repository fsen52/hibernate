package h03_oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Kisi.class).addAnnotatedClass(H2_Gunluk.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession(); 
		Transaction tx = s.beginTransaction();
		
		
		System.out.println(s.get(H1_Kisi.class, 101));
		
		System.out.println(s.get(H2_Gunluk.class, 12));
		
		
		
		
		
		
		
		tx.commit();
		
		s.close();
		sf.close();
	}

}

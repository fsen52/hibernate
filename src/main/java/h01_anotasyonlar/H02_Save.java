package h01_anotasyonlar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H02_Save {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H01_Sehir.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession(); 
		
		Transaction tx = s.beginTransaction();
		
		H01_Sehir sehir1 = new H01_Sehir(34,"İstanbul");
		H01_Sehir sehir2 = new H01_Sehir(35,"İzmir");
		
		
		s.save(sehir1);
		s.save(sehir2);
		
		tx.commit();
	}

}

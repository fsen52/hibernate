package h03_oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class H3_Save {

	public static void main(String[] args) {

	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Kisi.class).addAnnotatedClass(H2_Gunluk.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession(); 
		
		Transaction tx = s.beginTransaction();
		
		
		
		H2_Gunluk gunluk1 = new H2_Gunluk(11,"Farukun Günlüğü");		
		
		H2_Gunluk gunluk2 = new H2_Gunluk(12,"Erkanın Günlüğü");
		
		H2_Gunluk gunluk3 = new H2_Gunluk(13,"Türkanın Günlüğü");
		
		
		H1_Kisi kisi1 = new H1_Kisi(101,"Faruk ŞENER", 29);
		
		H1_Kisi kisi2 = new H1_Kisi(102,"Erkan ŞEKER", 41);
		
		H1_Kisi kisi3 = new H1_Kisi(103,"Türkan ŞEBER", 37);
		
		
		gunluk1.setKisi(kisi1);
		gunluk2.setKisi(kisi2);
		gunluk3.setKisi(kisi3);
		
		
		s.save(kisi3);
		s.save(kisi2);
		s.save(kisi1);
		s.save(gunluk3);
		s.save(gunluk2);
		s.save(gunluk1);
		
		tx.commit();
		
		
		sf.close();
		s.close();
	}

}

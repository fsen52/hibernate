package h02_embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class H3_SaveFetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession(); 
		
		Transaction tx = s.beginTransaction();

//kayıt oluşturma aşamaları		
		
//		H2_Dersler ilkD = new H2_Dersler("fizik","kimya");
//		
//		H1_Ogrenci ilkOgr = new H1_Ogrenci(12, "Faruk ŞENER", 95, ilkD);
//		
//		s.save(ilkOgr);
		
//kayıt oluşturmanın uzun yolu
		
//		s.save(new H1_Ogrenci(13, "Erkan ŞEKER", 90, new H2_Dersler("matematik","geometri")));
//		
//		tx.commit();
		
		
		System.out.println(s.get(H1_Ogrenci.class, 12).getOgrNot());
		System.out.println(s.get(H1_Ogrenci.class, 13).getOgrAd());
		
		sf.close();
		s.close();
	}

}

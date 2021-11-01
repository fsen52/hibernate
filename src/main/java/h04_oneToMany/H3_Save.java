package h04_oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h03_oneToOne.H1_Kisi;
import h03_oneToOne.H2_Gunluk;

public class H3_Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class)
																			  .addAnnotatedClass(H2_Kitap.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession(); 
		Transaction tx = s.beginTransaction();
	
		H2_Kitap k1 = new H2_Kitap(12, "Matematik");
		H2_Kitap k2 = new H2_Kitap(21, "Edebiyat");
		H2_Kitap k3 = new H2_Kitap(45, "Türkçe");
		H2_Kitap k4 = new H2_Kitap(33, "Coğrafya");
		
		
		H1_Ogrenci o1 = new H1_Ogrenci(1, "Furkan", 98);
		H1_Ogrenci o2 = new H1_Ogrenci(2, "Sinan", 95);
		H1_Ogrenci o3 = new H1_Ogrenci(3, "Numan", 100);
		
		
		
		k1.setOgrenci(o1);
		k2.setOgrenci(o1);
		
		k3.setOgrenci(o2);
		k4.setOgrenci(o2);
	
	s.save(k1);
	s.save(k2);
	s.save(k3);
	s.save(k4);
	
	s.save(o1);
	s.save(o2);
	s.save(o3);
	
	
	
	
	tx.commit();
	
	}
}

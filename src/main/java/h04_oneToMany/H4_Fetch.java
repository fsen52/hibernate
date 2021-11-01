package h04_oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class)
				  															  .addAnnotatedClass(H2_Kitap.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession(); 
		Transaction tx = s.beginTransaction();
		
//		
//		
//		for (H2_Kitap w : s.get(H1_Ogrenci.class, 1).getKitapListesi()) {
//			
//			System.out.println("kitaplar : " +  w);
//			
//			
//		}
//		
//		System.out.println(s.get(H1_Ogrenci.class, 1).getKitapListesi());
		
		
		/*
		 * SİLME İŞLEMİ
		 */
		
		
//		s.createQuery("DELETE FROM H2_Kitap").executeUpdate(); //Tablonun içini boşaltıyor.
//		
//		System.out.println("Kitaplar silindi");
		
//		s.delete(s.get(H1_Ogrenci.class, 1));
//		
//		System.out.println("Ogrenciyi Sildi");
		
		
		
		
		
		
		
		
		
		tx.commit();
	}

}

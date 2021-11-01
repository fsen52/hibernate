package h05_ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h04_oneToMany.H1_Ogrenci;
import h04_oneToMany.H2_Kitap;

public class H3_Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Mirasyediler.class)
																			  .addAnnotatedClass(H2_Arsalar.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		H2_Arsalar denizli = new H2_Arsalar(11, "Denizli");
		H2_Arsalar istanbul = new H2_Arsalar(22, "İstanbul");
		H2_Arsalar maras = new H2_Arsalar(33, "Kahramanmaraş");
		
		
		H1_Mirasyediler m1 = new H1_Mirasyediler(12345, "faruk koruk", 29);
		H1_Mirasyediler m2 = new H1_Mirasyediler(12346, "tarık doruk", 45);
		H1_Mirasyediler m3 = new H1_Mirasyediler(12347, "namık tanık", 78);
		
		
		m1.getArsaListesi().add(denizli);
		m1.getArsaListesi().add(istanbul);
		m1.getArsaListesi().add(maras);
		m2.getArsaListesi().add(denizli);
		m3.getArsaListesi().add(istanbul);
		m3.getArsaListesi().add(maras);
		
		
//		
//		denizli.setMirasyediListesi(denizli.getMirasyediListesi());
//		istanbul.setMirasyediListesi(istanbul.getMirasyediListesi());
//		maras.setMirasyediListesi(maras.getMirasyediListesi());
		
		
		s.save(m1);
		s.save(m2);
		s.save(m3);
		s.save(denizli);
		s.save(istanbul);
		s.save(maras);
		
		tx.commit();
		
		
	
		
	}
	
}

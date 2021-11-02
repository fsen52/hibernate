package h07_crudIslemleri;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMetodlar {

	private static SessionFactory sf;

	public void SessionFactoryOlustur() {

		try {

			Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Personel.class);
			sf = con.buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Session Factory oluşurken hata oluştu");

			throw new ExceptionInInitializerError(); // hatanın türü
		}
	}

	public void personelEkle(String ad, String soyad, int maas) {

		Session s = sf.openSession();
		Transaction tx = null;
		try {

			tx = s.beginTransaction();

			Personel personel = new Personel(ad, soyad, maas);

			s.save(personel);

			tx.commit();

			System.out.println("Personel başarıyla kaydoldu");

		} catch (HibernateException e) {

			if (tx != null) {
				tx.rollback(); // işlemi geri alır
			}
			e.printStackTrace(); // Exception'ın satırını gösterir.
		} finally {
			s.close();

		}
	}

	public void tumPersoneliListele() {
		Session s = sf.openSession();
		Transaction tx = null;
		try {

			tx = s.beginTransaction();

			List<Personel> personeller = s.createQuery("FROM Personel").getResultList();

			personeller.stream().forEach((x) -> System.out.println((x)));
			tx.commit();
		} catch (HibernateException e) {

			if (tx != null) {
				tx.rollback(); // işlemi geri alır
			}
			e.printStackTrace(); // Exception'ın satırını gösterir.
		} finally {
			s.close();

		}
	}

	public void personelSil(long id) {

		Session s = sf.openSession();
		Transaction tx = null;
		try {

			tx = s.beginTransaction();

			Personel personel = s.get(Personel.class, id);
		if(personel==null) {
			System.out.println("Bulunamadı");
		}else {
			s.delete(personel);
			tx.commit();
			System.out.println(personel + "silindi");
		}
			
		} catch (HibernateException e) {

			if (tx != null) {
				tx.rollback(); // işlemi geri alır
			}
			e.printStackTrace(); // Exception'ın satırını gösterir.
		} finally {
			s.close();

		}

	}

	public void maasGuncelle(long id, int maas) {

		Session s = sf.openSession();
		Transaction tx = null;
		try {

			tx = s.beginTransaction();

			Personel personel = s.get(Personel.class, id);
			
			if(personel==null) {
				System.out.println("Bulunamadı");
			}else {
				personel.setMaas(maas);
				tx.commit();
				System.out.println("yeni maas " + maas + " oldu.");
			}
			
		} catch (HibernateException e) {

			if (tx != null) {
				tx.rollback(); // işlemi geri alır
			}
			e.printStackTrace(); // Exception'ın satırını gösterir.
		} finally {
			s.close();

		}

	}



}

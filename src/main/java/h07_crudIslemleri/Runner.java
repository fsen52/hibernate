package h07_crudIslemleri;

public class Runner {

	public static void main(String[] args) {

		CrudMetodlar metod = new CrudMetodlar();
		
		metod.SessionFactoryOlustur();
		
//		metod.personelEkle("Hakan", "Yenilmez", 3000);
//
//		metod.personelEkle("Basri", "Bilir", 4000);
//
//		metod.personelEkle("Dündar", "VARDAR", 5000);
				
//		metod.tumPersoneliListele();
//		
//		metod.personelSil(27L);
//		
		metod.tumPersoneliListele();
		
		metod.maasGuncelle(50, 1250);
	}

}

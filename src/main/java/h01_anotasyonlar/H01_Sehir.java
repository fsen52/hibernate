package h01_anotasyonlar;

import javax.persistence.Entity;
import javax.persistence.Id;



//@Table(name="sehir_tablosu")

@Entity

public class H01_Sehir {
	
	@Id
	
	private int sehirPlaka;
	
	private String sehirAd;
	
	public H01_Sehir(int sehirPlaka, String sehirAd) {
		super();
		this.sehirPlaka = sehirPlaka;
		this.sehirAd = sehirAd;
	}

	public int getSehirPlaka() {
		return sehirPlaka;
	}

	public void setSehirPlaka(int sehirPlaka) {
		this.sehirPlaka = sehirPlaka;
	}

	public String getSehirAd() {
		return sehirAd;
	}

	public void setSehirAd(String sehirAd) {
		this.sehirAd = sehirAd;
	}

	

	@Override
	public String toString() {
		return "H01_Sehir [sehirPlaka=" + sehirPlaka + ", sehirAd=" + sehirAd + "]";
	}

}

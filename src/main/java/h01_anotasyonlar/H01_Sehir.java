package h01_anotasyonlar;

import javax.persistence.Entity;
import javax.persistence.Id;



//@Table(name="sehir_tablosu")

@Entity

public class H01_Sehir {
	

	@Id
	private int sehirPlaka;
	
	private String sehirAd;
	
	private int sehirNufus;
	
	
	public H01_Sehir() {
		
		
	}

	public H01_Sehir(int sehirPlaka, String sehirAd, int sehirNufus) {
		
		this.sehirPlaka = sehirPlaka;
		this.sehirAd = sehirAd;
		this.sehirNufus = sehirNufus;
	}

	public int getSehirNufus() {
		return sehirNufus;
	}

	public void setSehirNufus(int sehirNufus) {
		this.sehirNufus = sehirNufus;
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
		return "H01_Sehir [sehirPlaka=" + sehirPlaka + ", sehirAd=" + sehirAd + ", sehirNufus=" + sehirNufus + "]";
	}

	



}

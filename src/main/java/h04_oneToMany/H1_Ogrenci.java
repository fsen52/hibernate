package h04_oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Ogrenciler1")
@Cacheable
@Cache (region="H1_Ogrenci", usage=CacheConcurrencyStrategy.READ_WRITE)
public class H1_Ogrenci {
	
	@Id
	private int no;
	
	private String ad;
	
	private int puan;

	
	@OneToMany(mappedBy="ogrenci", orphanRemoval = true , cascade = CascadeType.ALL) //fetch = FetchType.LAZY)
	private List<H2_Kitap> kitapListesi = new ArrayList<H2_Kitap>();
	
	
	public H1_Ogrenci() {
		
	}
	
	public H1_Ogrenci(int no, String ad, int puan) {
		super();
		this.no = no;
		this.ad = ad;
		this.puan = puan;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public List<H2_Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public void setKitapListesi(List<H2_Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}

	@Override
	public String toString() {
		return "H1_Ogrenci [no=" + no + ", ad=" + ad + ", puan=" + puan + ", kitapListesi="
				+ kitapListesi + "]";
	}
	
	
	

}

package h04_oneToMany;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="kitaplar")
@Cacheable
@Cache (region="H2_Kitap", usage=CacheConcurrencyStrategy.READ_WRITE)
public class H2_Kitap {

	@Id
	private int fiyat;
	
	private String isim;

	@ManyToOne
	@JoinColumn(name="ogrId2")
	private H1_Ogrenci ogrenci;
	
	public H2_Kitap() {
	}
	
	public H2_Kitap(int fiyat, String isim) {
		super();
		this.fiyat = fiyat;
		this.isim = isim;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public H1_Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(H1_Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	@Override
	public String toString() {
		return "H2_Kitap [fiyat=" + fiyat + ", isim=" + isim + "]";
	}
	
	
}

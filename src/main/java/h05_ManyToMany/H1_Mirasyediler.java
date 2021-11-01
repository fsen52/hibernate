package h05_ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;

@Entity
public class H1_Mirasyediler {

	@Id
	private int TC;
	
	private	String isim;
	
	private int yas;
	
	@ManyToMany
	@JoinTable( name = "H1_mrsydlr_H2_Arslr", 
				joinColumns = {@JoinColumn(name="m_id")}, 
				inverseJoinColumns = {@JoinColumn(name="a_id")} )
	private List<H2_Arsalar> arsaListesi  = new ArrayList<>();

	public H1_Mirasyediler() {
	}

	public H1_Mirasyediler(int tC, String isim, int yas) {
		TC = tC;
		this.isim = isim;
		this.yas = yas;
		
	}

	public int getTC() {
		return TC;
	}

	public void setTC(int tC) {
		TC = tC;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public List<H2_Arsalar> getArsaListesi() {
		return arsaListesi;
	}

	public void setArsaListesi(List<H2_Arsalar> arsaListesi) {
		this.arsaListesi = arsaListesi;
	}

	@Override
	public String toString() {
		return "H1_Mirasyediler [TC=" + TC + ", isim=" + isim + ", yas=" + yas + ", arsaListesi=" + arsaListesi + "]";
	}
	
	
	
	
	
	
	
}

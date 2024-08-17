package FutbolApp.entities;

import java.time.LocalDate;

public class Menajer extends BaseEntities {
	static int manajerIDCount;
	private String isim;
	private String soyIsim;
	private long sozlesmeBedeli;
	private LocalDate dogumTarihi;
	
	public Menajer(String isim, String soyIsim, long sozlesmeBedeli, LocalDate dogumTarihi) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.sozlesmeBedeli = sozlesmeBedeli;
		this.dogumTarihi = dogumTarihi;
	}
	
	public static int getManajerIDCount() {
		return manajerIDCount;
	}
	
	public static void setManajerIDCount(int manajerIDCount) {
		Menajer.manajerIDCount = manajerIDCount;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyIsim() {
		return soyIsim;
	}
	
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public long getSozlesmeBedeli() {
		return sozlesmeBedeli;
	}
	
	public void setSozlesmeBedeli(long sozlesmeBedeli) {
		this.sozlesmeBedeli = sozlesmeBedeli;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
}
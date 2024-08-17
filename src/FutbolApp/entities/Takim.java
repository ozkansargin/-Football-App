package FutbolApp.entities;

import FutbolApp.utility.ERenkler;

public class Takim extends BaseEntities{
	static int takimIdCount = 0;
	
	private String takimIsim;
	private String baskanIsmi;
	private String kurulusTarihi;
	private Integer puan;
	private Integer ligID;
	private ERenkler renkler;
	private int manejerID = -1
	
	public Takim(String takimIsim, String baskanIsmi, String teknikDirektor, String kurulusTarihi, Integer puan, Integer ligID, ERenkler renkler) {
		this.takimIsim = takimIsim;
		this.baskanIsmi = baskanIsmi;
		this.kurulusTarihi = kurulusTarihi;
		this.puan = puan;
		this.ligID = ligID;
		this.renkler = renkler;
		this.id=++takimIdCount;
	}
	
	public static int getTakimIdCount() {
		return takimIdCount;
	}
	
	public static void setTakimIdCount(int takimIdCount) {
		Takim.takimIdCount = takimIdCount;
	}
	
	public String getTakimIsim() {
		return takimIsim;
	}
	
	public void setTakimIsim(String takimIsim) {
		this.takimIsim = takimIsim;
	}
	
	public String getBaskanIsmi() {
		return baskanIsmi;
	}
	
	public void setBaskanIsmi(String baskanIsmi) {
		this.baskanIsmi = baskanIsmi;
	}
	
	public String getTeknikDirektor() {
		return teknikDirektor;
	}
	
	public void setTeknikDirektor(String teknikDirektor) {
		this.teknikDirektor = teknikDirektor;
	}
	
	public String getKurulusTarihi() {
		return kurulusTarihi;
	}
	
	public void setKurulusTarihi(String kurulusTarihi) {
		this.kurulusTarihi = kurulusTarihi;
	}
	
	public Integer getPuan() {
		return puan;
	}
	
	public void setPuan(Integer puan) {
		this.puan = puan;
	}
	
	public Integer getLigID() {
		return ligID;
	}
	
	public void setLigID(Integer ligID) {
		this.ligID = ligID;
	}
	
	public ERenkler getRenkler() {
		return renkler;
	}
	
	public void setRenkler(ERenkler renkler) {
		this.renkler = renkler;
	}
	
	@Override
	public String toString() {
		return "Takim{" + "takimIsim='" + getTakimIsim() + '\'' + ", baskanIsmi='" + getBaskanIsmi() + '\'' + ", teknikDirektor='" + getTeknikDirektor() + '\'' + ", kurulusTarihi='" + getKurulusTarihi() + '\'' + ", puan=" + getPuan() + ", ligID=" + getLigID() + ", renkler=" + getRenkler() + ", id=" + getId() + '}';
	}
}
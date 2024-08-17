package FutbolApp.Databases;

import FutbolApp.entities.Futbolcu;
import FutbolApp.utility.DataBaseManager;
import FutbolApp.utility.EMevki;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FutbolcuDB extends DataBaseManager<Futbolcu> {
	
	//isme ve soyisme göre futbolcu bulma
	public Optional<Futbolcu> ismiVeSoyIsmiBul(String isim, String soyIsim) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getIsim().equalsIgnoreCase(isim) && futbolcu.getSoyIsim()
		                                                                                           .equalsIgnoreCase(soyIsim))
		                  .findFirst();
	}
	
	// mevkiye göre futbolcu bulma
	public List<Futbolcu> mevkiBul(EMevki mevki) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getMevki().equals(mevki)).collect(Collectors.toList());
	}
	
	// takımID ye göre futbolcu bulma
	public List<Futbolcu> takimIDBul(Integer takimID) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getTakimID().equals(takimID))
		                  .collect(Collectors.toList());
	}
	
	public boolean futbolcuSil(int id){
		return veriListesi.removeIf(futbolcu -> futbolcu.getId()==id);
	}
}
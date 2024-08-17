package FutbolApp.Databases;

import FutbolApp.entities.Takim;
import FutbolApp.utility.DataBaseManager;
import FutbolApp.utility.ERenkler;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DataBaseManager<Takim> {
	
	//ismiyle takım bulma
	public Optional<Takim> takimiIsmiyleBul(String takimIsmi){
		return veriListesi.stream()
		                  .filter(takim -> takim.getTakimIsim().equalsIgnoreCase(takimIsmi))
		                  .findFirst();
	}
	public List<Takim> renklereGoreTakimBul(ERenkler renkler){
		return veriListesi.stream()
		                  .filter(takim ->takim.getRenkler().equals(renkler))
		                  .collect(Collectors.toList());
		
		
	}
	
}
package FutbolApp.utility;

import FutbolApp.entities.BaseEntities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBaseManager<T extends BaseEntities> implements ICRUD<T>{
	
	protected List<T> veriListesi = new ArrayList<>();
	
	@Override
	public Optional<T> save(T t) {
		if (t != null && veriListesi.add(t)) {
			return Optional.of(t);
		}
		return Optional.empty();
	}
	
	@Override
	public List<T> saveAll(List<T> t) {
		if (veriListesi.addAll(t)) {
			return t;
		} else {
			return null;
		}
	}
	
	@Override
	public Optional<T> update(T t) {
		int index = veriListesi.indexOf(t);
		if (index >= 0) {
			T oldEntity = veriListesi.set(index, t);
			return Optional.of(oldEntity);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public List<T> findAll() {
		// optional kullanma
		return veriListesi;
	}
	
	
	@Override
	public Optional<T> findById(int id) {
		for (BaseEntities entity : veriListesi) {
			if (entity.getId() == id) {
				return Optional.of((T) entity);
			}
		}
		return Optional.empty();
	}
}
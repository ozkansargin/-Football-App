package FutbolApp.entities;

import FutbolApp.Databases.FutbolcuDB;
import FutbolApp.Databases.TakimDB;

public class TransferYonetimi {
	private FutbolcuDB futbolcuDB;
	private TakimDB takimDB;
	
	public TransferYonetimi(FutbolcuDB futbolcuDB, TakimDB takimDB) {
		this.futbolcuDB = futbolcuDB;
		this.takimDB = takimDB;
	}
}
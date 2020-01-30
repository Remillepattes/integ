package model;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.LigneDevisDAO;
import orm.LigneDevis;



@Stateless
public class LigneDevisService {
	
	@EJB
	private LigneDevisDAO LigneDevisDAO;

	public void creerLignesDevis(List<LigneDevis> ldvs) {
		
		for (LigneDevis ldv : ldvs) {
			LigneDevisDAO.create(ldv);
		}
			
	}
}

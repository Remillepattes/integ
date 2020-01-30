package model;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.OrderDAO;
import orm.Commande;
import orm.LigneDevis;

@Stateless
public class OrderService {
	
	@EJB
	private OrderDAO OrderDAO;

	public void createOrder(List<LigneDevis> ldvs) {

		Commande baseOrder = new Commande();
		
		baseOrder.setDateCreation(new Date());
		baseOrder.setDateFacturation(new Date());
		//baseOrder.setLibelle(order.libelle);
		
		OrderDAO.create(baseOrder);
	}
	
	
	public List<Commande> getAllOrders(){
		
		return OrderDAO.getAllOrders();
	}
	
}

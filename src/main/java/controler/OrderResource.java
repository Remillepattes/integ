package controler;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.ProduitDAO;
import model.LigneDevisService;
import model.OrderService;
import model.ProduitService;
import orm.Commande;
import orm.LigneDevis;
import orm.Produit;

@Path("/orders")
public class OrderResource {
	
	@EJB
	private OrderService OrderService;
/*	
	@GET
	@Produces("application/json")
	public List<Commande> getAllOrder() {
		
		OrderService.createOrder(order);
	}
	*/
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(List<LigneDevis> ldvs) {
		
		LigneDevisService service = new LigneDevisService();
		
		try {
			service.creerLignesDevis(ldvs);
			System.out.println("1 ligne ajoutée");
			
			//service.createOrder(order);
			//return Response.status(201).entity(produit2.getNom()).build();
		} catch (Exception e) {
			System.out.println("erreur lors de l'ajout des lignes");
			//return Response.status(400).entity(produit2.getNom()).build();
		}
		return Response.status(201).build();
	}
/*
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Inscription create(Inscription inscription) {
		return inscription;
	}
	 */
}

package controler;

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
import model.ProduitService;
import orm.Produit;

@Path("/produits")
public class ProduitsResource {
	
	@EJB
	private ProduitService produitService;
	
	@GET
	@Produces("application/json")
	public List<Produit> getProduits() {
		
		return produitService.getListeProduits();
		
	}
	/*
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces("application/json")
	public Response create(@FormParam("email") String email, @FormParam("motDePasse") String motDePasse) {
		InscriptionService service = new InscriptionService();
		try {
			Inscription inscription = service.inscrire(email, motDePasse, motDePasse, true);
			return Response.ok().entity(inscription).build();
		} catch (InscriptionInvalideException e) {
			return Response.status(400).entity(e.getMessages()).build();
		}
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Inscription create(Inscription inscription) {
		return inscription;
	}
	 */
}

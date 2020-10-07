package com.github.juliherms;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.github.juliherms.entidades.Produto;
import java.util.List;


/**
 * Endpoint de produtos
 */
@Path("produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {
    
    @GET
    public List<Produto> buscarTodosProdutos() {
        return Produto.listAll();
    }
}

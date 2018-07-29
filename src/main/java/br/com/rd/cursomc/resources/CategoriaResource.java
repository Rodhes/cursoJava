/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rd.cursomc.resources;

import br.com.rd.cursomc.domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rodhes
 */
@RestController
@RequestMapping("/url")
public class CategoriaResource {
    @RequestMapping(method =RequestMethod.GET )
    
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Ecritório");
        List <Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
                
        
        
        return lista;
    }
    
}

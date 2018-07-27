/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rd.cursomc.resources;

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
    
    public String listar(){
        return "Rest ok";
    }
    
}

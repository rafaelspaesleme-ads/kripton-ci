/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avantews.entity;

import br.com.avantews.entity.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avantews
 */
public class PessoaTest {
    
    @Test
    public void criaEntityPessoa(){
        Pessoa pessoa = new Pessoa();
        assertNotNull(pessoa);
    }
    
    @Test
    public void entityPessoaNomeNotNull(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(null);
        
        assertNotNull(pessoa);
        
    }
    
}

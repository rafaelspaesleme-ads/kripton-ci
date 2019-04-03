/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avantews;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    
}

package br.com.saraiva.acesspage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.saraiva.book.addtocart.BaseTest;
import br.com.saraiva.book.addtocart.Pages.Operations;

public class AddToCart extends BaseTest{

        private br.com.saraiva.book.addtocart.Pages.Operations AddToCart;
    @BeforeMethod
    public void instantiatepages(){

        AddToCart = new Operations();
    }
    @Test
    public void addtocart (){
        this.AddToCart.writename("Harry Potter");


    }
    
}

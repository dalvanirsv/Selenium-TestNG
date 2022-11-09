package br.com.saraiva.book.addtocart.Pages;

import org.openqa.selenium.WebElement;

public class Operations extends Elements{

    public void writename(String name){
        write(super.name, name);

    }

    private void write(WebElement webElement, String name) {
    }

}

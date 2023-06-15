package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        setBill("Extra Cheese Added: " + 80+"\n");
        setPrice(80);
        if(getVeg() == true){
            //veg toppings
            setBill("Extra Toppings Added:" + 70+"\n");
            setPrice(70);
        }
        else{
            setBill("Extra Toppings Added: " +120+"\n");
            setPrice(120);
        }
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }

}

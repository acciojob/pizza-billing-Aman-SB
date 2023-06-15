package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        if(this.isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.bill += ("Base Price Of The Pizza: " + this.price +"\n");
    }

    public void setPrice(int price) {
        this.price += price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill += bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.bill += ("Extra Cheese Added: " + 80+"\n");
        this.price+=80;
    }

    public void addExtraToppings(){
        if(this.isVeg == true){
            //veg toppings
            this.bill += ("Extra Toppings Added:" +70+"\n");
            this.price += 70;
        }
        else{
            this.bill += ("Extra Toppings Added: " +120+"\n");
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.bill += ("Paperbag Added: " + 20+"\n");
        this.price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill += ("Total Price: "+this.price+"\n");
        return this.bill;
    }
}

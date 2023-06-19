package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extra_cheese_price = 80;
    private int extra_toppings_veg_price = 70;

    private int extra_toppings_non_veg_price = 120;
    private int paper_bag_price = 20;
    private int base_pizza_price;
    private boolean is_extra_cheese_added = false;
    private boolean is_extra_toppings_added = false;
    private boolean is_opted_for_takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.base_pizza_price = this.price;

        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(is_extra_cheese_added == false){
            is_extra_cheese_added = true;
            this.price += extra_cheese_price;
        }
    }

    public void addExtraToppings(){
        if(is_extra_toppings_added == false){
            is_extra_toppings_added = true;
            if(this.isVeg == true){
                //veg toppings
                this.price += extra_toppings_veg_price;
            }
            else{
                this.price += extra_toppings_non_veg_price;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(is_opted_for_takeaway == false){
            is_opted_for_takeaway = true;
            this.price += this.paper_bag_price;
        }
    }

    public String getBill(){
        this.bill += ("Base Price Of The Pizza:" +this.base_pizza_price + "\n");

        if(is_extra_cheese_added == true){
            this.bill += ("Extra Cheese Added:" + this.extra_cheese_price + "\n");
        }

        if(is_extra_toppings_added == true){
            if(this.isVeg == true){
                this.bill += ("Extra Toppings Added: " + this.extra_toppings_veg_price +"\n");
            }
            else {
                this.bill += ("Extra Toppings Added: " + this.extra_toppings_non_veg_price +"\n");
            }
        }

        if(is_opted_for_takeaway == true){
            this.bill += ("Paperbag Added: " + this.paper_bag_price + "\n");
        }

        this.bill += ("Total Price: " + this.price + "\n");

        return this.bill;
    }
}

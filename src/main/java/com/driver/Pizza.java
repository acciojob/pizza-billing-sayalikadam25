package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    private boolean extraCheeseFlag;
    private boolean takeAwayFlag;
    //private boolean extraToppingVegFlag;
    private boolean extraToppingFlag;
    boolean isBillGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true){
           this.price =300;
           this.toppingsPrice=70;
        }
        else{
            this.price =400;
            this.toppingsPrice=120;
        }
        this.extraCheeseFlag=false;
        this.extraToppingFlag=false;
        this.takeAwayFlag=false;
        this.bill="Base Price of The Pizza: "+this.price+'\n';

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheeseFlag==false)
            price=price+cheesePrice;
        extraCheeseFlag=true;
        return;
    }
    public void addExtraToppings(){
        if(extraToppingFlag==false){
            price=price+toppingsPrice;
            extraToppingFlag=true;
        }
    }
    public void addTakeaway(){
        if(takeAwayFlag==false)
            price=price+takeAwayPrice;
        takeAwayFlag=true;
        return;
    }
    public String getBill(){
        if(isBillGenerated==false) {
//            if (isVeg)
//                bill += "Base Price Of The Pizza: 300" + '\n';
//            if (!isVeg)
//                bill += "Base Price Of The Pizza: 400" + '\n';
            if (extraCheeseFlag == true)
                bill += "Extra Cheese Added: " + cheesePrice + '\n';
            if (extraToppingFlag == true)
                bill += "Extra Toppings Added: " + toppingsPrice + '\n';
            if (takeAwayFlag == true)
                bill += "Paperbag Added: " + takeAwayPrice + '\n';
            bill += "Total Price: " + price;

            isBillGenerated=true;
        }
        return this.bill;
    }
}

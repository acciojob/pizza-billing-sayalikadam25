package com.driver;

public class DeluxePizza extends Pizza {
//    private int price;
//    private String bill;
//    private boolean takeAwayFlag;
//    private boolean extraCheeseFlag;
//    private boolean extraToppingFlag;
//    private boolean extraToppingNonVeFlag=false;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();

    }

}

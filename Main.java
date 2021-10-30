package com.company;

class Hamburger{

    private String breadType;
    private String meatType;
    private double basePrice;
    private boolean tomato;
    private boolean cheese;
    private boolean lettuce;
    private boolean onion;
    private String name;

    public Hamburger(String breadType, String meatType, double basePrice,
                     boolean tomato, boolean cheese, boolean lettuce, boolean onion, String name) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = basePrice;
        this.tomato = tomato;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.onion = onion;
        this.name = "hamburger";
    }

    public void addOns(){
        double finalPrice = basePrice;

        if (tomato){
            finalPrice += 0.25;
        }
        if(cheese){
            finalPrice += 0.5;
        }
        if(lettuce){
            finalPrice += 0.1;
        }
        if(onion){
            finalPrice += 0.15;
        }
        System.out.println("Final price of the burger is: " + finalPrice);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }
}

class HealthyBurger extends Hamburger{

    private boolean tomato;
    private boolean cheese;
    private boolean lettuce;
    private boolean onion;
    private boolean extraLettuce;
    private boolean guacamole;

    public HealthyBurger(String breadType, String meatType, double basePrice, boolean tomato,
                         boolean cheese, boolean lettuce, boolean onion, String name, boolean extraLettuce, boolean guacamole){
       super(breadType, meatType, basePrice, tomato, cheese, lettuce, onion, name);
       this.extraLettuce = extraLettuce;
       this.guacamole = guacamole;
    }

    @Override
    public void addOns(){
        double finalPrice = getBasePrice();

        if (tomato){
            finalPrice += 0.25;
        }
        if(cheese){
            finalPrice += 0.5;
        }
        if(lettuce){
            finalPrice += 0.1;
        }
        if(onion){
            finalPrice += 0.15;
        }
        if(extraLettuce){
            finalPrice += 0.1;
        }
        if(guacamole){
            finalPrice += 0.75;
        }
        System.out.println("Final price of the burger is: " + finalPrice);
    }


}


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("white", "beef", 4.5, true,
                true, true, false, "hamburger");

        hamburger.addOns();

        HealthyBurger healthyBurger = new HealthyBurger("wheat", "turkey", 6.0, true, true,
        true, true, "healthy burger", true, true);

        healthyBurger.addOns();
    }

}


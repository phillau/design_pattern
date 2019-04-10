package com.liufei.chapter1.template.template;

public abstract class CoffeineBeverage {
    public final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        if(isAddCondiments()){
            addCondiments();
        }
    }

    public final void boilWater(){
        System.out.println("boil water");
    }

    public abstract void brew();

    public final void pourInCup(){
        System.out.println("pour in to a cup");
    }

    public abstract void addCondiments();

    public boolean isAddCondiments(){
        return true;
    }
}

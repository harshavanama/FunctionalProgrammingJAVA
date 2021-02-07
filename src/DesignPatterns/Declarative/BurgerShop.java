package DesignPatterns.Declarative;

import Basics.FunctionalProgramming.Currying.Function;

public class BurgerShop {

    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration){
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger){

        System.out.println("BaseBurger - " + baseBurger);
        return decoration.apply(baseBurger);
    }
}

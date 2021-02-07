package DesignPatterns.FluentInterface;

import Basics.FunctionalProgramming.Currying.Function;

import java.util.*;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

//    public void add(String item){
//        cart.add(item);
//        System.out.println(item + " added to the cart.");
//    }
//
//    public void deliverAt(String location){
//        this.address = location;
//        System.out.println("The delivery address set by you is " + location + "'");
//    }

    public Order add(String item){
        cart.add(item);
        System.out.println(item + " added to the cart.");
        return new Order(this.cart,this.address);
    }

    public Order() {
    }

    public Order deliverAt(String location){
        this.address = location;
        System.out.println("The delivery address set by you is " + location + "'");
        return new Order(this.cart,this.address);
    }

//    public void place(){
//        System.out.println("Order placed!");
//        System.out.println(this.cart.size() + " items ordered by you will be delivered at " + this.address + " tomorrow.");
//    }

    public static void place(Function<Order,Order> function){
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed!");
        System.out.println(order.cart.size() + " items ordered by you will be delivered at " + order.address + " tomorrow.");
    }
}

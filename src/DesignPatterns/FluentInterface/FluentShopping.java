package DesignPatterns.FluentInterface;

public class FluentShopping {
    public static void main(String[] args) {

//        Order myOrder = new Order();
//        myOrder.add("phone");
//        myOrder.add("purse");
//        myOrder.deliverAt("221 street, London");
//        myOrder.place();

//            new Order()
//                .add("phone")
//                .add("purse")
//                .deliverAt("221 baker street, London")
//                .place();

        Order.place(ord ->
                ord.add("phone")
                     .add("purse")
                     .deliverAt("221 Baker Street, London"));

    }
}

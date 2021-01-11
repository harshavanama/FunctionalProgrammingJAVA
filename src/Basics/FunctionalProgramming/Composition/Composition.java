package Basics.FunctionalProgramming.Composition;

public class Composition {
    public static void main(String[] args) {

        Function<Square,Integer> fun1 = s->s.getArea();
        Function<Integer,Double> fun2 = area->Math.sqrt(area);

        Function<Square, Double> getside = fun2.compose(fun1);

        Square square = new Square();
        square.setArea(100);

        Double result = getside.apply(square);

        System.out.println(result);
    }
}

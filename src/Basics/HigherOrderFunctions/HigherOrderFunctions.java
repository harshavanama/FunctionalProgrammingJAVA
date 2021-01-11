package Basics.HigherOrderFunctions;

public class HigherOrderFunctions {
    public static void main(String[] args) {
        IFactory<Integer> createFactory = createFactory(()-> Math.random()*100,r -> r.intValue());
        var finalProduct = createFactory.create();
        System.out.println(finalProduct);
    }

    public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
        return () -> {
           T product = producer.Produce();
           return configurator.configure(product);
        };
    }
}

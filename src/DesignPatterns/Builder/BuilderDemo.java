package DesignPatterns.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder builder = new MobileBuilder();
        Mobile myMobile = builder.with(h->{
            h.battery=100;
            h.camera=24;
            h.processor="octo";
        }).createMobile();

        System.out.println(myMobile);
    }

}

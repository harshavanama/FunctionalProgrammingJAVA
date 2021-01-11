package Basics.PureFunction;

public class ImpureFunction {
    private int value = 0;
    public int add(int valueC){
        this.value += valueC;
        return this.value;
    }
}

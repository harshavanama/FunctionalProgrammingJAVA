package Basics.DataStructures;

public abstract class ListFun<T> {
    public abstract T head();

    public abstract ListFun<T> tail();

    public abstract boolean isEmpty();

    @SuppressWarnings("rawtypes")
    public static final ListFun NIL = new Nil();

    private static class Nil<T> extends ListFun<T> {

        private Nil() {
        }

        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFun<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length() {
        int l = 0;

        ListFun<T> temp = this;
        while (!temp.equals(NIL)) {
            l++;
            temp = temp.tail();
        }

        return l;
    }

    private static class Const<T> extends ListFun<T> {

        private final T head;
        private final ListFun<T> tail;

        Const(T element, ListFun<T> list) {
            this.head = element;
            this.tail = list;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFun<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            return length() == 0 ? true : false;
        }
    }
}

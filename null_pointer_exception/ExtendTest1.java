package null_pointer_exception;

public class ExtendTest1 {

    public static void main(String[] args) {
        new Child();
    }
}

abstract class Parent {
    public Parent() {
        init();
    }

    public abstract String init();
}


class Child extends Parent {
    private String mTitle = null;

    public Child() {
       /* super();
        System.out.println(mTitle.toString());*/

        System.out.println(init());
    }

    public String init() {

        return mTitle = "It' a test";
    }
}
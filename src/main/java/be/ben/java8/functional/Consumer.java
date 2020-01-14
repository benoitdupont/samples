package be.ben.java8.functional;

/**
 * @author Benoit Dupont
 */
public class Consumer {

    public static void main(String[] args) {
        // Default methods can be overridden
        new FunctionalInterface_defaultMethodAndMethod() {
            @Override
            public void defaultMethod() {
                System.out.println("Override !");
            }

            @Override
            public String far() {
                return null;
            }
        }.defaultMethod();

        // lambda stuff, lol I don't understand
        consuma(() -> "far");
    }

    public static void consuma(FunctionalInterface_ExactlyOneAbstract fi){
        fi.hello();
    }

}

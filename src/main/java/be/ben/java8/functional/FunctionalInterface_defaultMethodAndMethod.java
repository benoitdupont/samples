package be.ben.java8.functional;

/**
 * @author Benoit Dupont
 */
@FunctionalInterface
public interface FunctionalInterface_defaultMethodAndMethod {

   default void defaultMethod(){
       System.out.println("boo");
   }

   String far();
}

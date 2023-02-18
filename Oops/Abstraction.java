
public class Abstraction {
    public static void main(String[] args) {
//      Animal s1=new Animal() {// we cannot an instance of a abstract classes
//      }
        elephant e1=new elephant();
        e1.eat();
        e1.walk();
    }
}
  abstract class Animal{
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();
  }
  class elephant extends Animal{
    void walk(){
        System.out.println(" it has four legs");
    }

  }

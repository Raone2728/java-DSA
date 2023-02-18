public class Inheritance {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eats();
        f1.breathe();
        f1.swims();
    }
}

class Animals{
     String color;
     void eats(){
         System.out.println("eats");
     }
     void breathe() {
         System.out.println("breathe");
     }
}
class Fish extends Animals{
    int fins;
    void swims(){
        System.out.println("Swims");
    }

}

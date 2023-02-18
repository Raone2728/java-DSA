//compiler time Polymorphism--method overloading.

public class Polymorphism {
    public static void main(String[] args) {
//        Calculator cal=new Calculator();
//        System.out.println(cal.sum(9,8));
//        System.out.println(cal.sum(9.0f,9.8f));
//        System.out.println(cal.sum(9,8,8));

       //run time polymorphism--method overriding
        Dear d1=new Dear();
        d1.eat();

    }

}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }

}

class animal{
    void eat(){
        System.out.println("eats anythings");
    }
}
class Dear extends animal{
    @Override
    void eat(){
        System.out.println("eats grass");
    }
}
//_______________________________________________________
//run time overriding
//class A{
//    public int a;
//    public int harry(){
//        return 4;
//    }
//    public void meth2(){
//        System.out.println("I am method 2 of class A");
//    }
//}
//
//class B extends A{
//    @Override
//    public void meth2(){
//        System.out.println("I am method 2 of class B");
//    }
//    public void meth3(){
//        System.out.println("I am method 3 of class B");
//    }
//}
//public class cwh_48_method_overriding {
//    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();
//
//        B b = new B();
//        b.meth2();
//    }
//}
//

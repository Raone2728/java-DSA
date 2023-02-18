public class concept1 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.changeColor("Blue");
        p1.setTip(9);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        // one more ways
        p1.color="yellow";
        System.out.println(p1.color);
        BankAccount b1=new BankAccount();
        b1.username="ritik";
        b1.setPassword("rrrrrr");
        System.out.println(b1.getPassword());


    }

}
class Pen{
    String color;
    int tip;
    void changeColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class BankAccount{
    public String username;
    private String password;
    void setPassword(String newpassword){  //setters
        this.password=newpassword;
    }
    String getPassword(){   //Getters
        return this.password;
    }


}
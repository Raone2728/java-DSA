public class Interface {
    public static void main(String[] args) {
//     Queen s1=new Queen();
//     s1.moves();
//    }

}
interface chessplayer{
   public void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(in all direcrion)");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,rght,left");
    }
}
//multiple Inheritance
interface Herbivore{
  void eats();
}
interface Carnivore{
  void eats();
}
}
class omnivores implements Herbivore,Carnivore {

}


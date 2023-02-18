import java.util.HashMap;
public class HashMap_operations {
    public static void main(String[] args) {
      //create
        HashMap<String,Integer>hm=new HashMap<>();

        //Insert--O(1)
        hm.put("tea",10);
        hm.put("coffe",40);
        hm.put("pizza",100);

        System.out.println(hm); //output will be NOT in ordered

        //Get -->0(1)
       int pizza= hm.get("pizza");
       System.out.println(pizza);

       //if we will call any key which is not present it will give null
        System.out.println(hm.get("samosa")); //null

        //containsKey--0(1)
        System.out.println(hm.containsKey("tea")); //true
        System.out.println(hm.containsKey("samosa")); //false


        //remove--0(1) it will delete the node and return its value
       int value= hm.remove("tea");
       System.out.println(value);  //10
        System.out.println(hm);    //remove tea

        //size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());
        //clear --- remove everything
        hm.clear();

    }
}


import java.util.*;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        ArrayList<Integer>l2=new ArrayList<>();
        l2.add(22);
        l2.add(33);
        l2.add(44);
        ArrayList<Integer>l3=new ArrayList<>();
        l3.add(222);
        l3.add(333);
        l3.add(443);
        mainList.add(l1);
        mainList.add(l2);
        mainList.add(l3);

        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(i)+" ");
            }
            System.out.println();
        }

    }
}

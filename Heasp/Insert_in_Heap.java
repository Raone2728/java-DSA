
import java.util.*;
public class Insert_in_Heap {
    static class Heap{
      ArrayList<Integer>arr=new ArrayList<>();
       public void add(int data){
           arr.add(data);
           int x=arr.size();
           int par=(x-1)/2;
           while(arr.get(par)>arr.get(x)) {
               int temp=arr.get(par);
               arr.set(par,arr.get(x));
               arr.set(x,temp);
               x=par;
               par=(x-1)/2;
           }

        }

        public int peek(){
           return arr.get(0);
        }

        public int remove(){
           int data=arr.get(0);

//           step1:-swap first and last value;
           int temp=arr.get(arr.size()-1);
           arr.set(arr.size()-1,arr.get(0));
           arr.set(0,temp);
//                  remove the last node step2
           arr.remove(arr.size()-1);

//             heapify
            heapify(0);
            return data;

        }

        private void heapify(int i){

           int left=2*i+1;
           int right=2*i+2;
           int min=i;

           if(left<arr.size() || arr.get(min)>arr.get(left)){
               min=left;
           }

            if(right<arr.size() || arr.get(min)>arr.get(right)){
                min=right;
            }
            if(min!=i){
                int temp=arr.get(i);
                arr.set(0,arr.get(min));
                arr.set(min,temp);
                heapify(min);
            }


        }
        public boolean isEmpty(){
           return arr.size()==0;
        }




    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}

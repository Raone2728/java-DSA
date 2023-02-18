//naive approach complexity=O(n)
//
// import java.util.*;
//public class Sqaure_root {
//   static int squareRoot(int n){
//       int i=1;
//       while(i*i<=n){
//           i++;
//       }
//       return i-1;
//    }
//    public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//        int n=Sc.nextInt();
//        System.out.println(squareRoot(n));
//    }
//}
// ------------------------------Efficient Appoarch------------------------------------------

//import java.util.*;
//public class Sqaure_root {
//   static int squareRoot(int n){
//       int i=n/2;
//       while(i*i>n){
//           i--;
//       }
//       return i;
//    }
//    public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//        int n=Sc.nextInt();
//        System.out.println(squareRoot(n));
//    }
//}
//----------------------------------More Efficient using Binary Search(log n)-----------------------


import java.util.*;
public class Sqaure_root {
   static int squareRoot(int n){
       int low=1;
       int high=n;
       int ans=-1;

       while(low<=high){

           int mid=(low+high)/2;

           int sq=mid*mid;

           if(sq>n){
               high=mid-1;

           }
           else{

               low=mid;
                ans=mid;
           }

       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        System.out.println(squareRoot(n));
    }
}

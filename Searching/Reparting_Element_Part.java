//-----------------intput=[0,2,1,3,2,2]-----------
//-----------------output=2--------------------\


public class Reparting_Element_Part {
    static int repeatApproach1(int arr[],int n){  //naive solution complexity 0(n^2)

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++){
                if(arr[i]==arr[j+1]){
                    return arr[j+1];
                }
            }
        }

        return 0;
    }
    static int repeatApproach2(int arr[],int n){ //naive solution complexity O(n) Aux space O(n)
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){

            if(true){
                int c=0;
                c=arr[i];
                 if(visited[c]==true){
                    return c;
                }
              visited[c]=true;
            }
        }


     return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,2,2}, n= 7;


        System.out.println(repeatApproach2(arr, n));
    }
}

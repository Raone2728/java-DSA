/* Input=10,50,40,80,60
output=4 */

public class Largest_Element_Index {
    public static void main(String[] args) {
        int arr[]={10,30,40,50,60};
        int n=5;
        int res=0;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println(res+1);

    }
}


//input=5,20,12,20,8
//output=12 ---------------- >>>>>>>> || <<<<<<<<

public class Second_largest_element {
    static int find_largest(int arr[]){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>res)
                res=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,10,10,10};
        int max=find_largest(arr);
        int res=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>res && arr[i]!=max){
                res=arr[i];
            }
        }
        if(res==max){
            System.out.println("Not having any second Largest element");
        }else{
        System.out.println(res);
        }
    }
}

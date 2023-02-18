
//input=8,5,0,10,0,20
//output=8,5,10,20,0,0
public class test {
    public static void main(String[] args) {
        int arr[]={8,5,10,0,0,10,0};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                int j=0;
                for(j=i+1;j<n;j++){
                    if(arr[j]!=0)
                        break;
                }
                if(j<=6) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");

        }
//        System.out.println(arr.length);

    }
}

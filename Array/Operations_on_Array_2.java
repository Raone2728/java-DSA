
        /*Before Deletion x=8
        3 8 12 5 6
        After Deletion
        3 12 5 6 */


        class Operations_on_Array_2
        {
            static int deleteEle(int arr[], int n, int x)
            {
                int i=0;
                for( ;i<arr.length;i++){
                    if(x==arr[i]) {
                        break;
                    }
                }
                if(i==n){
                    return n;
                }
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                return n-1;
            }

            public static void main(String args[])
            {
                int arr[] = {3, 8, 12, 5, 6}, x = 8, n = 5;



                System.out.println("Before Deletion");

                for(int i=0; i < n; i++)
                {
                    System.out.print(arr[i]+" ");
                }

                System.out.println();


                n = deleteEle(arr, n, x);

                System.out.println("After Deletion");

                for(int i=0; i < n; i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

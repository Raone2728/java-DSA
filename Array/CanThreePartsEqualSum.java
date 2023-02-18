public class CanThreePartsEqualSum{
    public static void main(String[] args) {
      int A[]={1,3,4,5,6,7,7,3,4};
            int sum=0;
            for(int i: A)
                sum=sum+i;
            if(sum%3!=0) {
                System.out.println("false");
                System.exit(0);
            }
            int each=sum/3,temp=0,found=0;
            for (int i=0; i<A.length; i++) {
                temp=temp+A[i];
                if(temp==each){
                    temp = 0;
                    found++;
                }
            }
            if(found>=3)
                System.out.println("True");
            else{
                System.out.println("false");
            }

    }
}
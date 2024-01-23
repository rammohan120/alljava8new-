public class ArraySpecificvalueaddedAtIndex {
    public static void main(String[] args) {
        int[] ar={1,3,5,0,6};
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                ar[i]=10;
            }
        }
        for(int ii:ar){
            System.out.println(ii);
        }
    }
}

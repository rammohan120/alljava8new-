public class SumTheArrays {

    public static void main(String[] args) {
        int[] ar = {1, 3, 5};
        int[] ab = {2, 4, 5};
        int[] a = new int[3];
        for (int i = 0; i < ar.length; i++) {

            a[i] = ar[i] + ab[i];


            }
        for (int ss : a) {
            System.out.println(ss);
        }
    }
}

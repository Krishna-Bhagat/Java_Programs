import java.util.Arrays;

public class Merge_sort_inplace {
    public static void main(String[] args) {
        int arr[] = {24,8,13,56,28,5,2,67,45,8};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int s, int e) {
        if(e-s==1) return;
        int mid = (e-s)/2 +s;
        mergesort(arr,s,mid);
        mergesort(arr, mid, e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int a = s, b=mid;
        while(a<mid && b<e){
            if(arr[a]<arr[b]){
                a++;
            }
            else{
                int tem = arr[b];
                for (int k = b ; k > a; k--) {
                    arr[k] = arr[k-1];
                }
                arr[a] = tem;
                a++;
                b++;
                mid++;
            }
        }
    }
}

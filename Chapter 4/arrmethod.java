import java.util.*;

public class arrmethod {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,74,9};
        System.out.println("addition = " + add(arr));
        System.out.println("max  = " + max(arr));
        System.out.println("enter element you want to search" );
        Scanner sc = new Scanner(System.in);
        int key  = sc.nextInt();
        int index = search(arr,key);
        if(index>=0){
            System.out.println("element at index" + index);
        }
        else{
            System.out.println("element not found");
        }
    }

    static int max(int arr[]){
        int maxn = 0;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>arr[maxn]){
                maxn = j;
            }
        }
        return maxn;
    }

    static int add(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum  = sum + arr[i];
        }
        return sum;
    }

    static int search(int arr[], int key){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == key){
                return i + 1;
            }
           
        }
        return -1;
    }
}
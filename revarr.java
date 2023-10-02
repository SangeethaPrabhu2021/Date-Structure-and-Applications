import java.util.*;
public class revarr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int j=arr.length;
        int n=j/2;
        for(int i=0;i<n;i++)
        {

                int temp=arr[i];
                arr[i]=arr[j-1-i];
                arr[j-1-i]=temp;
        }
        for(int i=0;i<j;i++)
        {
            System.out.println(arr[i]);
        }


    }
}

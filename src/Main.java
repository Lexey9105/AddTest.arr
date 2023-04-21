import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();

    }
    public static void task5() {
        int[][] arr = new int[3][3];
        int n=1;
        for (int i=0,t=0;i< arr.length&&t< arr.length;i++,t++){
            arr[i][t]=n; }
        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    public static void task6() {
int []arr={5, 4, 3, 2, 1};
int[] arrTest=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i=0,j= arr.length-1;i<arrTest.length&&j>arr.length-10;i++,j--) {
            arrTest[i]=arr[j];
        }
        for (int i=0,j= 0;i<arrTest.length&&j<arr.length;i++,j++){
            arr[i]=arrTest[j];
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void task7() {
        int []arr={5,8,2,3,9};
        int n= arr.length;
        int t;
        for (int i=0;i<n/2;i++){
            t=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=t;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8(){
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i=0,j= arr.length-1;i< arr.length;i++,j--){
            if (arr[i]+arr[j]==-2){
                System.out.println("Первое число "+arr[i]+" Второе число "+arr[j]);break;
            }
        }
        System.out.println();
    }



    public static void task9(){
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){for (int j=0;j< arr.length;j++){if (arr[i]+arr[j]==-2){
            System.out.println("Первое число "+arr[i]+" Второе число "+arr[j]);
        }


            }
        }

    }


}
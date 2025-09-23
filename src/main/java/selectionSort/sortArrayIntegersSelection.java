package selectionSort;

public class sortArrayIntegersSelection {

    public static void main(String args[]){
        int[] arr={12,-9,29,33,722,0,43};
        System.out.println("Given Array is ");
        printArray(arr);
        System.out.println("Sorted Array is ");
        sortArrayUsingSelection(arr);
        printArray(arr);


    }

    private static void sortArrayUsingSelection(int[] arr) {
        for(int i=arr.length-1;i>-0;i--){
            int largest=0;
            for(int j=1;j<=i;j++){
                if(arr[j]>arr[largest]){
                    largest=j;
                }
                swapArrayelements(arr,largest,i);

            }

        }
    }

    private static void swapArrayelements(int[] arr, int j, int i) {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }

    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}

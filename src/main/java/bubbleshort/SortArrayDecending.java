package bubbleshort;

public class SortArrayDecending {
    public static void main(String[] args){
        int[] array={12,44,23,65,562,1,34,-24};
        sortArrayDecending(array);
        for(int x:array){
            System.out.println(x);
        }


    }
    public static void  sortArrayDecending(int[] arr){
        int swapCounts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //5,7
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    swapCounts++;
                }
            }
        } System.out.println("total swaps happened:: "+swapCounts);



    }
        public static  void swap(int[] arr1,int i,int j){
        if(i==j){
            return;
        }
            int temp=arr1[j];
            arr1[j]=arr1[i];
            arr1[i]=temp;


    }
}

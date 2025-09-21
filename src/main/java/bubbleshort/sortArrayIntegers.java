package bubbleshort;

public class sortArrayIntegers {

    public static void main(String[] args){
        int[] array= {12,-4,-6,11,55,7,10};
        sortArr(array);
        for(int x:array){
            System.out.println(x);
        }
    }

    public static void sortArr(int[] arr){
        //outer loop to track lastHighest number in array
        for(int i=0;i<arr.length;i++){
            //transverse startIndex to lastUnsorted index
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    //swap elements
                  swap(arr,j,j+1);
                }
            }
        }

    }

    public static void swap(int[] array,int i,int j){
        if(i==j){
            return;
        }
        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;
    }

}

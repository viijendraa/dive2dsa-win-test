package bubbleshort;

public class SortArrayCharacters {
    public static void main(String[] args){
        char[] array={'a','A','b','m','j','z','C'};
        sortCharactersInArray(array);
        for(char ch:array){
            System.out.println(ch);
        }
    }

    private static void sortCharactersInArray(char[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(Character.compare(array[j],array[j+1])>0){
                    swap(array,j,j+1);
                }
            }
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp=array[j];
        array[j]=array[i];
        array[i]=temp;
    }

}

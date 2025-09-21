package bubbleshort;

public class SortArrayStringslexicographcally {
    public static void main(String[] args){
        String[] str={"apple","Orange","Lemon","Banana","Chikako"};
        sortStringsArray(str);
        for(String st:str){
            System.out.print(st+" ");

        }

    }

    public static void sortStringsArray(String[] str){
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-1-i;j++){
                if(str[j].toLowerCase().compareTo(str[j+1].toLowerCase())>0){
                    swapStrings(str,j,j+1);
                }

            }
        }

    }
    public static void swapStrings(String[] str,int i,int j){
        if(i==j){
            return;
        }
        String tempStr=str[j];
        str[j]=str[i];
        str[i]=tempStr;
    }
}

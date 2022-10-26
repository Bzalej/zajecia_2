public class Liczydlo {
    public static void main(String[] args) {

        int [] tableOfNumber=new int[] {2,3,3,2,2,3,3,5,6,6,3,1,2,3,7,3,3,5,2};
        int count=0;

        for (int i = 0; i < tableOfNumber.length; i++){
               if (tableOfNumber[i] == 3){
                   count ++;
        }
        }
        System.out.println(count);
    }
    }

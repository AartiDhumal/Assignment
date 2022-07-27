package Day_6;

class Duplicate_Element {
    static int count;
    static void duplicateInArrayPrinter(String[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    count++;
                    arr[i]="";
                }
            }
        }
    }
    static void duplicateInArrayRemover(String[] arr){
        String[] newString =new String[arr.length-count];
        int index=0;
        for(String item: arr){
            if(item.length()>0){
                newString[index++]=item;
            }
        }

        for(String str : newString)
            System.out.print(str+" ");
    }
}
public class Duplicate {
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "ghi", "abc","ghi"};
        System.out.print("Repeated : ");
        Duplicate_Element.duplicateInArrayPrinter(arr);
        Duplicate_Element.duplicateInArrayRemover(arr);
    }
}


//Output
//
//        Repeated : abc
//        ghi
//        def abc ghi
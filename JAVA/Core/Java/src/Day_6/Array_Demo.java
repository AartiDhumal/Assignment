package Day_6;

class One_Array {
    public void display() {
        int marks[] = new int[10];
        marks[5] = 50;
        for (int i=0; i<marks.length; i++)
            System.out.println(marks[i]);

        int rno[] = {1,2,3,4,5,6,7,8,9,10};
        for (int index: rno) {
            System.out.println(index);
        }
    }
}

class Two_Array {
    public void displayData(){
        int rows[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<rows.length; i++){
            for (int j=0; j< rows[i].length; j++){
                System.out.print(rows[i][j]+" ");
            }
            System.out.println();
        }

    }
}

class Three_Array {
    public void displayData(){
        int rows[][] = {{1,2},{1,2,3},{1,2,3,4},{1}};
        for (int i=0; i<rows.length; i++){
            for (int j=0; j<rows[i].length; j++){
                System.out.print(rows[i][j]+" ");
            }
            System.out.println();
        }
    }
}


public class Array_Demo {
    public static void main(String[] args) {
        One_Array obj = new One_Array();
        obj.display();
        Two_Array obj2 = new Two_Array();
        obj2.displayData();
        Three_Array obj3 = new Three_Array();
        obj3.displayData();
    }
}

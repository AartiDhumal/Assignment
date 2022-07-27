package Day_6;

class Jagged_Array {
    int[][] array1 = {{1, 2}, {4, 3, 1}, {5}};
    int[][] array2 = {{1, 8}, {1, 3, 6}, {8}};
    void add() {
        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for (int i = 0; i < array1.length; i++){
            for (int j=0; j < array1[i].length; j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Add_Arrays_Jagged {
    public static void main(String[] args) {
        Jagged_Array array_object = new Jagged_Array();
        array_object.add();
    }
}

//Output
//
//        2 10
//        5 6 7
//        13
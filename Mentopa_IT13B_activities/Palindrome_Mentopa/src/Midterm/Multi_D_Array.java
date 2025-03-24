package Midterm;

public class Multi_D_Array {

    public static void main(String[] args) {

        int marks[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},};

        for (int x = 0; x < marks.length; x++) {
            System.out.print("The element in row" + (x + 1) + ": ");

            for (int y = 0; y < marks[x].length; y++) {
                System.out.print(marks[x][y] + " ");
            }
            System.out.println();
        }
    }
}

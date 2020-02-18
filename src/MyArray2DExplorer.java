import java.util.Arrays;

public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0} \n Actual: {");
        int row = exp.minRow(array, 1);
           System.out.print(row + "}");

        int [] arr = exp.colMax(array);
        System.out.println("\nTest colMax: \nExpecting: [6,6,8,5]\n Actual: " + Arrays.toString(arr));
        arr = exp.allRowSums(array);
        System.out.println("\nTest allRowSums: \nExpecting: [18,9,16]\n Actual: " + Arrays.toString(arr));
    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
        for (int i = 0; i < mat[row].length; i++) {
            if (mat[row][i] %2 != 0 )
                return false;
        }
        return true;
    }

    //returns true if the sum of the numbers the given col is odd.
    public boolean oddColSum(int [][] mat, int column) {
        int x = 0;
        for (int i = 0; i < mat[0].length - 1; i++){
            x = x + mat[i][column];
        }
        if (x % 2 != 0)
            return true;
        else
            return false;
    }



    public int minRow(int [][] mat, int row){
        int x = mat[row][0];
        for (int i = 0; i < mat.length; i++){
            if (mat[row][i] < x)
                x = mat[row][i];
        }
        return x;
    }

    public int[] colMax(int[][] matrix){
        int a;
        int[] max = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++){
            a = 0;
            for (int x = 0; x < matrix.length; x++){
                if ( matrix[x][i] > a)
                    a = matrix[x][i];
            }
            max[i] = a;
        }
        return max;
    }

    public int[] allRowSums(int[][] data){
        int a;
        int[] sum = new int[data.length];
        for(int i = 0; i < data.length; i++){
            a = 0;
            for(int x = 0; x < data[i].length; x++){
                a+=data[i][x];
            }
            sum[i] = a;
        }
        return sum;
    }

   public double[] averageCol(int[][] nums){
       int a;
       int[] average = new int[nums[0].length];
       for (int i = 0; i < nums[0].length; i++){
           a = 0;
           for (int x = 0; x < nums.length; x++){
               a =+ nums[x][i];
           }
           a = a/i;
           average[i] = a;
       }
       return average;
    }

   /* public int smallEven(int[][] matrix){

    }

    public static int biggestRow(int[][] nums){

    }



*/




}












public class Matrixs {
    private int row;
    private int column;
    private int [][] matrix;

    public Matrixs(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Matrixs(int[][] matrix) {
        this.matrix = matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int[][] printMatrix (int [] arr1, int row, int column){
        int [][] matica = new int[row][column];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matica[i][j]= arr1[count];
                System.out.print(matica[i][j]+" ");
                count++;
            }
            System.out.println();
        }
        this.setMatrix(matica);
        return matica;
    }

    public int [][] multiplyingMatrices(int [][]mat1,int [][] mat2){
        int [][] resultMatrux = new int[4][4];
        int sum = 0;
        int result = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4 ; j++) {
                for (int k = 0; k < 4; k++) {
                    sum = mat1[i][k] * mat2[k][j];
                    result += sum;
                }
                resultMatrux[i][j]= result;
                result = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(resultMatrux[i][j]+" ");
            }
            System.out.println();
        }

        return resultMatrux;
    }
}

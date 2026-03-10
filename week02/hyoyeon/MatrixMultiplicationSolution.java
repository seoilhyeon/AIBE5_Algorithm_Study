import java.util.Arrays;

public class MatrixMultiplicationSolution {

    /*
     * 행렬의 곱셈
     *
     * arr1 의 크기가 m x n
     * arr2 의 크기가 n x p 라면
     * 결과 행렬의 크기는 m x p 가 된다.
     *
     * 즉,
     * - 결과 행 개수 = arr1.length
     * - 결과 열 개수 = arr2[0].length
     */
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr2[0].length;

        // 결과 행렬을 0으로 초기화
        int[][] matrix = new int[rows][cols];

        // i: 결과 행
        for (int i = 0; i < rows; i++) {
            // j: 결과 열
            for (int j = 0; j < cols; j++) {
                int val = 0;

                // k: 곱해서 더해 줄 연결 축
                for (int k = 0; k < arr2.length; k++) {
                    val += arr1[i][k] * arr2[k][j];
                }

                matrix[i][j] = val;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 4},
            {3, 2},
            {4, 1}
        };

        int[][] arr2 = {
            {3, 3},
            {3, 3}
        };

        int[][] result = solution(arr1, arr2);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

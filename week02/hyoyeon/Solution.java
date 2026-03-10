public class Solution {

    /*
     * arr1: m x n
     * arr2: n x p
     * result: m x p
     */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr2[0].length;

        // 결과 행렬 생성
        int[][] matrix = new int[rows][cols];

        // i: 결과 행 인덱스
        for (int i = 0; i < rows; i++) {
            // j: 결과 열 인덱스
            for (int j = 0; j < cols; j++) {
                int val = 0;

                // k: arr1의 열 / arr2의 행을 따라 이동하며 곱셈 누적
                for (int k = 0; k < arr2.length; k++) {
                    val += arr1[i][k] * arr2[k][j];
                }

                // 계산한 값을 결과 행렬의 (i, j)에 저장
                matrix[i][j] = val;
            }
        }

        return matrix;
    }
}

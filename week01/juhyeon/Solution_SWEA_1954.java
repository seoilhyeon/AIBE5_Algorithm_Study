package week01.juhyeon;

public class Solution_SWEA_1954 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=Integer.parseInt(sc.nextLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            // 달팽이 숫자 저장
            int[][] number = new int[n][n];
            // 방향 저장
            int[][] dir = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
             
            int x=0, y=0, xyPlus=0; //초기 좌표 저장
            number[x][y] = 1;
            for(int i=2; i<=n*n;) {
                int newX = x+dir[xyPlus%4][0];
                int newY = y+dir[xyPlus%4][1];
                // x,y 범위 유효성 검사
                if(newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    if(number[newX][newY] == 0) {
                        number[newX][newY] = i++;
                        x = newX;
                        y = newY;
                    } else xyPlus++;
                } else xyPlus++;
            }
             
            System.out.println("#"+test_case+" ");
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();
            }
             
        }
    }
}
 
/*
* 
* T 입력받기 (테스트케이스 수)
* for(test_case -> t)
*   N 입력받기 (달팽이 크기)
*   number[N][N] 선언 (숫자 저장할 이차원 배열)
*   dir[4][2] 선언 (방향 저장할 이차원 배열)
*   ㄴ 오른쪽가로 (0,1) 아래세로 (1,0) 왼쪽가로 (0,-1) 위세로(-1,0)
* 
*   x=0, y=0, xyPlus=0 선언 (좌표 저장)
*   number[0][0] = 1 (시작점 저장)
*   for(i=2 -> n*n)
*       newX = x+dir[xyPlus%4][0];
*       newY = y+dir[xyPlus%4][1];
*       if(newX >= 0 && newX < n && newY >= 0 && newY < n) x,y 범위 유효성 검사
*           if(number[newX][newY] == 0) 다음 좌표가 0이라면
*               number[newX][newY] = i++;
*               x = newX;
*               y = newY;
*           else 다음 좌표가 0이 아니라면 방향 전환
*               xyPlus++;
*       else 범위가 유효하지 않다면 방향 전환
*           xyPlus++;
*   
* 
*   for(i -> n)
*       for(j -> n)
*           number[i][j] 출력
*/
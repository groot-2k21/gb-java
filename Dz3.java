import java.util.Arrays;

class Dz3 {
  public static void main(String[] args) {
    point1();
    point2();
    point3();
    point4(5);
    
    int[] arr = point5(12, 444);
    //Если нужен вывод в консоль
    //System.out.print(Array.toString(arr));
    
    point6();
  }

  public static void point1(){
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1};
    for (byte i=0; i < arr.length; i++){
      arr[i] = arr[i] == 0 ? 1 : 0;
      //Если нужен вывод в консоль - раскомментировать строчку ниже
      //System.out.print(Array.toString(arr));
    }
  }

  public static void point2(){
    int arrLen = 100;
    int[] arr = new int[arrLen];
    for (int i=0; i<arrLen; i++){
      arr[i] = i+1;
      //Если нужен вывод в консоль - раскомментировать строчку ниже
      //System.out.print(Array.toString(arr));
    }
  }

  public static void point3(){
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 14, 97, -4, 3, 16, -37, -12, 10, 2, 5};
    for (byte i=0; i < arr.length; i++){
        if (arr[i] < 6) arr[i] *= 2; 
        //Если нужен вывод в консоль - раскомментировать строчку ниже
        //System.out.print(Array.toString(arr));
    }
  }

  public static void point4(int n){
    int[][] board = new int[n][n];

    for (byte x=0; x<n; x++){
      board[x][x] = x+1;
      board[x][n-1-x] = x+1;
    }

    //Если нужен вывод в консоль - раскомментировать строки ниже
    // for (byte i = 0; i < n; i++){
    //   for (byte j = 0; j < n; j++)
    //     System.out.print(board[i][j] + " ");
    //   System.out.println();
    // }
  }

  public static int[] point5(int len, int initValue){
    int[] res = new int[len];
    for (byte i=0; i<len; i++)
      res[i] = initValue;

    return res;
  }

  public static void point6(){
    //Вариант 1.
    int[] arrP6 = {-12, 22, 59, 3, -72, 16, 92, 4, -32};
    int p6Len = arrP6.length;
    Arrays.sort(arrP6);

    int minP6 = arrP6[0];
    int maxP6 = arrP6[ p6Len-1 ];

    //Если нужен вывод в консоль - раскомментировать две строчки ниже 
    //System.out.println("min = " + minP6);
    //System.out.println("max = " + maxP6);

    //Вариант 2
    int[] arrP6v2 = {-12, 22, 59, 3, -72, 16, 92, 4, -32};
    int p6Min = arrP6v2[0];
    int p6Max = arrP6v2[0];
    for (int i=1; i < arrP6v2.length; i++){
      if (arrP6v2[i] < p6Min)  p6Min = arrP6v2[i];
      if (arrP6v2[i] > p6Max)  p6Max = arrP6v2[i];
    }

    //Если нужен вывод в консоль - раскомментировать две строчки ниже 
    //System.out.println("min = " + p6Min);
    //System.out.println("max = " + p6Max);
  }
}

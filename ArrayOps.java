public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] bigBois = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      bigBois[i] = largest(matrix[i]);
    }
    return bigBois;
  }

  public static int sum(int[][] arr) {
    int total = 0;
    int[] rowSums = sumRows(arr);
    for (int i = 0; i < rowSums.length; i++) {
      total += rowSums[i];
    }
    return total;
  }

  // Part 5
  public static int[] sumCols(int[][] matrix) {
    int[] sums = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length;i++) {
      for (int j = 0; j < matrix.length;j++) {
        sums[i] += matrix[j][i];
      }
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] rowSums = sumRows(matrix);
    int check = rowSums[0];
    for (int i = 1; i < rowSums.length; i++) {
      if (check != rowSums[i]) {
        return false;
      }
      check = rowSums[i];
    }
    return true;    
  }
}

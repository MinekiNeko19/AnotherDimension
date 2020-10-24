import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };
    // System.out.print(ArrayOps.sum(B));

    // System.out.print(ArrayOps.largest(B));
    
    // int[] testC = ArrayOps.sumRows(A);
    // for (int i = 0; i < testC.length; i++) {
    //   System.out.println(testC[i]);
    // }
    // System.out.print(Arrays.toString(ArrayOps.sumRows(A)));

    // int[] testD = ArrayOps.largestInRows(A);
    // for (int i = 0; i < testD.length; i++) {
    //   System.out.println(testD[i]);
    // }

    // System.out.print(ArrayOps.sum(A)); 

    ////Part 5
    // System.out.print(Arrays.toString(ArrayOps.sumCols(A)));

    int[][] rowM = { {  2,  1, 3 },
                      {  1, 2, 3 },
                      { 3,  2, 1 } };
    int[][] colM = { {  1,  1, 1 },
                    {  2, 2, 2 },
                    { 3,  3, 3 } };
    int[][] bothM = { {  2,  2, 2 },
                    {  2, 2, 2 } };

    // System.out.print(ArrayOps.isRowMagic(rowM));
    // System.out.print(ArrayOps.isRowMagic(colM));
    // System.out.print(ArrayOps.isRowMagic(bothM));

    System.out.print(ArrayOps.isColMagic(rowM));
    System.out.print(ArrayOps.isColMagic(colM));
    System.out.print(ArrayOps.isColMagic(bothM));
  }
}

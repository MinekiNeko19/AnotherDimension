public class Tester {
  public static void main(String[] args) {
    int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };
    // System.out.print(ArrayOps.sum(B));

    // System.out.print(ArrayOps.largest(B));
    
    int[] testC = ArrayOps.sumRows(A);
    for (int i = 0; i < testC.length; i++) {
      System.out.println(testC[i]);
    }

    // int[] testD = ArrayOps.largestInRows(A);
    // for (int i = 0; i < testD.length; i++) {
    //   System.out.println(testD[i]);
    // }

    System.out.print(ArrayOps.sum(A)); 
  }
}

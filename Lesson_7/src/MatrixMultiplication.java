public class MatrixMultiplication
{
  public static void main(String[] args)
  {
    int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
            b = {{13, 14}, {15, 16}, {17, 18}, {19, 20}},
            c = new int[3][2];

    /* a 3*4
    01 02 03 04
    05 06 07 08
    09 10 11 12
    */

    /* b 4*2
    13 14
    15 16
    17 18
    19 20
     */

    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < b[0].length; j++)
        for (int k = 0; k < b.length; k++)
          c[i][j] += a[i][k] * b[k][j];

    for (int i = 0; i < c.length; i++)
      for (int j = 0; j < c[0].length; j++)
        System.out.println(c[i][j]);
  }
}

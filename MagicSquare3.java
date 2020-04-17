import java.util.Scanner;
public class MagicSquare3 {
  public static void main(String[] args) { 
	int i, j;
	int sum_row, sum_col, sum_diagonal = 0, sum = 0;
	boolean magic=true;
	int[][] square = new int[3][3];
	Scanner input = new Scanner(System.in);

	//Read number for each cell
	System.out.print("Enterers --> ");
	for (i=0; i<3; i++)
13|	   for (j=0; j<3; j++) 
14|	      square[i][j] = input.nextInt();
15|
16|	//Display square
17|	System.out.println("Square;
18|	for (i=0; i<3; i++) {
19|	   for (j=0; j<3; j++) 
20|	      System.out.print(square[i][j] + " ");
21|	   System.out.println();
22|	}
23|
24|	//Calculate sum of the first row
25|	for (j=0; j<3; j++)
26|	   sum += square[0][j];
27|
28|	//Calculate sum of 2nd and 3rd row
29|	for (i=1; i<3; i++) {
30|	   sum_row = 0;
31|	   for (j=0; j<3; j++)
32|	      sum_row += square[i][j];
33|	   if (sum_row != sum) {
34|	      magic = false;
35|	      break;
36|	   }
37|	}
38|	
39|	//Calculate sum of each column
40|	if (magic) {
41|	   for (j=0; j<3; j++) {
42|	      sum_col = 0;
43|	      for (i=0; i<3; i++)
44|		 sum_col += square[i][j];
45|	      if (sum_col != sum) {
46|		 magic = false;
47|		 break;
48|	      }
49|	   }
50|	}
51|	
52|	//Calculate sum of first diagonal
53|	if (magic) {
54|	   for (i=0; i<3; i++)
55|	      for (j=0; j<3; j++)
56|	         if (i==j)
57|		    sum_diagonal += square[i][j];
58|	   if (sum_diagonal != sum) {
59|	      magic = false;
60|	   }
61|	}
62|
63|	//Calculate sum of second diagonal
64|	if (magic) {
65|	   sum_diagonal = 0;
66|	   for (i=0; i<3; i++)
67|	      for (j=0; j<3; j++)
68|		 if ((i+j) == 2)
		    sum_diagonal += square[i][j];
	   if (sum_diagonal != sum) {
	      magic = false;
	   }
	}
	
	//Display result
	if (magic)
	   System.out.println("It magic square!");
	else
	   System.out.println("ItOT a magic square.");
  } 
}
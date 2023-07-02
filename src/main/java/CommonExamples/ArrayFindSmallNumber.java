package CommonExamples;

public class ArrayFindSmallNumber {

    public static void main (String [] args){

        //Quiz: find the minimum number,
        // then locate that column and find the maximum number in that same column

        /*2  4  5
        3  2  10
        1  2  0*/
        //Maximum number from the array

        int abc[][]={{2,4,5},{3,2,10},{1,2,0}};
        int min=abc[0][0];
        int mincolumn = 0;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j] < min)//Min=2, therefore if Condition is 2 <2=no, continue loop, then if 4<2=no, etc
                {
                    min=abc[i][j];//Keeps the minimum number stored in min
                    mincolumn=j;//column number
                }
            }
        }

        System.out.println("Minimum number from the matrix: "+min); //Result = 0
//=1
        int max=abc[0][mincolumn];
        int k = 0;

        //In this case while loop is used because iteration will only happen once,
        // if it would be multiple times then for loop is best to use
        while(k<3)
        {
            if(abc[k][mincolumn]>max)
            {
                max=abc[k][mincolumn];
            }
                k++;
        }

        System.out.println("Maximum number from the column where minimum number is located: "+max);
    }

}



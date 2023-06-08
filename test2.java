package examenfinal;
 // He usado JUNIT4
import org.junit.Assert;
import org.junit.Test;

public class test2 {

    @Test
    public void testSumMatrices() {
        
        examenfinal matrixCalculator = new examenfinal();
        
       
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixC = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        
        int[][] expectedMatrixB = {
                {10, 10, 10},
                {10, 10, 10},
                {10, 10, 10}
        };

       
        int[][] actualMatrixB = matrixCalculator.sumMatrices(matrixA, matrixC);

        
        Assert.assertArrayEquals(expectedMatrixB, actualMatrixB);
    }

    
}



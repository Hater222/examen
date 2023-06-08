package examenfinal;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class examenfinal {
		public class MatrixCalculator {
		    
		    public int[][] sumMatrices(int[][] matrixA, int[][] matrixC) {
		        int rows = matrixA.length;
		        int cols = matrixA[0].length;
		        
		        int[][] result = new int[rows][cols];
		        
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                result[i][j] = matrixA[i][j] + matrixC[i][j];
		            }
		        }
		        
		        return result;
		    }
		}

	    public static void main(String[] args) {
	        
	        String matrixAFile = "matrixA.txt";
	        String matrixCFile = "matrixC.txt";
	        String matrixBFile = "matrixB.txt";
	        
	        try {
	            
	            int[][] matrixA = readMatrixFromFile(matrixAFile);
	            int[][] matrixC = readMatrixFromFile(matrixCFile);
	            
	            
	            if (matrixA.length != matrixC.length || matrixA[0].length != matrixC[0].length) {
	                throw new IllegalArgumentException("Las matrices A y C deben tener las mismas dimensiones.");
	            }
	            
	            
	            int[][] matrixB = sumMatrices(matrixA, matrixC);
	            
	            
	            writeMatrixToFile(matrixB, matrixBFile);
	            
	            System.out.println("Operación completada con éxito. La matriz B se ha calculado y guardado en " + matrixBFile);
	        } catch (IOException e) {
	            System.out.println("Error al leer o escribir en los archivos: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error en las dimensiones de las matrices: " + e.getMessage());
	        }
	    }
	    
	    
	    private static int[][] readMatrixFromFile(String filePath) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        
	        
	        String[] dimensions = reader.readLine().trim().split("\\s+");
	        int rows = Integer.parseInt(dimensions[0]);
	        int cols = Integer.parseInt(dimensions[1]);
	        
	        int[][] matrix = new int[rows][cols];
	        
	       
	        for (int i = 0; i < rows; i++) {
	            String[] values = reader.readLine().trim().split("\\s+");
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = Integer.parseInt(values[j]);
	            }
	        }
	        
	        reader.close();
	        
	        return matrix;
	    }
	    
	    
	    private static void writeMatrixToFile(int[][] matrix, String filePath) throws IOException {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
	        
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        
	        
	        writer.write(rows + " " + cols);
	        writer.newLine();
	        
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                writer.write(matrix[i][j] + " ");
	            }
	            writer.newLine();
	        }
	        
	        writer.close();
	    }
	    
	    
	    static int[][] sumMatrices(int[][] matrixA, int[][] matrixC) {
	        int rows = matrixA.length;
	        int cols = matrixA[0].length;
	        
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrixA[i][j] + matrixC[i][j];
	            }
	        }
	        
	        return result;
	    }
	}



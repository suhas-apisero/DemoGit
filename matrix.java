public class matrix {

	public static void main(String[] args) {
		int matrix1[][] = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		
		int matrix2[][] = {
				{33,74},
				{5,6},
				{17,18},
				{19,20}
				
			
		};
		
		int c[][] = new int[3][2];
		
		
		for(int i=0; i<3; i++){    
			
			for(int j=0;j<2;j++){    
			
				c[i][j]=0;      
			for(int k=0;k<4;k++)      
			{      
			c[i][j]+=matrix1[i][k]*matrix2[k][j];      
			}  
			System.out.print(c[i][j]+" ");  
			}
			System.out.println();
		}
		
	
	

	}

}

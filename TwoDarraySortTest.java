
public class TwoDarraySortTest {

	public static void main(String[] args) {
		int[][] a = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sort(a);
		
		//print the result of the sort
		for(int[] row : a) {
		    for(int value : row) {
		        System.out.printf("%4d", value);
		    }
		    System.out.println();
		}
	}

	
	public static void sort(int m[][]){
		int[] a;
		
		for(int i=0; i<m.length; i++){
			for(int j=i+1; j<m.length; j++){
				for(int col=0; col<m[0].length;){
					if(m[i][col]>m[j][col]){	//if the member is bigger than next member , change their row and break the loop. 
						a = m[i].clone();
						m[i] = m[j].clone();    
						m[j] = a.clone();   
						break;
					}
					else if(m[i][col]==m[j][col]) // if the member equal to next member , exceed to compare
						col++;
					else      //if the member is smaller than next member , break the loop
						break;
				}
			}
		}
	}
}

package java7program;

public class ArraySorting {

	public static void main(String[] args) {
	
		int a[] = {0,0,0,1,1,0,1};
		int temp = 0;
		
		for (int j=0; j<a.length;j++) {
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i]<a[i+1]) {
				temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		
		}
		}
		
		for(int i=0; i < a.length; i++){  
            System.out.print(a[i] + " ");  
    }  

	}

}

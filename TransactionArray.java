package Transaction;
import java.util.Scanner;

public class TransactionArray {
	public static void main(String [] args) {
		System.out.println("Enter the number of Transcation : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];
		System.out.println("Enter the values of array : ");
		for (int i = 0; i < size; i++) 
		{ 
			input[i] = sc.nextInt(); 
		}
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int target = sc.nextInt();
		int sum=0, j=0;
		for(int i=0;i<target;i++) 
		{
			System.out.println("Enter the value of target :");
			int value =sc.nextInt();
			for(j=0;j<size;j++)
			{
				sum=sum+input[j];
				if(sum>=value)
				{
					System.out.println("Target achieved after: " + (j+1) + " Transcation.");
					break;
				}
			}
			if((j+1)>size)
			{
				System.out.println("Given target is not achieved ");
			}
				sum=0;
		}

		sc.close();
	} 
}

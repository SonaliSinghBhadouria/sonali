import java.util.HashMap;
public class oddelementhash 
{
	static void FindOccurence (int n, int arr[])	{
		HashMap<Integer,Integer> Hsmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
		{
			if (Hsmap.containsKey(arr[i]))
			{
				Hsmap.put (arr[i], Hsmap.get(arr[i]) + 1);
			}
			else
			{
				Hsmap.put(arr[i], 1);
			}
		}
		for (int i = 0;i < n; i++)
		{
			if(Hsmap.get(arr[i]) % 2 != 0)
			{
				System.out.print (arr[i]);
				return;
			}
		}
		System.out.println ("THERE IS NO NUMBER OCCURRING ODD NUMBER OF TIMES");
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		int n = arr.length;
		FindOccurence(n, arr);
	}
}
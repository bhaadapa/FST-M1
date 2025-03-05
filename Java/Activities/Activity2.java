package activities;

public class Activity2 {

	public static void main(String[] args) 
	{
		Activity2 actobj = new Activity2();
		
		int[] inputArr = {10,77,10,54,-11,10};
		int searchNum = 10;
		int fixedSum = 30;
		
		System.out.println("Does the sum equal to 30:" +actobj.result(inputArr,searchNum,fixedSum));
		
	}
	
	public boolean result(int[] nums, int searchNum, int fixedSum)
	{
		int tempSum = 0;
		
		for(int num : nums)
		{
			if(num == searchNum)
			{
				tempSum += searchNum;
			}
			
			if(num > searchNum)
			{
		       break;
			}
		}
		
		return tempSum == fixedSum;
	}

}

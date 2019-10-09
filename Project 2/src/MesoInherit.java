
public class MesoInherit 
{

	private MesoStation station; 	
	private char[] stationChars = new char[4];
	private static int[] arr;
	private int ceil;
	
	public static void main(String[] args)
	{
		MesoInherit mi = new MesoInherit(new MesoStation("OKCE"));
		for(int i = 0; i < 3; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public MesoInherit(MesoStation mesoStation) 
	{
		// TODO Auto-generated constructor stub
		station = mesoStation;
		calAverage();
	}

	public int[] calAverage() 
	{
		int[] numArray = new int[3];
		int sum = 0;
		double avg = 0;
		int average = 0;
		final int ID_LENGTH = 4;
		
		for(int i = 0; i < ID_LENGTH; i++)
		{
			stationChars[i] = station.getStID().charAt(i);
			sum += stationChars[i];
		}
		avg = sum / 4.0;
		int floor = (int) Math.floor(avg);
		ceil = (int) Math.ceil(avg);
		
		if((avg - floor) > 0)
		{
			average = ceil;
		}
		else
		{
			average = floor;
		}
		numArray[0] = ceil;
		numArray[1] = floor;
		numArray[2] = average;
		arr = numArray;
		return numArray;
	}

	public char letterAverage() 
	{
		// TODO Auto-generated method stub
		char toChar = (char)ceil;
		return toChar;
	}

}

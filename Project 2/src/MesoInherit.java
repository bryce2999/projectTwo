
public class MesoInherit 
{

	private MesoStation station; 	
	private char[] stationChars = new char[4];

	
	public MesoInherit(MesoStation mesoStation) 
	{
		// TODO Auto-generated constructor stub
		station = mesoStation;
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
		int ceil = (int) Math.ceil(avg);
		
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
		return numArray;
	}

	public String letterAverage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}

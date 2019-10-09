import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg
{
	private PosAvg pa;
	private String startWith;
	private int count = 0;
	private ArrayList<MesoStation> stations; 
	
	public static void main(String[] args) throws IOException
	{
		PosAvg pa = new PosAvg("PAWN");
		System.out.println(pa.toString());
	}
	
	public LetterAvg(char c) 
	{
		// TODO Auto-generated constructor stub
		try
		{
			pa = new PosAvg("ACME");
		}
		catch (Exception e)
		{
			System.out.println("yikes... couldn't get a PosAvg");
		}
		
		startWith = c+"";
	}

	public int numberOfStationWithLetterAvg() 
	{
		stations = pa.getStationList();
		
		for(int i = 0; i < stations.size(); i++)
		{
			if((stations.get(i)).toString().charAt(0) == (startWith).charAt(0))
			{
				count++;
			}
		}
		return count;
	}
	
	@Override 
	public String toString()
	{
		String output = "\nThey are:\n";
		for(int i = 0; i < stations.size(); i++)
		{
			if((stations.get(i)).toString().charAt(0) == (startWith).charAt(0))
			{
				output += ""+stations.get(i)+"\n";
			}
		}
		return output;
		
	}

}

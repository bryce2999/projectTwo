import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg 
{

	private ArrayList<MesoStation> stations = new ArrayList<MesoStation>();
	private final String FILENAME = "Mesonet.txt";
	private final int ID_LENGTH = 4;
	private int index;
	private String ID = null; 
	
	public static void main(String[] args) throws IOException
	{
		PosAvg ps = new PosAvg("OKCE");
		System.out.println(ps.toString());
	}
	
	
	public PosAvg(String stID) throws IOException 
	{
		Read(FILENAME);
		ID = stID;
		index = indexOfStation();
	}

	@Override 
	public String toString()
	{
		String output = "";
		output += "This index is average of ";
		for(int i = 1; i < 3; i++)
		{
			if(index != 0)
			output += stations.get(index-i).toString() +" and " + stations.get(index+i).toString() + ", ";
		}
		output += "and so on.";
		return output;	
	}
	public int indexOfStation() 
	{
		index = 0;
		for(int i = 0; i < stations.size(); i++)
		{
			if(stations.get(i).getStID().equals(ID))
			{
				index = i;
			}
		}
		return index;
	}

	
	 private void Read(String filename) throws IOException
	   {
		    String string = "";
		    String ID = null; 
		    MesoStation station;
		    
	    	BufferedReader br = new BufferedReader(new FileReader(FILENAME));
	    	for(int i = 0; i < 2; i++)
	 	    {
	 	    	br.readLine();
	 	    }
	    	
			while((string = br.readLine()) != null)
			{
				for(int i = 1; i < 1 + ID_LENGTH; i++)
				{
					ID += string.charAt(i);
				}
				station = new MesoStation(ID);
			    stations.add(station);
			    ID = "";
			} 
			br.close();
	   }
	 
	 public ArrayList<MesoStation> getStationList()
	 {
		 return stations;
	 }
}

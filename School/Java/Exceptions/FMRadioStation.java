package module3;

public class FMRadioStation {
	
	String callS;
	float htz;
	
	public FMRadioStation(String callSign, float frequency) {
		
		callS = callSign;
		htz = frequency;
		
		try {
			checkStation();
		}
		catch (FMRadioStationException e) {
			System.out.println(e.getMessage());
		}

	}

	public void checkStation() throws FMRadioStationException {
		throw new FMRadioStationException(callS,htz);
	}
	
	public String toString() {
		String results;
		
		results = "Station: " + callS + " is brodcating on htz: " + htz + "\n";
		
		return results;
	}
}

package module3;

public class FMRadioStationException extends Exception {
	
	public FMRadioStationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FMRadioStationException(String callSign, float frequency ) throws FMRadioStationException{
		if (callSign.length() > 3) {
			throw new FMRadioStationException("Call sign to long");
		} else if (callSign.charAt(0) == 'A' || callSign.charAt(0) == 'K' || callSign.charAt(0) == 'N' || callSign.charAt(0) == 'W') {
			throw new FMRadioStationException("A call sign can't start with that");
		} else if ((frequency < 88.0) || (frequency > 108.0) ) {
			throw new FMRadioStationException("Invalid frequncy");
		}else {
			throw new FMRadioStationException("That is a vaild Station");
		}
	}
	
}

package module3;

import java.util.Arrays;

public class CreateStation {

	public static void main(String[] args) {
		FMRadioStation[] allStation;
		allStation = new FMRadioStation[8];
		allStation[0] = new FMRadioStation("ABC",20);
		allStation[1] = new FMRadioStation("TTY",88);
		allStation[2] = new FMRadioStation("LPD",108);
		allStation[3] = new FMRadioStation("EBT",100);
		allStation[4] = new FMRadioStation("WNB",20);
		allStation[5] = new FMRadioStation("CNN",20);
		allStation[6] = new FMRadioStation("LPDQ",20);
		allStation[7] = new FMRadioStation("PNY",20);
		
		System.out.println("\n" + Arrays.toString(allStation));
	}

}

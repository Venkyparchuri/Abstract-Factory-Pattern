
public class PlateColorFactory extends PlateFactory {

	@Override
	Plate getPlateType(String plateType) {
		 
		return null;
	}

	@Override
	PlateColor getPlateColor(String plateColor) {
		
		if(plateColor.equals("Red")) {
			return new RedColorPlates();
		}else if(plateColor.equals("Green")) {
			return new GreenColorPlate();
		}else {
			System.out.println("Plate color Not Found ");
		}
		 
		return null;
	}

}

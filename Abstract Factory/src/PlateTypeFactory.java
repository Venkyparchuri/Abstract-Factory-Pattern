
public class PlateTypeFactory extends PlateFactory {
	
	 

	@Override
	Plate getPlateType(String plateType) {
		
		if(plateType.equals("Paper")) {
			return new PaperPlate();
		}else if(plateType.equals("plastic")) {
			return new PlasticPlate();
		}else if(plateType.equals("Ceramic")) {
			return new CeramicPlate();
		}else {
			System.out.println("Plate type Not Found ");
		}
		 
		return null;
	}

	@Override
	PlateColor getPlateColor(String plateColor) {
		 
		return null;
	}

}

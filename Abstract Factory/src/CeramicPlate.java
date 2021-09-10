
public class CeramicPlate implements Plate {
	
	 
	 
	 CeramicPlate(){
		 
		 getPlate();
	 }

	@Override
	public String getPlate() {
		System.out.println("Ceramic plates");
		return "Ceramic";
	}

}

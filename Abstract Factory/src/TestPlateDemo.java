
public class TestPlateDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Required red color paper plates ");
		
		PlateFactory paperPlate = new PlateTypeFactory();
		
		
		
		paperPlate.getPlateType("Paper");
		
		PlateFactory plateColor = new PlateColorFactory();
		
		plateColor.getPlateColor("Red");
		
	}
	
 
}

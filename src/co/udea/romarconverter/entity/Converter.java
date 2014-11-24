package co.udea.romarconverter.entity;

public class Converter {

	
	public Converter(){
		
	}
	
	public String toRoman(int value){
		
				
		return convertModule(value,"I","V","X");
		
	}
	
	
	public String convertModule(int value, String baseMono, String basePenta, String baseDeca){
		switch (value) {
		case 1:
			return baseMono;
		case 2:
			return baseMono+baseMono;
		case 3:
			return baseMono+baseMono+baseMono;
		case 4:
			return baseMono+basePenta;
		case 5:
			return basePenta;
		case 6:
			return basePenta+baseMono;
		case 7:
			return basePenta+baseMono+baseMono;
		case 8:
			return baseMono+baseMono+baseMono+baseMono;
		case 9:
			return baseMono+baseDeca;
		default:
			return null;
		}

	}
	
	
}

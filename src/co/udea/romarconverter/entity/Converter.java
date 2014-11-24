package co.udea.romarconverter.entity;

public class Converter {

	String[][] bases = {{"I","V","X"},
						{"X","L","C"},
						{"C","D","M"}};
	
	public Converter(){
		super();
	}
	
	public String toRoman(int value){
		
		
		if(isInRange(value)){
		String result = "";
		int exponent = valueSize(value);
		do{ 
			exponent--;
			int alfa =(int) (value/Math.pow(10,exponent));
			value = (int) (value%Math.pow(10,exponent));
			result +=	 convertModule(alfa,bases[exponent][0],bases[exponent][1],bases[exponent][2]);
			
		}while(value!= 0);
		
		return result;
		}else{
			return null;
		}
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
	
	public int valueSize(int value){
		return String.valueOf(value).length();
	}
	
	
	public boolean isInRange(int value){
		if(0<value&&value<4000){
			return true;
		}else{
			return false;
		}
	}
}

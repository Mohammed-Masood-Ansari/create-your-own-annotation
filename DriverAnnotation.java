package core_java.factoryDesign.annotations;

public class DriverAnnotation {

	@DataTypeValue("hello")
	private String str;

	
	public DriverAnnotation() throws NoSuchFieldException, SecurityException {
		DataTypeValue ad = 
			getClass()
			.getDeclaredField("str").getAnnotation(DataTypeValue.class);
			
		if(ad!=null) {
			this.str=ad.value();
		}
	}



	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		DriverAnnotation a = new DriverAnnotation();
		System.out.println(a.str);
	}
}

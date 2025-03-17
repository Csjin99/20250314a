package j.interface1.ex1;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] phArr = new Phone[2];
		
		phArr[0] = new GalaxyNote9();
		phArr[1] = new V40();
			
		for(int i = 0; i<phArr.length; i++) {
//			if(phArr[i] instanceof GalaxyNote9) {
//				((GalaxyNote9)phArr[i]).printInformation();
//			}
			if(phArr[i] instanceof SmartPhone) {
				result[i] = ((SmartPhone)phArr[i]).printInformation();
			
			}
		}
		return result;
	}

}

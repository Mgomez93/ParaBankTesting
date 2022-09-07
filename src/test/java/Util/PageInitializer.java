
package Util;

import Pages.homePage;
import Pages.registration;

public class PageInitializer extends BaseClass {
	
	public static homePage hp;
	public static registration rp;
	
	
	public static void Initialize() {
		
		hp = new homePage();
		rp = new registration();
		
		
		
	}


}
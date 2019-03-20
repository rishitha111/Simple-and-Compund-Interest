package HouseConstructionCost;
/** 
 * @author Rishitha
 */
public class HouseConstructionCost {
	/** 
	 * @param SQfeet indicates square feet
	 * @param materials indicates type of material
	 */

	public int Construction(int SQfeet,String materials) {
		if(materials.equals("standard")) {
			return SQfeet * 1200;
		}
		if(materials.equals("abovestandard")) {
			return SQfeet * 1500;
		}
		if(materials.equals("highstandard")){
			return SQfeet * 1800;
		}
		return SQfeet * 2500;
	}
}

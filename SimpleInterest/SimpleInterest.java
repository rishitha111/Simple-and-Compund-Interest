package SimpleInterest;
/*
 * @author : Rishitha
 * */
public class SimpleInterest {
	/*
	 * @param p indicates principle amount
	 * @param t indicates time
	 * @param r indicates rate of interest
	 * p,t,r are used to calculate simple interest
	 * */

	public float Simpleinterest(float p,float t,float r) {
		return (p*t*r)/100;
	}
	/*
	 * @param p indicates principle amount
	 * @param t indicates time
	 * @param r indicates rate of interest
	 * @param n indicates no of months
	 * p,t,r,n are used to calculate compound interest
	 * */

	public float pow(float value,float power) {
		for(int i = 1;i <= power;i++) {
			value *= i;
		}
		return value;
	}
	public float Compoundinterest(float p,float t,float r,float n) {
		float value = 1+r/t;
		return p * (pow(value,n*t));
	}
}

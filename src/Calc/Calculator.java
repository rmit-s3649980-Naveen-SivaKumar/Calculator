package Calc;

public class Calculator {

	/**
	 * @param args
	 */
	public double Sum(double num[]) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0; i<num.length;i++){
			sum=sum+num[i];
		}
		return sum;
	}
	public double Sub(double num[]){
		double sub= num[0];
		for(int i=1; i<num.length;i++){
			sub-=num[i];
		}
		return sub;
	}
	public double Multiply(double num[]){
		double mult= 1;
		for(int i=0; i<num.length;i++){
			mult*=num[i];
		}
		return mult;
	}
	public double Divide(double num[]){
		double div= num[0];
		for(int i=1; i<num.length;i++){
			div/=num[i];
		}
		return div;
	}
	public double Exponential(double num[]){
		double expo=num[0];
		for(int i=1; i<num.length;i++){
			expo=Math.pow(expo, num[i]);
		}
		return expo;
	}
}

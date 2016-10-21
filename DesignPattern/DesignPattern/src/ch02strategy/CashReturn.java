package ch02strategy;

public class CashReturn extends CashSuper {
	
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition,String moneyReturn){
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}

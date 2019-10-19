package DesignPattern;

public class India implements Currency{

	@Override
	public String getCurrency() {
		return "Rupee";
	}

	@Override
	public String getSymble() {
		return "Rs";
	}

}

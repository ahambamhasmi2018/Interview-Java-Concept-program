package DesignPattern;

public class USA implements Currency {

	@Override
	public String getCurrency() {
		return "Doller";
	}

	@Override
	public String getSymble() {
		return "$";
	}

}

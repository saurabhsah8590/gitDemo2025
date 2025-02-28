package TestPackage;

import JavaDemo.CentralTraffic;
import JavaDemo.ContinentTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		AustralianTraffic at = new AustralianTraffic();
		at.traffic();
		ContinentTraffic ct = new AustralianTraffic();
		ct.trainSign();

	}
	public void traffic()
	{
		System.out.println("Wait at traffic.");
	}

	@Override
	public void greenGo() {
		System.out.println("Green go implemented.");
	}

	@Override
	public void redStop() {
		System.out.println("Red stop implemented.");
	}

	@Override
	public void trainSign() {
		System.out.println("Stop at train sign implemented.");
		
	}

}

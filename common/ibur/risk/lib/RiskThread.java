package ibur.risk.lib;

import ibur.risk.Risk;

public abstract class RiskThread extends Thread implements Haltable {
	
	public RiskThread(){
		super();
		Risk.addThread(this);
	}
	
	public RiskThread(String s){
		super(s);
		Risk.addThread(this);
	}
}

package carlab3;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class CommunicationCenter implements SelfCheckCapable {
	private String communicationMethod;
	private CarServer mycarserver;
	
	public CommunicationCenter() {
		communicationMethod = "WIFI";
		mycarserver = new CarServer();
	}
	
	
	
	public boolean recieveCommunication() {
		return true; //true= receiving communications
	}
	public boolean sendCommunication() {
		return true; //true= sending communication
	}
	public boolean connects() {
		return true; //true= connection successful
	}
	public boolean updateCheck() {
		return true; //true= updates needed
	}
	public int selfCheck1() {
		return 1; // 1=OK
	}
	public boolean SendResults() {
		return true; //true= results sent successfully
	}
	public boolean install() {
		return true; //true= install complete
	}
	public static void main(String[] args) {
		 CommunicationCenter mycommunicationcenter = new CommunicationCenter();
		 mycommunicationcenter.runSelfCheck();
			
		
	}



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "WIFI";
	}



	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}



	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, mycarserver);
	}
	
	
}


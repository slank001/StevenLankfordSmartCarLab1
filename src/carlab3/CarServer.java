/**
 * 
 */
package carlab3;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author STEEB
 *
 */
public class CarServer implements SelfCheckCapable {
	private SoftwareRepository mysoftwarerepository;
	
	public CarServer() {
		mysoftwarerepository = new SoftwareRepository();
	}
	
	public boolean command() {
		return true; //true= command recieved
	}
	public boolean connects() {
		return true; //true= connection successful
	}
	public boolean updateCheck() {
		return true; //true= updates needed
	}
	public int requestsDownload() {
		return 1; // 1=request sent
	}
	public boolean reset() {
		return true; //true= reset command sent
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UpdateCheck";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, mysoftwarerepository);
	}

}

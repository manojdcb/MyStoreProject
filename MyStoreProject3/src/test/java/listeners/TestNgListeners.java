package listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener{
	
	@Override  
	public void onTestStart(ITestResult result) {  
	System.out.println("New test started:" +result.getName());	
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	System.out.println("Test successfully finished : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	System.out.println("Test Failed :" +result.getName());  
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	System.out.println("Test skipped :" +result.getName());  
	}  
	    
	}

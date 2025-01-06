package Resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.BasePage;

public class Listeners extends BasePage implements ITestListener{
	public Listeners() throws IOException{
		super();
	}

//	 @Override
//	public void onFinish(ITestContext context) {
//    	 try {
//    		 TakeSnapShot(context.getName());
// 	    }catch (Exception e) {
// 	    	e.printStackTrace();
//      }
//  }
	 
	  public  void onTestSuccess(ITestResult result) {
		  try {
	    		 TakeSnapShot(result.getName());
	 	    }catch (Exception e) {
	 	    	e.printStackTrace();
	      }
		  }

}

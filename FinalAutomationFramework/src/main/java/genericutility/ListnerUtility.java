package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListnerUtility extends BaseClass implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		test=extReport.createTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+"is failed");
		TakesScreenshot ts=(TakesScreenshot) sdriver;
		//To add screenshot in extent report
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		//To add screenshot in screenshot folder
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+result.getName()+jUtil.getSystemTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

package electronics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListnerUtility;
import objectrepository.HomePage;

@Listeners(ListnerUtility.class)
public class TC_DWS_007_Test extends BaseClass{
	@Test
	public void clickOnElectronics() throws EncryptedDocumentException, IOException {
		//test=extReport.createTest("clickOnElectronics");
		hp=new HomePage(driver);
		hp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 3, 0),"electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}

}

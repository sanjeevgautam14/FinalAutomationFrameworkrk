package computers;

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
public class TC_DWS_006_Test extends BaseClass{
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException {
		test=extReport.createTest("clickOnComputers");
		hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 2, 0),"Computer page is not displayed");
		test.log(Status.PASS, "Computer page is displayed");
	}

}

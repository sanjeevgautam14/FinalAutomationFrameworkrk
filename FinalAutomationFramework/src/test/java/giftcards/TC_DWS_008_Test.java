package giftcards;

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
public class TC_DWS_008_Test extends BaseClass{
	@Test
	public void clickOnGiftcards() throws EncryptedDocumentException, IOException {
		//test=extReport.createTest("clickOnGiftcards");
		hp=new HomePage(driver);
		hp.getGiftCardsLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 4, 0),"giftcards page is not displayed");
		test.log(Status.PASS, "Giftcards page is displayed");
	}

}

package com.qa.BigC;


	
	
	

	import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.qa.utility.ExcelUtility;

	public class BigCTestscript  extends  BigCTestBase {

		@Test(priority=1)
		public void login() throws Exception
		{
			BPages.getLogin().click();
			Thread.sleep(2000);
			BPages.getEmail().sendKeys("swathikiranmai58@gmail.com");
			Thread.sleep(2000);
			BPages.getPassword().sendKeys("swathi@65");
			Thread.sleep(2000);
			BPages.getSignin().click();
			Thread.sleep(2000);
			
			
			
				
			}
			
			
		
		@Test(dataProvider = "getData",priority=2)
		public void SearchItem(String Input) throws InterruptedException {
			
		
			BPages.getSearchBox().clear();
			Thread.sleep(2000);
			BPages.getSearchBox().sendKeys(Input);
			Thread.sleep(2000);
			BPages.getSearchBox().submit();
			
			Thread.sleep(2000);
			
			
			
			List<WebElement> AllOptions =BPages.getAllOptions();
			Thread.sleep(2000);
			for (WebElement Options : AllOptions) {
				Reporter.log(Options.getText(), true);
				Thread.sleep(2000);
				
				/*BPages.getdrop().submit();
				Thread.sleep(2000);*/
				
			}
		
		
			
		}

		@DataProvider
		public String[][] getData() throws IOException {
			String xlPath ="C:\\Users\\swathi\\eclipse-workspace\\AutomationTesting\\src\\test\\java\\com\\qa\\bigCbigC//ExcelUtulity.xlsx";
			String xlSheet = "Sheet1";

			int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
			int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
			String[][] data = new String[rowCount][cellCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < cellCount; j++)

				{
					data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
				}
			}
			return data;
		}

	}



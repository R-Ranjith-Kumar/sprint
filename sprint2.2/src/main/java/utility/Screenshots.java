package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshots extends ReportGenerator {

	static int i = 1;

	public void takeScreenshot(WebDriver driver) throws IOException {
		File srcFile;
		srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("C:\\Ranjith training\\Selenium demo\\sprint2.2\\screenshots\\img" + i + ".jpeg"));
		i++;
	}

}

package proofs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    public static String takeScreenshot(
            WebDriver driver,
            String testName) {

        TakesScreenshot screenshot =
                (TakesScreenshot) driver;

        File source =
                screenshot.getScreenshotAs(
                        OutputType.FILE
                );

        String destination =
                System.getProperty("user.dir")
                + "/screenshots/"
                + testName
                + ".png";

        File target =
                new File(destination);

        try {

            FileUtils.copyFile(source, target);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return destination;
    }
}
package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;
import proofs.Screenshot;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName();

        try {

            if (BaseTest.driver != null) {

                Screenshot.takeScreenshot(
                        BaseTest.driver,
                        testName
                );

                System.out.println(
                        "Screenshot captured for failed test: "
                        + testName
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "Unable to capture screenshot for: "
                    + testName
            );
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(
                "Test Passed: "
                + result.getName()
        );
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(
                "Test Skipped: "
                + result.getName()
        );
    }
}
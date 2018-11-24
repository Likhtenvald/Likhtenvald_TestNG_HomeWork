package org.raiffeisen.ruallai.learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.ITestContext;


public class LoginTest
{

    @Test(groups = "loginTest")
    public void loginTest(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                            " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }

    @Test(priority = 1, dependsOnMethods = "loginTest", groups = "loginTest")
    public void profileTest(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = "pageTests", dependsOnMethods = "loginTest")
    public void pageTestCase01(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                            " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                            " | Thread: " + id);

        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = "pageTests", dependsOnMethods = "loginTest")
    public void pageTestCase02(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                " | Thread: " + id);

        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = "pageTests", dependsOnMethods = "loginTest")
    public void pageTestCase03(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                " | Thread: " + id);

        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = "loginTest", groups = "loginTest")
    public void logoffTest(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                " | Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }
}

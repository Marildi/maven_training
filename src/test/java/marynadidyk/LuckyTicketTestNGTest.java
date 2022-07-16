package marynadidyk;

import org.testng.Assert;
import org.testng.annotations.*;

public class LuckyTicketTestNGTest {

    //Positive scenarios
    @DataProvider(name = "numbersForPositiveScenario")
    public static Object[][] getNumbersForPositiveScenario() {
        return new Object[][]{
                {true, 0, 2, 3, 0, 2, 3},
                {true, 1, 9, 1, 9, 1, 1}
        };
    }

    @Test(dataProvider = "numbersForPositiveScenario")
    public void verifyPositiveCase(boolean expectedResult, int[] arrayOfNumbers) {
        boolean actualResult = LuckyTicket.isTicketLucky(arrayOfNumbers);
        Assert.assertEquals(expectedResult, actualResult, "Method isTicketLucky works incorrectly for positive scenario.");
    }

    //Negative scenarios
    @DataProvider(name = "numbersForNegativeScenarioBV")
    public static Object[][] getNumbersForNegativeScenarioBV() {
        return new Object[][]{
                {false, 10, 2, 1, 2, 1, 10},
                {false, -1, 1, 1, 1, 1, -1},
        };
    }

    @DataProvider(name = "numbersForNotEqualSums")
    public static Object[][] getNumbersForNotEqualSums() {
        return new Object[][]{
                {false, 2, 3, 4, 5, 6, 7}
        };
    }

    @Test(dataProvider = "numbersForNotEqualSums")
    public void verifyNegativeCaseWithNotEqualSums(boolean expectedResult, int[] arrayOfNumbers) {
        boolean actualResult = LuckyTicket.isTicketLucky(arrayOfNumbers);
        Assert.assertEquals(expectedResult, actualResult, "Method isTicketLucky counts sums incorrectly");
    }

    @Test(dataProvider = "numbersForNegativeScenarioBV", expectedExceptions = IllegalArgumentException.class)
    public void verifyNegativeCases(boolean expectedResult, int[] arrayOfNumbers) {
        boolean actualResult = LuckyTicket.isTicketLucky(arrayOfNumbers);
        Assert.assertEquals(expectedResult, actualResult, "Method isTicketLucky works incorrectly for negative scenario");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before all tests …");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After all tests …");
    }

    @BeforeMethod
    public void beforeEachTest(){
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void afterEachTest(){
        System.out.println("This is text after each test");
    }
}


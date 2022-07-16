package marynadidyk;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LuckyTicketJUnitTest {
    //Positive scenarios
    int[] arrayForPositiveScenario = {0, 2, 3, 0, 2, 3};
    int[] secondArrayForPositiveScenario = {1, 9, 1, 9, 1, 1};

    //Negative scenarios
    int[] arrayWithBVLowerThanZero = {-1, 1, 1, 1, 1, -1};
    int[] arrayWithBVGreaterThanNine = {10, 2, 1, 2, 1, 10};
    int[] arrayWithNotEqualSums = {2, 3, 4, 5, 6, 7};

    @Test
    void verifyPositiveScenario(){
        assertTrue(LuckyTicket.isTicketLucky(arrayForPositiveScenario));
        assertTrue(LuckyTicket.isTicketLucky(secondArrayForPositiveScenario));
    }

    @Test
    void verifyNegativeScenarioWithBV(){
        assertThrows(IllegalArgumentException.class, () -> LuckyTicket.isTicketLucky(arrayWithBVLowerThanZero));
        assertThrows(IllegalArgumentException.class, () -> LuckyTicket.isTicketLucky(arrayWithBVGreaterThanNine));
    }

    @Test
    void verifyNegativeScenarioWithNotEqualSums(){
        assertFalse(LuckyTicket.isTicketLucky(arrayWithNotEqualSums));
    }

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Before all tests …");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("After all tests …");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("This is text before each test");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("This is text after each test");
    }
}
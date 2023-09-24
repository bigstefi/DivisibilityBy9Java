import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityCheckerTests {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isDivisibleBy9() {
        DivisibilityChecker divisibilityChecker = new DivisibilityChecker();
        Boolean isDivisibleBy9 = divisibilityChecker.IsDivisibleBy9("0");
        Assertions.assertTrue(isDivisibleBy9);
    }
}
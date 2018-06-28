package hometask_22_06;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CheckBalanceOfStringTest {

    private List<String> cases;

    @Before
    public void setUp() {
        cases = new ArrayList<>();

        cases.add("()");//correct
        cases.add("[{}]");
        cases.add("[({})]");

        cases.add("{)");//incorrect
        cases.add("[({}])");
        cases.add("[({])");
        cases.add("[");
        cases.add("");
        cases.add("({}");
    }

    @Test
    public void checkString() {
        assertTrue(CheckBalanceOfString.checkString(cases.get(0)));
        assertTrue(CheckBalanceOfString.checkString(cases.get(1)));
        assertTrue(CheckBalanceOfString.checkString(cases.get(2)));

        assertFalse(CheckBalanceOfString.checkString(cases.get(3)));
        assertFalse(CheckBalanceOfString.checkString(cases.get(4)));
        assertFalse(CheckBalanceOfString.checkString(cases.get(5)));
        assertFalse(CheckBalanceOfString.checkString(cases.get(6)));
        assertFalse(CheckBalanceOfString.checkString(cases.get(7)));
        assertFalse(CheckBalanceOfString.checkString(cases.get(8)));
    }
}
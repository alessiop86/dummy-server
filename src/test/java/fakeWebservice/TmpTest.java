package fakeWebservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TmpTest {

	@Test
	public void test() {
		assertEquals("cdf", format("Johnson       'S   "));
	}
	
	
    public static String format(String suggestion) {
        final StringBuilder result = new StringBuilder(suggestion.length());
        String[] words = suggestion.trim().toLowerCase().split("\\s+");
        for (int i = 0, l = words.length; i < l; ++i) {
            if (i > 0) {
                result.append(" ");
            }
            if (!words[i].isEmpty()) {
                result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
            }
        }
        return result.toString();
    }
}

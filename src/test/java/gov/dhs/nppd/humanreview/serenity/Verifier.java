package gov.dhs.nppd.humanreview.serenity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import net.thucydides.core.annotations.Step;

public class Verifier {

	@Step
	public void checks_if_equals(String actualValue, String expectedValue) {
		assertThat(actualValue, equalTo(expectedValue));
	}

}

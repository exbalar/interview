

package com.hcl.interviews;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.hcl.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.
 * You will notice the TimeConverter has no implementation ... (hint)
 */
public class Original {

    private int inp;

    @Test
    public void decimalDigitAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("decimal-digit.story")
                .run();
    }

    @When("the input is $inp")
    public void whenTheInputIs(int inp) {
        this.inp = inp;
    }

    @Then("the output should look like $")
    public void thenOutputShouldLookLike(List<Integer> theExpectedOutput) {
        DecimalDigit test = new DecimalDigitImpl();
        int[] output = test.getDecimalDigit(this.inp);
        int[] theExpectedOutputArray = theExpectedOutput.stream().mapToInt(i->i).toArray();
        boolean result = Arrays.equals(theExpectedOutputArray, output);
        Assert.assertEquals(result,true);
    }
}

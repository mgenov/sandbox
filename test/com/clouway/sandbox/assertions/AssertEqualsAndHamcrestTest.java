package com.clouway.sandbox.assertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class AssertEqualsAndHamcrestTest {

  @Test
  public void useAssertEqualsForAssertion() {
    // assert integer values
    assertEquals(1, 1);

    // AssertEquals accepts Object,Object, so developers
    // are able to make mistakes by trying to compare different types
    assertEquals(1,1);

    assertEquals("aaa", "aaa");
  }

  @Test
  public void useHamcrestForAssertion() {
    assertThat(1, is(equalTo(1)));

    // Hamcrest is typesafe and compiler gives compilation error
    // when tries to compile this test and no error will occur at runtime
    assertThat("a", is(equalTo("a")));

    assertThat("bbb", is(equalTo("bbb")));
  }
}

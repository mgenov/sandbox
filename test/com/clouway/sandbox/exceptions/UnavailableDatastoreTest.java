package com.clouway.sandbox.exceptions;

import org.junit.Test;

import static org.junit.Assert.fail;


/**
 * A Sample which shows 2 ways of testing exception.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class UnavailableDatastoreTest {

  @Test
  public void useTryCatch() {
    try {
      new UnavailableDatastore().keys();

      fail("expected " + IllegalStateException.class);
    } catch (IllegalStateException e) {
      // message could be asserted, but it's not at 100% required
    }
  }

  @Test(expected = IllegalStateException.class)
  public void useExpectedAnnotation() {
    new UnavailableDatastore().keys();
  }
}

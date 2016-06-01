package com.clouway.sandbox.game;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

/**
 * PlayGameTest is a test which verifies that Player is able to play with the Ball.
 * <p/>
 * This test defines a contract between Player and the Ball.
 * <p/>
 * The ball behaviour is specified in the contract test named {@link TakeAndReleaseBallTest}
 * and it verifies that Player is able to play with any ball that has this behaviour.
 * <p/>
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class PlayGameTest {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Mock
  private Ball ball;

  @Test
  public void happyPath() {
    context.checking(new Expectations() {{
      oneOf(ball).isTaken();
      will(returnValue(false));

      oneOf(ball).take();

      oneOf(ball).release();
    }});

    new Player().play(ball);
  }

  @Test(expected = IllegalStateException.class)
  public void ballIsTakenBySomeoneElse() {
    context.checking(new Expectations() {{
      oneOf(ball).isTaken();
      will(returnValue(true));
    }});

    new Player().play(ball);
  }
}

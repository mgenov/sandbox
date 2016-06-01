package com.clouway.sandbox.game;

/**
 * AlwaysTakenBallTest will always fail, cause this ball is Always taken and {@link Player} is not able to play with it.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class AlwaysTakenBallTest extends TakeAndReleaseBallTest {
  @Override
  protected Ball makeBall() {
    return new AlwaysTakenBall();
  }
}

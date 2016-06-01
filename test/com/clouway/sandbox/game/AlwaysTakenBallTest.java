package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class AlwaysTakenBallTest extends TakeAndReleaseBallTest {
  @Override
  protected Ball makeBall() {
    return new AlwaysTakenBall();
  }
}

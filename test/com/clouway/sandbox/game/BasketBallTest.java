package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class BasketBallTest extends TakeAndReleaseBallTest {
  @Override
  protected Ball makeBall() {
    return new BasketBall();
  }
}

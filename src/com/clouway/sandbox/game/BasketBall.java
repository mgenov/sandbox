package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class BasketBall implements Ball {

  private boolean taken = false;

  @Override
  public boolean isTaken() {
    return taken;
  }

  @Override
  public void take() {
    taken = true;
  }

  @Override
  public void release() {
    taken = false;
  }
}

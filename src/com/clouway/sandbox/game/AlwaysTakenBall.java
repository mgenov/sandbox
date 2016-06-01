package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class AlwaysTakenBall implements Ball {

  @Override
  public boolean isTaken() {
    return true;
  }

  @Override
  public void take() {

  }

  @Override
  public void release() {

  }
}

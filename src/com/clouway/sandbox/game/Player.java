package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class Player {
  public void play(Ball ball) {

    if (ball.isTaken()) {
      throw new IllegalStateException("Player cannot play with taken ball.");
    }

    ball.take();

    ball.release();
  }
}

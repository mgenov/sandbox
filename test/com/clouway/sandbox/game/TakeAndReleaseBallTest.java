package com.clouway.sandbox.game;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * TakeAndReleaseBallTest is a contract test which verifies the Ball has the expected behaviour
 * and the {@link Player} is able to play with it.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public abstract class TakeAndReleaseBallTest {

  @Test
  public void ballIsNotTakenByDefault() {
    assertThat(makeBall().isTaken(), is(false));
  }

  @Test
  public void ballIsTaken() {
    Ball ball = makeBall();
    ball.take();
    assertThat(ball.isTaken(), is(true));
  }

  @Test
  public void relaseTakenBall() {
    Ball basketBall = makeBall();
    basketBall.take();

    basketBall.release();
    assertThat(basketBall.isTaken(), is(false));
  }

  protected abstract Ball makeBall();
}

package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public interface Ball {

  boolean isTaken();

  void take();

  void release();
}

package com.clouway.sandbox.game;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class GameBootstrap {

  public static void main(String[] args) {
    Player john = new Player();
    john.play(new BasketBall());

    // Uncomment this code to see the behaviour when john is trying to play with taken ball.
//    try {
//      john.play(new AlwaysTakenBall());
//    } catch (IllegalStateException e) {
//      System.out.println("John is not able to play with taken ball.");
//    }

    System.out.println("John made a good game and can rest now.");
  }
}

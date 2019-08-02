package com.onkiup.lila.syntax.literal;

public class IntegerLiteral implements LilaLiteral<Integer> {
  private Integer number;

  @Override
  public String name() {
    return "integer";
  }

  @Override
  public Integer value() {
    return number;
  }
}


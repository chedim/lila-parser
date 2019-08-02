package com.onkiup.lila.syntax.literal;

import com.onkiup.linker.parser.CapturePattern;

public class StringLiteral implements LilaLiteral<String> {

  private static final String OPEN_QUOTE = "\"";

  @CapturePattern(until = "([^\\\\])\"", replacement = "$1")
  private String value;

  private static final String CLOSING_QUOTE = OPEN_QUOTE;

  @Override
  public String name() {
    return "string";
  }

  @Override
  public String value() {
    return value;
  }
}


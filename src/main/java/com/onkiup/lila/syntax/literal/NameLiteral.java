package com.onkiup.lila.syntax.literal;

import com.onkiup.linker.parser.CapturePattern;

public class NameLiteral implements LilaLiteral {
  @CapturePattern(pattern = "[\\w_$][\\w\\d_$]*")
  private static String name;
}

package com.onkiup.lila.syntax.literal;

import static org.junit.Assert.*;
import org.junit.Test;

public class LilaLiteralTest {
  public static class TestLiteral implements LilaLiteral {
    private String name = "test";
  }
  @Test
  public void testName() {
    TestLiteral literal = new TestLiteral();
    assertEquals("test", literal.name());
  }
}


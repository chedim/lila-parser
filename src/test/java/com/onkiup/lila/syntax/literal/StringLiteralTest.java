package com.onkiup.lila.syntax.literal;

import java.io.StringReader;

import org.junit.Test;

import com.onkiup.linker.parser.TokenGrammar;

import static org.junit.Assert.*;

public class StringLiteralTest {
  private static final String QUOTED_ESCAPED = "\"text\\\"quoted\"";
  private static final String ESCAPED = "text\\\"quoted";
  @Test
  public void testCapture() throws Exception {
    TokenGrammar<StringLiteral> grammar = TokenGrammar.forClass(StringLiteral.class);

    StringLiteral literal = grammar.read(new StringReader(QUOTED_ESCAPED), false);
    assertNotNull(literal);
    assertEquals(ESCAPED, literal.value());
    assertEquals("string", literal.name());
  }
}


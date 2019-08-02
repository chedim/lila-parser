package com.onkiup.lila.syntax.literal;

import java.io.StringReader;

import org.junit.Test;

import com.onkiup.linker.parser.TokenGrammar;

import static org.junit.Assert.*;

public class NameLiteralTest {

  @Test 
  public void testCapture() throws Exception {
    TokenGrammar<NameLiteral> grammar = TokenGrammar.forClass(NameLiteral.class);

    NameLiteral literal = grammar.read(new StringReader("_test"), false);
    assertNotNull(literal);
    assertEquals("_test", literal.name());

    literal = grammar.read(new StringReader("$test2"), false);
    assertNotNull(literal);
    assertEquals("$test2", literal.name());

    literal = grammar.read(new StringReader("$_1_2_3_TEST"), false);
    assertNotNull(literal);
    assertEquals("$_1_2_3_TEST", literal.name());

    try {
      grammar.read(new StringReader(" non-literal "), false);
      assertTrue(false);
    } catch (Exception e) {
      // expected
    }
  }
}


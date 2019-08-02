package com.onkiup.lila.syntax.literal;

import java.io.StringReader;

import org.junit.Test;

import com.onkiup.linker.parser.TokenGrammar;

import static org.junit.Assert.*;

public class IntegerLiteralTest {

  @Test
  public void testRead() throws Exception {
    TokenGrammar<IntegerLiteral> grammar = TokenGrammar.forClass(IntegerLiteral.class);

    IntegerLiteral literal = grammar.read(new StringReader("12345"), false);
    assertNotNull(literal);
    Integer test = 12345;
    assertEquals(test, literal.value());
  }

}


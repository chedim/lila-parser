package com.onkiup.lila.syntax.literal;

import java.lang.reflect.Field;

public interface LilaLiteral<J> {
  default String name() {
    try {
      Field name = getClass().getDeclaredField("name");
      name.setAccessible(true);
      return (String) name.get(this);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  default J value() {
    return null;
  }
}


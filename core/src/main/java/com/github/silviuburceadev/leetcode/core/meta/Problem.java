package com.github.silviuburceadev.leetcode.core.meta;

import java.lang.annotation.Repeatable;

@Repeatable(Problems.class)
public @interface Problem {

    int value();
}

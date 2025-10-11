package com.github.silviuburceadev.leetcode.core.meta;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Problem {

    int[] value();
}

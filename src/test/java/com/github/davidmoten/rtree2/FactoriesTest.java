package com.github.davidmoten.rtree2;

import org.junit.Test;

import com.github.davidmoten.junit.Asserts;

public class FactoriesTest {

    @Test
    public void isUtilityClass() {
        Asserts.assertIsUtilityClass(Factories.class);
    }

}

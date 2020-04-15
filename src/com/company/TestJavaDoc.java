package com.company;

/**
 * Test java doc
 */
public class TestJavaDoc {

    /**
     * Add int
     *
     * @param n n
     * @param m m
     * @return the int
     */
    public int add(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum = sum + i;
        }
        return sum;
    }
} 
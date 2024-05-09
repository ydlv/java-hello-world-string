package com.github.ydlv.hello_world_string;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HelloWorldStringTest {
    @Test
    public void testHelloWorld() {
        Pattern pattern = Pattern.compile("^.*\\bhello\\b.*\\bworld\\b.*$", Pattern.CASE_INSENSITIVE);
        assertTrue(
                "Hello world should contain 'hello' and 'world', in that order, as separate words.",
                pattern.asPredicate().test(HelloWorldString.HELLO_WORLD)
        );
    }
}
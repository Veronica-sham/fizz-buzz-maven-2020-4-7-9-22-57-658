package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void return_number_when_it_is_normal_number(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        Assert.assertEquals("1", result);

    }
}

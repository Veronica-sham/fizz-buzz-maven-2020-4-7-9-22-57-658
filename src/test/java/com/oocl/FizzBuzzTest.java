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

    @Test
    public void return_number_when_it_is_divisible_by_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        Assert.assertEquals("Fizz", result);

    }

    @Test
    public void return_number_when_it_is_divisible_by_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        Assert.assertEquals("Buzz", result);

    }

    @Test
    public void return_number_when_it_is_divisible_by_both_3_and_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(15);
        //then
        Assert.assertEquals("FizzBuzz", result);

    }
}

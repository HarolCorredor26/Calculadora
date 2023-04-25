package com.example.calculadora;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static java.util.regex.Pattern.matches;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testButtons() {
        onView(withId(R.id.suma)).check(matches(isClickable()));
        onView(withId(R.id.resta)).check(matches(isClickable()));
        onView(withId(R.id.multiplicacion)).check(matches(isClickable()));
        onView(withId(R.id.division)).check(matches(isClickable()));
    }

}

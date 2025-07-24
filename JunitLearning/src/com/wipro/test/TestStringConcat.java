package com.wipro.test;

import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringConcat {

	@Test
    public void testDoStringConcat() {
        DailyTasks dt = new DailyTasks();
        String result = dt.doStringConcat("Hello", "World");
        assertEquals("Hello World", result, "String concatenation failed");
    }

}
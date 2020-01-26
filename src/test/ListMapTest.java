package test;

import aufgabe03.ListMap;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListMapTest {
ListMap test = new ListMap();


    @Test
    @Order(1)
    void put() {
        test.put(12345, "Cookie");
        test.put(12345, "Franz");
        test.put(54321, "Franz");
        test.put(54321, "Cookie");
        test.put(123, "Cookie");

        Assertions.assertEquals("Franz", test.get(12345));
        Assertions.assertEquals("Cookie", test.get(54321));
        Assertions.assertEquals("Cookie", test.get(123));
    }

    @Test
    @Order(2)
    void get() {
        test.put(12345, "Cookie");
        test.put(12345, "Franz");
        test.put(54321, "Franz");
        test.put(54321, "Cookie");
        test.put(123, "Cookie");
        Assertions.assertEquals(test.get(123), "Cookie");
        Assertions.assertNull(test.get(9876));
    }



    @Test
    @Order(3)
    void remove() {
        test.put(12345, "Cookie");
        test.put(12345, "Franz");
        test.put(54321, "Franz");
        test.put(54321, "Cookie");
        test.put(123, "Cookie");
        test.remove(54321);
        Assertions.assertNull(test.get(54321));

        // Testing for
        ListMap copy = test;
        test.remove(9876);
        Assertions.assertEquals(copy.getListMap().size(), test.getListMap().size());
    }
}
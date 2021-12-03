package edu.isu.cs.cs2263.hw02.data;

import edu.isu.cs.cs2263.hw02.data.Course;

import lombok.ToString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class CourseTest {

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestNoArgsCourse() {
        Course testCourse = new Course();
        boolean actual = Objects.equals(testCourse.getName(), "") &
                testCourse.getNumber() == 0 &
                testCourse.getCredits() == 0 &
                Objects.equals(testCourse.getCode(), "");
        assertTrue(actual, "Course no arg constructor problem");
    }


    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestAllArgsCourseName() {
        Course testCourseName = new Course(456, "testName", 123, "testCode");
        assertEquals("testName", testCourseName.getName(), "Course constructor name problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestAllArgsCourseNumber() {
        Course testCourseNumber = new Course(456, "testName", 123, "testCode");
        assertEquals(456, testCourseNumber.getNumber(), "Course constructor number problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestAllArgsCourseCredits() {
        Course testCourseCredits = new Course(456, "testName", 123, "testCode");
        assertEquals(123, testCourseCredits.getCredits(), "Course constructor credits problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testAllArgsCourseCode() {
        Course testCourseCode = new Course(456, "testName", 123, "testCode");
        assertEquals("testCode", testCourseCode.getCode(), "Course constructor code problem");
    }





    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestSetCourseName() {
        Course testSCourseName = new Course(456, "testName", 123, "testCode");
        testSCourseName.setName("testName2");
        assertEquals("testName2", testSCourseName.getName(), "Course set name problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestSetCourseNumber() {
        Course testSCourseNumber = new Course(456, "testName", 123, "testCode");
        testSCourseNumber.setNumber(678);
        assertEquals(678, testSCourseNumber.getNumber(), "Course set number problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TestSetCourseCredits() {
        Course testSCourseCredits = new Course(456, "testName", 123, "testCode");
        testSCourseCredits.setCredits(234);
        assertEquals(234, testSCourseCredits.getCredits(), "Course set credits problem");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testSetCourseCode() {
        Course testSCourseCode = new Course(456, "testName", 123, "testCode");
        testSCourseCode.setCode("testCode2");
        assertEquals("testCode2", testSCourseCode.getCode(), "Course set code problem");
    }


    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testToStringCourseCode() {
        Course testCourseString = new Course(456, "testName", 123, "testCode");
        String expected = "Course(" + testCourseString.getNumber() + ", " +
                 testCourseString.getName() + ", " +
                 testCourseString.getCredits() + ", " +
                 testCourseString.getCode() + ")";
        assertEquals(expected, testCourseString.toString(), "Course set code problem");
    }

}
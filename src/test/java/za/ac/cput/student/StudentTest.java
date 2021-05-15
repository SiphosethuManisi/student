package za.ac.cput.student;
/*
Siphosethu Manisi 219039380
Student test class
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    List<Student> studentList = new ArrayList<>();
    Set<Student> studentSet = new HashSet<>();
    Map<Integer,Student > studentMap = new HashMap<>();
    Student student = new Student("Sipho","Manisi",219039380);

   //adds followed by test
    @BeforeEach
    void Adding(){
        studentList.add(student);
        studentSet.add(student);
        for (int i =0; i<10; i++)
        {
            studentMap.put(i,student);
        }

    }
    @Test
    void TestListAdd(){
        assertEquals(1,studentList.size());
    }
    @Test
    void TestSetAdd(){
        assertEquals(1,studentSet.size());
    }
    @Test
    void TestMapAdd(){
        assertEquals(10,studentMap.size());
    }
    //Removes as well as tests
    @Test
    void TestListRemove(){
        studentList.remove(0);
        assertEquals(0,studentList.size());
    }
    @Test
    void TestSetRemove(){
        studentSet.remove(student);
        assertEquals(0,studentSet.size());
    }
    @Test
    void TestMapRemove(){
        studentMap.remove(0);
        assertEquals(9,studentMap.size());
    }
    //Finds as well as tests
    @Test
    void TestListFind(){
        boolean found = false;
        if (studentList.contains(student))
            found = true;
        assertTrue(found);
    }
    @Test
    void TestSetFind(){
        boolean found = false;
        if (studentSet.contains(student))
            found = true;
        assertTrue(found);
    }
    @Test
    void TestMapFind(){
        boolean found = false;
        if (studentMap.containsValue(student))
            found = true;
        assertTrue(found);
    }
}
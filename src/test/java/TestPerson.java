import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private static final double DELTA = 1e-15; //Small enough number for DELTA

    @Test
    public void setNameTest(){
        Person person = new Person("Amy",25,12.5);
        String expected = "Sally";
        person.setName("Sally");
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAgeTest(){
        Person person = new Person("Mike",28,24.0);
        int expected = 30;
        person.setAge(30);
        int actual = person.getAge();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setStudyHoursTest(){
        Person person = new Person("Bob",24,10.0);
        double expected = 8.5;
        person.setStudyHours(8.5);
        double actual = person.getStudyHours();
        Assert.assertEquals(expected,actual,DELTA);
    }

    @Test
    public void testConstructorName(){
        Person person = new Person("Sam");
        Assert.assertEquals("Expect Sam","Sam",person.getName());
    }

    @Test
    public void testConstructorAge(){
        Person person = new Person(21);
        Assert.assertEquals("Expect 21",21,person.getAge());
    }

    @Test
    public void testConstructorStudyHours(){
        Person person = new Person(5.0);
        Assert.assertEquals("Expect 5.0",5.0,person.getStudyHours(),DELTA);
    }

    @Test
    public void testConstructorNameAge(){
        Person person = new Person("Eugene",20);
        Assert.assertEquals("Expect Eugene","Eugene",person.getName());
        Assert.assertEquals("Expect 20",20,person.getAge());
    }

    @Test
    public void testConstructorNameStudyHours(){
        Person person = new Person("Paul",19.9);
        Assert.assertEquals("Expect Paul","Paul",person.getName());
        Assert.assertEquals("Expect 19.9",19.9,person.getStudyHours(),DELTA);
    }

    @Test
    public void testConstructorAgeStudyHours(){
        Person person = new Person(24,3.0);
        Assert.assertEquals("Expect 24",24,person.getAge());
        Assert.assertEquals("Expect 3.0",3.0,person.getStudyHours(),DELTA);
    }

    @Test
    public void testConstructorAll(){
        Person person = new Person("Carol",23,3.5);
        Assert.assertEquals("Expect Carol","Carol",person.getName());
        Assert.assertEquals("Expect 23",23,person.getAge());
        Assert.assertEquals("Expect 3.5",3.5,person.getStudyHours(),DELTA);
    }
}

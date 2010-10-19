package test.java;

import static org.junit.Assert.*;

import main.java.MdpJunitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MdpJunitDemoTest {

	private String helloString1;
	private String helloString2;
	private String abcString;
	
	private MdpJunitDemo m_classToTest;
	
    @Before
    public void init() {
        this.helloString1 = "hello";
        this.helloString2 = "HELLO";
        this.abcString = "123ABC";
        this.m_classToTest = new MdpJunitDemo();
    }
    
    @After
    public void clear() {
        this.helloString1 = null;
        this.helloString2 = null;
        this.abcString = null;
        this.m_classToTest = null;
    }
    
    @BeforeClass
    public static void beforeEverything() {
    }

    @AfterClass
    public static void cleanUp() {
    }
	
	@Test
	public void testIsEmpty() {
		assertEquals(false, m_classToTest.isEmpty(helloString1));
		assertEquals(true, m_classToTest.isEmpty(""));
	}

	@Test
	public void testCapitalize() {
		assertEquals("Hello", m_classToTest.capitalize(helloString1));
		assertEquals("Hello", m_classToTest.capitalize(helloString2));
		assertEquals("123abc", m_classToTest.capitalize(abcString));
	}

	@Test(expected=NullPointerException.class)
	public void testReverse() {
		m_classToTest.reverse(null);
	}
	
	@Test
	public void testReverseNotNull() {
		assertEquals("olleh", m_classToTest.reverse(helloString1));
	}

	@Test
	public void testJoin() {
		assertEquals("hello HELLO 123ABC", m_classToTest.join(helloString1,helloString2,abcString));
	}


}

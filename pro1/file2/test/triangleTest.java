package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import javax.print.DocFlavor.STRING;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class triangleTest {
	
	private String input1;
	private String input2;
	private String input3;
	private String expected;
	private Triangle tri = null;
	
public triangleTest(String input1,String input2,String input3,String expected){
	this.input1 = input1;
	this.input2 = input2;
	this.input3 = input3;
	this.expected = expected;
	}

@Before
public void setUp(){
tri = new Triangle();
}

@Parameters
public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
			{"1","1","2","Not_a_triangle"},
			{"2","2","2","Equilateral"},
			{"3","3","1","Isosceles"},
			{"2","3","4","Scalene"}
			});
	}

@Test
public void test() {
assertEquals(this.expected,tri.TriangleType(input1, input2,input3));
}
}
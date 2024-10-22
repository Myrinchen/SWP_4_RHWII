package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculation {  
	
	@Test
	public void testFindMax() {
		int[] arr = {1, 3, 4, 2};
		int result =Calculation.findMax(arr);
		Assert.assertEquals(result, 4);
	}
   
	@Test
	public void testCube() {
		int result = Calculation.cube(4);
		Assert.assertEquals(result, 64);
	}
	
	@Test
	public void testReverseWord() {
		String result = Calculation.reverseWord("hallo");
		Assert.assertEquals(result, "ollah ");
	
	}
	
	@Test
	public void testToThePowerOf(){
		int result = Calculation.toThePowerOf(2, 2);
		Assert.assertEquals(result, 4);
	}
	
	 @Test
	 public void testFindMax2() {
	    int[] arr = {4, 8, 16, 2};
	    int result = Calculation.findMax(arr);
	    Assert.assertEquals(result, 16);
	 }
	 
	@Test
    public void testCube2() {
	    int result = Calculation.cube(4);
        Assert.assertEquals(result, 64);
	}

	@Test
	public void testReverseWord2() {
	    String result = Calculation.reverseWord("SWP is nice");
	    Assert.assertEquals(result.trim(), "PWS si ecin");
    }

	@Test
    public void testToThePowerOf2() {
		int result = Calculation.toThePowerOf(4, 0);
	    Assert.assertEquals(result, 1);
	}
	
	
}  

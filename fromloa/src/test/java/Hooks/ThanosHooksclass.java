package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHooksclass {

//	@Before(order=1)
//	public void beforeexecution() {
//		System.out.println("should be line 1 ");
//	}
//	
//	@After(order=1)
//	public void afterexecution() {
//		System.out.println("should be line 5 ");
//	}
//	
//	@Before(order=0)
//	public void beforetobefore()
//	{
//		System.out.println("should be line 0");
//	}
//	@After(order=0)
//	public void aftertoafter()
//	{
//		System.out.println("should be line 6");
//	}
	
	@Before
	public void beforesceanrio()
	{
		System.out.println("Before every scenario");
	}
	@After
	public void aftersceanrio()
	{
		System.out.println("After  every scenario");
	}
	@Before("@First")
	public void beforefirst()
	{
		System.out.println("Before every first");
	}
	
	@Before("@Second")
	public void beforesecond()
	{
		System.out.println("Before every second");
	}
	@Before("@Third")
	public void beforeThird()
	{
		System.out.println("Before every third");
	}
	@After("@First")
	public void afterfirst()
	{
		System.out.println("after every first");
	}
	
	@After("@Second")
	public void afteresecond()
	{
		System.out.println("after every second");
	}
	@After("@Third")
	public void afterThird()
	{
		System.out.println("after every third");
	}
	
}

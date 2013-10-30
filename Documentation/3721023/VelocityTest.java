import junit.framework.*;

public class TestVelocity extends TestCase
{
	
	Velocity v1;
	Velocity v2;
	Velocity v3;
	
	public void setUp()
	{
		v1 = new Velocity();
		v2 = new Velocity( 10, 5 );
		v3 = new Velocity( -5, 10 );
	}
	
	public void testReverseX()
	{
		int initX = v1.getSpeedX();
		v1.reverseX();
		int revX = v1.getSpeedX();
		
		assertEquals( initX, revX * -1 );
		
		initX = v2.getSpeedX();
		v2.reverseX();
		revX = v2.getSpeedX();
		
		assertEquals( initX, revX * -1 );
		
		initX = v3.getSpeedX();
		v3.reverseX();
		revX = v3.getSpeedX();
		
		assertEquals( initX, revX * -1 );
	}
	
	public void testReverseY()
	{
		int initY = v1.getSpeedY();
		v1.reverseY();
		int revY = v1.getSpeedY();
		
		assertEquals( initY, revY * -1 );
		
		initY = v2.getSpeedY();
		v2.reverseY();
		revY = v2.getSpeedY();
		
		assertEquals( initY, revY * -1 );
		
		initY = v3.getSpeedY();
		v3.reverseY();
		revY = v3.getSpeedY();
		
		assertEquals( initY, revY * -1 );
	}
	
	public void testSetSpeed()
	{
		v1.setSpeed( 1 );
		assertEquals( v1.getSpeedX(), 1 );
		v2.setSpeed( 0 );
		assertEquals( v2.getSpeedX(), 0 );
		v3.setSpeed( -5 );
		assertEquals( v3.getSpeedX(), -4 );
	}
	
	public void testSetDirection()
	{
		v1.setDirection( 5 );
		v2.setDirection( 0 );
		v3.setDirection( -5 );
		
		assertEquals( v1.getDirection(), 5 );
		assertEquals( v2.getDirection(), 0 );
		assertEquals( v3.getDirection(), -5 );
	}
	
	public void testGetDirection()
	{
		assertEquals( v1.getDirection(), 0 );
		assertEquals( v2.getDirection(), 5 );
		assertEquals( v3.getDirection(), 10);
	}
	
	public void testGetSpeedX()
	{
		assertEquals( v1.getSpeedX(), 0 );
		assertEquals( v2.getSpeedX(), 9 );
		assertEquals( v3.getSpeedX(), -4);
	}
	
	public void testGetSpeedY()
	{
		assertEquals( v1.getSpeedX(), 0 );
		assertEquals( v2.getSpeedX(), 9 );
		assertEquals( v3.getSpeedX(), -4);
	}
	
	public void testDecomposeSpeed()
	{
		int init = v1.getSpeedX();
		v1.decomposeSpeed();
		int after = v1.getSpeedX();
		assertEquals( init, after );
		
		init = v2.getSpeedX();
		v2.decomposeSpeed();
		after = v2.getSpeedX();
		assertEquals( init, after );
		
		init = v3.getSpeedX();
		v3.decomposeSpeed();
		after = v3.getSpeedX();
		assertEquals( init, after );
	}
}

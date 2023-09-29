package Day26;

import org.junit.*;


import static org.junit.Assert.*;


public class Basic_TestTest {

    Basic_Test mbt;
    public Basic_TestTest() {
    }

    @Before
    public void setUp(){
        mbt = new Basic_Test();
    }

    @After
    public void tearDown() {
        mbt = null;
    }
    
    @Test
    public void testAdd() {
        int a = 10,b = 20,c;
        c = mbt.add(a, b);
        assertEquals(30, c);//This is the expected result
        //assertNotEquals(0, c);//This will fail
        //assertTrue(c==0);//This will fail
        
        
    }

}

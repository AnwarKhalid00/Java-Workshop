package Day26;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class Basic_Test2Test {
     Basic_Test2 mbt;
    public Basic_Test2Test() {
    }

    @Before
    public void setUp(){
        mbt = new Basic_Test2();
    }

    @After
    public void tearDown() {
        mbt = null;
    }
    
    @Test
    public void testcheck() {
        int a = 59,c;
        c = mbt.check(a);
        assertEquals('F', c);//This is the expected result
        //assertNotEquals(0, c);//This will fail
        //assertTrue(c==0);//This will fail
        
        
    }
}


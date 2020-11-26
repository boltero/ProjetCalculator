package caculator;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
        Calculator calculator;
        @Before
        public void setUip() throws Exception{
            calculator= new Calculator();
        }

        @Test
        public void testSub() {

            int resultat=calculator.sub(3,2);
            if(resultat !=5){
                Assert.fail();
            }
        }

        @Test
        public void testMinus() {

            Assert.assertEquals(0, calculator.minus(7,7));
        }

        @Test
        public void testMultiply() {
            Assert.assertEquals(18, calculator.multiply(9,2));
        }

        @Test
        public void testDivide() {
            int result= calculator.divide(15,3);
            if (result !=5){
                Assert.fail();
            }
        }
      /*  @Test(expected = ArithmeticException.class)
        public void divideWiththrowExeption() {
            calculator.divide(6,0);
        }
*/
        @Test
        public void testMin() {
            int min=calculator.min(10,20);
            if (min !=10) Assert.fail();
        }

        @Test
        public void testMax() {
            int max=calculator.max(2000,-2000);
            Assert.assertEquals(2000,max);

        }

        @Test
        public void testMinElement() {
            int tab[]={
                    1,3,5,9
            };
            int a=calculator.minElement(tab);
            Assert.assertEquals(1,a);

        }
       @Test
        public void testMaxElement(){
            int tab[]={
                    1,3,5,9
            };
            int a =calculator.maxElement(tab);
            Assert.assertEquals(9,a);

        }

}


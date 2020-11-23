package caculator;

import calculator.calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
        calculator calculator;
      /*  @Before
        public void setUip() throws Exception{
            calculator= new calculator();
        }*/

        @Test
        public void sub() {

            int resultat=calculator.sub(3,2);
            if(resultat !=4){
                Assert.fail();
            }
        }

        @Test
        public void minus() {

            Assert.assertEquals(0, calculator.minus(7,2));
        }

        @Test
        public void multiply() {
            Assert.assertEquals(4, calculator.multiply(9,2));
        }

        @Test
        public void divide() {
            int result= calculator.divide(15,3);
            if (result !=2){
                Assert.fail();
            }
        }
      /*  @Test(expected = ArithmeticException.class)
        public void divideWiththrowExeption() {
            calculator.divide(6,0);
        }
*/
        @Test
        public void min() {
            int min=calculator.min(10,20);
            if (min !=20) Assert.fail();
        }

        @Test
        public void max() {
            int max=calculator.max(2000,-2000);
            Assert.assertEquals(-2000,max);

        }

       /* @Test
        public void minElement() {
            int tab[]={
                    1,3,5,9
            };
            int a=calculator.minElement(tab);
            Assert.assertEquals(5,a);

        }*/
    /*    @Test
        public void maxElement(){
            int tab[]={
                    1,3,5,9
            };
            int a =calculator.maxElement(tab);
            Assert.assertEquals(1,a);

        }*/

}


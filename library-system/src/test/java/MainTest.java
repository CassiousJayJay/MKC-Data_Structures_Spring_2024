import org.github.CasiousJayJay.library.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void add_two_numbers(){
        //arrange
        Main add = new Main();
        int expected = 4;

        int actual = add.sum(2, 2);

        assertEquals(actual, expected);
    }
    @Test
    public void addWIthZero(){
        Main main = new Main();
        int expected = 10;

        int actual = main.sum(0, 10);
        assertEquals(actual, expected);
    }
   @Test
    public void numberofBooks(){
        Main book1 = new Main();
        Main book2 = new Main();
        Main book3 = new Main();
        Main book4 = new Main();
        Main totalBooks = new Main();
        assertEquals(5,totalBooks.numberofBooks());
   }
   @Test
    public void returnHelloJames(){
        Main name = new Main();
        assertEquals("Hello James", name.returnHelloJames("James"));
   }
   @Test
   public void devideNumber(){
        Main answer = new Main();
        assertEquals(2, answer.devideNumber(8, 4));
   }
   @Test
    public void demostratingArrays(){
        Main book1 = new Main();
        Main book2 = new Main();
        Main book3 = new Main();
        Main book4 = new Main();
        Main totalBooks = new Main();
        assertEquals(5, totalBooks.demostraringArrays());
    }
    @Test
    public void subtraction(){
        Main subtract = new Main();
        assertEquals(50, subtract.subtraction());
    }


}
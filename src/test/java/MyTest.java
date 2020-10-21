import com.yyy.service.BookServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void mybatisTest()
    {
        BookServiceImpl bookService = new BookServiceImpl();
        System.out.println(bookService.queryBookByID(1));
    }
}


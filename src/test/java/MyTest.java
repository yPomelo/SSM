import com.yyy.pojo.Books;
import com.yyy.service.BookService;
import com.yyy.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void mybatisTest()
    {
        BookServiceImpl bookService = new BookServiceImpl();
        System.out.println(bookService.queryBookByID(1));
    }
    @Test
    public void SSMTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books queryAllBook : bookServiceImpl.queryAllBooks()) {
            System.out.println(queryAllBook);
        }
    }
}


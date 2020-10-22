package com.yyy.controller;

import com.yyy.pojo.Books;
import com.yyy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    // 调Service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    // 查询全部的书籍，并返回到一个书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addbook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("add Book =>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books book = bookService.queryBookByID(id);
        System.out.println(book);
        model.addAttribute("book",book);
        return "updateBook";
    }
    @RequestMapping("updateBook")
    public String UpdateBook(Books books){
        System.out.println("update=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookByID(id);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String quueryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if (books == null)
        {
            list = bookService.queryAllBooks();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);
        return "allBook";
    }
}

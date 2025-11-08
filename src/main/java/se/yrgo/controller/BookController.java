package se.yrgo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import se.yrgo.domain.Book;

@Controller
@RequestMapping("/website/books")
public class BookController {

    private List<Book> createBookList() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Marios life", "Mario", "Biografi"));
        bookList.add(new Book("Yrgo", "Nahid", "Utbildning"));
        bookList.add(new Book("Sagan om ringen", "Tolkien", "Fantasy"));
        bookList.add(new Book("Självbiografin", "Zlatan", "Biografi"));
        
        return bookList;
    }

    @RequestMapping(value = "/home.html", method = RequestMethod.GET)
    public ModelAndView firstPage() {
        Date dateAndTime = new Date();
        return new ModelAndView("home", "dateAndTime", dateAndTime);
    }

    @RequestMapping(value = "/booklist.html", method = RequestMethod.GET)
    public ModelAndView showBooks() {
        List<Book> bookList = createBookList();
        return new ModelAndView("booklist", "books", bookList);
    }
    
    @RequestMapping(value = "/genre.html", method = RequestMethod.GET)
    public ModelAndView listBookByGenre(@RequestParam(value = "genre", required = false) String genre) {

        List<Book> allBooks = createBookList();
        List<Book> filteredBooks;

        if (genre == null || genre.isEmpty()) {
            filteredBooks = allBooks;
        } else {
            filteredBooks = allBooks.stream()
                    .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                    .collect(Collectors.toList());
        }

        ModelAndView mav = new ModelAndView("genre");
        mav.addObject("books", filteredBooks);
        mav.addObject("selectedGenre", genre);
        return mav;
    }
}
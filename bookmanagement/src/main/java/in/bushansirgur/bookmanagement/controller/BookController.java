package in.bushansirgur.bookmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import in.bushansirgur.bookmanagement.model.Book;
import in.bushansirgur.bookmanagement.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView getAllBook() {
		ModelAndView mav = new ModelAndView("managebook");
		mav.addObject("books", bookService.get());
		return mav;
	}
	
	@RequestMapping(value = "/openAddBookForm")
	public ModelAndView openAddBookForm() {
		ModelAndView mav = new ModelAndView("addbook");
		mav.addObject("book", new Book());
		return mav;
	}
	
	@RequestMapping(value = "/bookprocess")
	public ModelAndView bookProcess(@ModelAttribute("book") Book book) {
		ModelAndView mav = new ModelAndView("managebook");
		bookService.save(book);
		mav.addObject("books", bookService.get());
		return mav;
	}
	
	@RequestMapping(value = "/getSingleBook")
	public ModelAndView editBook(@RequestParam("bookid") int id) {
		ModelAndView mav = new ModelAndView("addbook");
		mav.addObject("book", bookService.get(id));
		return mav;
	}
	
	@RequestMapping(value = "/deleteprocess")
	public ModelAndView deleteBook(@RequestParam("bookid") int id) {
		ModelAndView mav = new ModelAndView("managebook");
		bookService.delete(id);
		mav.addObject("books", bookService.get());
		return mav;
	}
}

package in.bushansirgur.bookmanagement.dao;

import java.util.List;

import in.bushansirgur.bookmanagement.model.Book;

public interface BookDAO {
	
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}

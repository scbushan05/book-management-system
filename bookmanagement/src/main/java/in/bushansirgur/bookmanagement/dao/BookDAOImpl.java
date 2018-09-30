package in.bushansirgur.bookmanagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.bushansirgur.bookmanagement.model.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public Book get(int id) {
		Book book = (Book)sessionFactory.getCurrentSession().get(Book.class, id);
		return book;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = session.get(Book.class, id);
		session.delete(book);
	}

	@Override
	public List<Book> get() {
		return sessionFactory.getCurrentSession().createQuery("from Book").list();
	}

}

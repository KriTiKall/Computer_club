package data.dao;

import data.entity.Hall;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class HallDao extends AbstractDao<Hall, Long> {

    public HallDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Hall read(Long id) {
        try (final Session session = sessionFactory.openSession()) {
            Hall hall = session.get(Hall.class, id);
            return hall != null ? hall : new Hall();
        }
    }

    @Override
    public List<Hall> getList() {
        try (final Session session = sessionFactory.openSession()) {
            return session.getSession().createQuery("from Hall").list();
        }
    }
}

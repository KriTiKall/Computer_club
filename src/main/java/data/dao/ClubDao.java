package data.dao;

import data.entity.Club;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClubDao extends AbstractDao<Club, Long> {

    public ClubDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Club read(Long id) {
        try (final Session session = sessionFactory.openSession()) {
            Club club = session.get(Club.class, id);
            return club != null ? club : new Club();
        }
    }

    @Override
    public List<Club> getList() {
        try (final Session session = sessionFactory.openSession()) {
            return session.getSession().createQuery("from Club").list();
        }
    }
}

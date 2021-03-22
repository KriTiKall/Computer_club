package data.dao;

import data.entity.Client;
import data.entity.Computer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ComputerDao extends AbstractDao<Computer, Long>{

    public ComputerDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Computer read(Long id) {
        try (final Session session = sessionFactory.openSession()) {
            Computer computer = session.get(Computer.class, id);
            return computer != null ? computer : new Computer();
        }
    }

    @Override
    public List<Computer> getList() {
        try (final Session session = sessionFactory.openSession()) {
            return session.getSession().createQuery("from Computer").list();
        }
    }
}

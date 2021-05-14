package data.dao

import abstracts.AbstractDao
import data.entity.*
import org.hibernate.SessionFactory

class ClientDao(sessionFactory: SessionFactory) :
    AbstractDao<Client, Long>(sessionFactory, Client())

class ClubDao(sessionFactory: SessionFactory) :
    AbstractDao<Club, Long>(sessionFactory, Club())

class ComputerDao(sessionFactory: SessionFactory) :
    AbstractDao<Computer, Long>(sessionFactory, Computer())

class HallDao(sessionFactory: SessionFactory) :
    AbstractDao<Hall, Long>(sessionFactory, Hall())

class UserDao(sessionFactory: SessionFactory) :
    AbstractDao<User, String>(sessionFactory, User())
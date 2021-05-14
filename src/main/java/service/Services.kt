package service

import abstracts.AbstractService
import data.dao.*
import data.entity.*
import org.hibernate.SessionFactory

class HallService(factory: SessionFactory) : AbstractService<Hall, Long>(HallDao(factory)) {

    private val clubDao = ClubDao(factory)

    fun getClubs() : List<Club> {
        return clubDao.getList()
    }
}

class ClientService(factory: SessionFactory) : AbstractService<Client, Long>(ClientDao(factory)) {
    private val computerDao = ComputerDao(factory)

    fun getComputers() : List<Computer> {
        return computerDao.getList()
    }
}

class ComputerService(factory: SessionFactory) : AbstractService<Computer, Long>(ComputerDao(factory)) {
    private val hallDao = HallDao(factory)

    fun getHalls() : List<Hall> {
        return hallDao.getList()
    }
}

class ClubService(factory: SessionFactory) : AbstractService<Club, Long>(ClubDao(factory)) {
}

class AuthService(factory: SessionFactory) {

    private val dao = UserDao(factory)

    private val empty = User()

    fun create(user: User) {
        dao.create(user)
    }

    fun passwordCheck(user: User): Boolean =
        dao.read(user.login).password == user.password

    fun isExist(user: User): Boolean {
        if (dao.read(user.login) == empty)
            return false
        return true
    }
}
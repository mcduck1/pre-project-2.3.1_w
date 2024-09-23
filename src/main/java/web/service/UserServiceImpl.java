package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDAOImpl userDAO;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}

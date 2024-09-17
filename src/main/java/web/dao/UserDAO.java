package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAll();
    void add(User user);
    void edit(User user);
    User getById(int id);
    void delete(int id);
}

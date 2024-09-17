package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void add(User User);

    void edit(User User);
    User getById(int id);

    void delete(int id);
}

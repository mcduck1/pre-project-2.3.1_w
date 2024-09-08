package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User User);
    void delete(User User);
    void edit(User User);
    User getById(int id);
}

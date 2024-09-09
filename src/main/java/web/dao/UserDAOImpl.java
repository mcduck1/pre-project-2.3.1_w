package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User users) {
        entityManager.persist(users);
    }

    @Override
    public void edit(User users) {
        entityManager.merge(users);
    }

    @Override
    public List<User> allusers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class)
                .getResultList();
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user.getId());
    }
}

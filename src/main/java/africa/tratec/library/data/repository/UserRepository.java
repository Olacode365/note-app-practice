package africa.tratec.library.repository;

import africa.tratec.library.model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findById(String id);
    User findByEmail(String email);
    List<User> findByFirstName(String firstName);
    User

}

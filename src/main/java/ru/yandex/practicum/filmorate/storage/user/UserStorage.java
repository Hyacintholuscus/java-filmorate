package ru.yandex.practicum.filmorate.storage.user;

import ru.yandex.practicum.filmorate.model.User;

import java.util.List;

public interface UserStorage {
    User create( User user);

    User update( User user);

    User delete(Long id);

    User getUserById(Long id);

    List<User> findAllUsers();

    boolean contains(Long id);
}

package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
  private List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public User getUserByEmail(String email) {
    for (User user : users) {
      if (user.getEmail().equals(email)) {
        return user;
      }
    }
    return null;
  }
  public User getUserByEmailAndPassword(String email, String password) {
    for (User user : users) {
      if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
        return user;
      }
    }
    return null;
  }
}

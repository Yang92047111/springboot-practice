package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;

public class MongoUserPersistentRepository implements UserPersistentRepository {

  @Override
  public User findByEmail(String email) {
    return null;
  }

  @Override
  public User findById(String id) {
    return null;
  }

  @Override
  public User insert(User user) {
    return null;
  }

  @Override
  public User replace(String id, User user) {
    return null;
  }

  @Override
  public boolean removeById(String id) {
    return false;
  }
}

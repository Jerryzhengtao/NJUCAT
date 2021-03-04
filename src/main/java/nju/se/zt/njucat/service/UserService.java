package nju.se.zt.njucat.service;

import nju.se.zt.njucat.po.User;

public interface UserService {
    User checkUser(String username, String password);
}

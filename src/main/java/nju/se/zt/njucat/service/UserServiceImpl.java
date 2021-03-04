package nju.se.zt.njucat.service;

import nju.se.zt.njucat.dao.UserRepository;
import nju.se.zt.njucat.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * //TODO
 * @Author zt
 * @Date 2021/3/3 21:58
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUserNameAndPassword(username, password);
        return user;
    }
}

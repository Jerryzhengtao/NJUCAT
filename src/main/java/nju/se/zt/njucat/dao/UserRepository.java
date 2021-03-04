package nju.se.zt.njucat.dao;

import nju.se.zt.njucat.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * //TODO
 * @Author zt
 * @Date 2021/3/3 23:30
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndPassword(String username, String password);
}

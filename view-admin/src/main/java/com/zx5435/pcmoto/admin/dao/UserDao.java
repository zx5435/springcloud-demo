package com.zx5435.pcmoto.admin.dao;

import com.zx5435.pcmoto.admin.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserDO, Integer> {

    @Override
    List<UserDO> findAll();

    @Override
    Optional<UserDO> findById(Integer integer);

}
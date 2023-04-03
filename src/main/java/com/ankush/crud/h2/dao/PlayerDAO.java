package com.ankush.crud.h2.dao;

import com.ankush.crud.h2.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Integer> {
}

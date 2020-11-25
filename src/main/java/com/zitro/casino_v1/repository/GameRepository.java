package com.zitro.casino_v1.repository;

import com.zitro.casino_v1.entity.Game;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
}

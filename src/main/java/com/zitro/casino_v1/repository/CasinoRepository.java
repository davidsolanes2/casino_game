package com.zitro.casino_v1.repository;

import com.zitro.casino_v1.entity.Casino;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CasinoRepository extends CrudRepository<Casino, Long> {

}

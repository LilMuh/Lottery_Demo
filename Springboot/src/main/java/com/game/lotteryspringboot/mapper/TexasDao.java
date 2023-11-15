package com.game.lotteryspringboot.mapper;

import com.game.lotteryspringboot.entity.Params;
import com.game.lotteryspringboot.entity.Player;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface TexasDao extends Mapper<Player> {

    List<Player> search(@Param("params") Params params);
}

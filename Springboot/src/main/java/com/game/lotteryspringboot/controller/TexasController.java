package com.game.lotteryspringboot.controller;

import com.game.lotteryspringboot.common.Result;
import com.game.lotteryspringboot.entity.Player;
import com.game.lotteryspringboot.entity.PokerTable;
import com.game.lotteryspringboot.service.TexasService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/admin/TexasHoldem")
public class TexasController {

    @Resource
    private TexasService texasService;

    @PostMapping("/startGame")
    public Result startGame(@RequestBody Player player){
        PokerTable pt =  texasService.startGame(player);
        return Result.success(pt);
    }

}

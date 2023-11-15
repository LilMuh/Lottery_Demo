package com.game.lotteryspringboot.service;

import com.game.lotteryspringboot.entity.*;
import com.game.lotteryspringboot.mapper.TexasDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;

@Service
public class TexasService {

    @Resource
    private TexasDao texasDao;

    public PokerTable startGame(Player player) {
        Deck deck = new Deck();
        deck.shuffle();
        // 洗牌完成
        PokerTable pt = new PokerTable();
        pt.getTable(pt, player);
        // 分桌完成
        for (Player eachPlayer : pt.getPlayers()) {
            Hand hand = new Hand(Arrays.asList(deck.dealCard(), deck.dealCard()), "Royal flush");
            eachPlayer.setHand(hand);
        }
        // 玩家发牌完成
        pt.setCommunityCards(Arrays.asList(deck.dealCard(),deck.dealCard(),deck.dealCard(),deck.dealCard(),deck.dealCard()));
        // 牌桌发牌完成
        return pt;
    }
}
package com.jay.animequiz.model.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.jay.animequiz.model.RankingModel;

import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Dao
public
interface RankingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveRanking(RankingModel ranking);
    @Query("select * from  ranking_table order by points desc limit 10")
    List<RankingModel> getRanking();
}

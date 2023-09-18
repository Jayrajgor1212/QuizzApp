package com.jay.animequiz.model.di;

import com.jay.animequiz.model.repository.QuestionDataSource;
import com.jay.animequiz.model.repository.QuestionRepository;
import com.jay.animequiz.model.repository.QuestionRepositoryImpl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(SingletonComponent.class)
public class DataModule {
    @Provides
    QuestionRepository questionRepositoryProvider(QuestionDataSource questionDataSource){
        return new QuestionRepositoryImpl(questionDataSource);
    }

}

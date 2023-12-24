package ru.iteco.fmhandroid.db;

import java.lang.System;

@androidx.room.Database(entities = {ru.iteco.fmhandroid.entity.NewsEntity.class, ru.iteco.fmhandroid.entity.NewsCategoryEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lru/iteco/fmhandroid/db/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "getNewsCategoryDao", "Lru/iteco/fmhandroid/dao/NewsCategoryDao;", "getNewsDao", "Lru/iteco/fmhandroid/dao/NewsDao;", "app_debug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    
    public AppDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.NewsDao getNewsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.NewsCategoryDao getNewsCategoryDao();
}
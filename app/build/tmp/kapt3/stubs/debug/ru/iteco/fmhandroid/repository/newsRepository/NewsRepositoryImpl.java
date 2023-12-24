package ru.iteco.fmhandroid.repository.newsRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J]\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\n0\u0015H\u0016J\u0019\u0010%\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010&\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lru/iteco/fmhandroid/repository/newsRepository/NewsRepositoryImpl;", "Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;", "newsDao", "Lru/iteco/fmhandroid/dao/NewsDao;", "newsCategoryDao", "Lru/iteco/fmhandroid/dao/NewsCategoryDao;", "newsApi", "Lru/iteco/fmhandroid/api/NewsApi;", "(Lru/iteco/fmhandroid/dao/NewsDao;Lru/iteco/fmhandroid/dao/NewsCategoryDao;Lru/iteco/fmhandroid/api/NewsApi;)V", "<set-?>", "", "Lru/iteco/fmhandroid/dto/News;", "newsList", "getNewsList", "()Ljava/util/List;", "changeIsOpen", "", "newsItem", "(Lru/iteco/fmhandroid/dto/News;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNews", "getAllNews", "Lkotlinx/coroutines/flow/Flow;", "Lru/iteco/fmhandroid/dto/NewsWithCategory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "publishEnabled", "", "publishDateBefore", "", "newsCategoryId", "", "dateStart", "dateEnd", "status", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getAllNewsCategories", "Lru/iteco/fmhandroid/dto/News$Category;", "modificationOfExistingNews", "refreshNews", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNewsItemById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsCategories", "listNewsCategories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class NewsRepositoryImpl implements ru.iteco.fmhandroid.repository.newsRepository.NewsRepository {
    private final ru.iteco.fmhandroid.dao.NewsDao newsDao = null;
    private final ru.iteco.fmhandroid.dao.NewsCategoryDao newsCategoryDao = null;
    private final ru.iteco.fmhandroid.api.NewsApi newsApi = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ru.iteco.fmhandroid.dto.News> newsList;
    
    @javax.inject.Inject()
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dao.NewsDao newsDao, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dao.NewsCategoryDao newsCategoryDao, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.NewsApi newsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ru.iteco.fmhandroid.dto.News> getNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> getAllNews(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean publishEnabled, @org.jetbrains.annotations.Nullable()
    java.lang.Long publishDateBefore, @org.jetbrains.annotations.Nullable()
    java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeIsOpen(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object modificationOfExistingNews(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.News> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createNews(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.News> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeNewsItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.News.Category>> getAllNewsCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveNewsCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.dto.News.Category> listNewsCategories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
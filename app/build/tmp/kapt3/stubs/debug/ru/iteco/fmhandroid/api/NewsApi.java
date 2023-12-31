package ru.iteco.fmhandroid.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lru/iteco/fmhandroid/api/NewsApi;", "", "editNewsItem", "Lretrofit2/Response;", "Lru/iteco/fmhandroid/dto/News;", "newsItem", "(Lru/iteco/fmhandroid/dto/News;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNews", "Lru/iteco/fmhandroid/dto/NewsResponse;", "pages", "", "publishDate", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNewsItemById", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsItem", "app_debug"})
public abstract interface NewsApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "news")
    public abstract java.lang.Object getAllNews(@retrofit2.http.Query(value = "pages")
    int pages, @retrofit2.http.Query(value = "publishDate")
    boolean publishDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "news")
    public abstract java.lang.Object editNewsItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.News>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "news")
    public abstract java.lang.Object saveNewsItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.News>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "news/{id}")
    public abstract java.lang.Object removeNewsItemById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}
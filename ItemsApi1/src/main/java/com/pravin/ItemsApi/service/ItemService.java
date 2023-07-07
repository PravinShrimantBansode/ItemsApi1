package com.pravin.ItemsApi.service;

import java.util.List;

import com.pravin.ItemsApi.repository.entity.Item;

public interface ItemService
{

    Item save( Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
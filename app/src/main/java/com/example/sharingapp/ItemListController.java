package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ItemListController {

    private ItemList itemList;

    public ItemListController(ItemList itemList) {
        this.itemList = itemList;
    }

    public void setItems(ArrayList<Item> item_list){
        this.itemList.setItems(item_list);
    }

    public ArrayList<Item> getItems(){
        return itemList.getItems();
    }

    public boolean addItem(Item item, Context context){
        AddItemCommand addItemCommand = new AddItemCommand(itemList, item, context);
        addItemCommand.execute();
        return addItemCommand.isExecuted();
    }

    public boolean deleteItem(Item item, Context context){
        DeleteItemCommand deleteItemCommand = new DeleteItemCommand(itemList, item, context);
        deleteItemCommand.execute();
        return deleteItemCommand.isExecuted();
    }

    public boolean editItemCommand(Item item, Item updatedItem, Context context){
        EdiitItemCommand editItemCommand = new EditItemCommand(itemList, item, updatedItem, context);
        editItemCommand.execute();
        return editItemCommand.isExecuted();
    }

    public Item getItem(int index){
        return itemList.getItem(index);
    }

    public int getIndex (Item item){
        return itemList.getIndex(item);
    }

    public int getSize() {
        return itemList.getSize();
    }

    public void loadItems(Context context){
        itemList.loadItems(context);
    }

    public ArrayList<Contact> getActiveBorrowers() {
        return itemList.getActiveBorrowers();
    }

    public ArrayList<Item> filterItemsbyStatus(String status){
        return itemList.filterItemsByStatus(status);
    }

    public void addObserver (Observer observer){
        itemList.addObserver(observer);
    }

    public void removeObserver (Observer observer){
        itemList.removeObserver(observer);
    }


}

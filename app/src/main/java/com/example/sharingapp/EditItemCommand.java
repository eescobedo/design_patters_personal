package com.example.sharingapp;

import android.content.Context;

class EditItemCommand extends Command {

    private ItemList itemList;
    private Item oldItem;
    private Item item;
    private Context context;

    public EditItemCommand(ItemList itemList, Item oldItem, Item item, Context context) {
        this.itemList = itemList;
        this.oldItem = oldItem;
        this.item = item;
        this.context = context;
    }

    @Override
    public void execute() {
        itemList.deleteItem(oldItem);
        itemList.addItem(item);
        setIsExecuted(itemList.saveItems(context));
    }
}

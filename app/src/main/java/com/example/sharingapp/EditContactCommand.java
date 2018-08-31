package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {

    private ContactList contactList;
    private Contact oldContact;
    private Contact contact;
    private Context context;

    public EditContactCommand(ContactList contactList, Contact oldContact, Contact contact, Context context) {
        this.contactList = contactList;
        this.oldContact = oldContact;
        this.contact = contact;
        this.context = context;
    }


    @Override
    public void execute() {
        contactList.deleteContact(oldContact);
        contactList.addContact(contact);
        setIsExecuted(contactList.saveContacts(context));
    }
}

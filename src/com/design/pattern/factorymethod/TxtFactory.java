package com.design.pattern.factorymethod;

public class TxtFactory extends DocumentFactory {

    @Override
    public Document create() {
        Document txt = new TxtDocument();
        System.out.println("Create the TxtDocument");
        return txt;
    }
}

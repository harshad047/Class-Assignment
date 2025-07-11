package com.tss.structural.facade.model;

public class HotelReception {
	public void getIndianMenu() {
        IHotel indianHotel = new IndianHotel();
        Imenu menu = indianHotel.getMenu();
        menu.displayMenu();
    }

    public void getItalianMenu() {
        IHotel italianHotel = new ItalianHotel();
        Imenu menu = italianHotel.getMenu();
        menu.displayMenu();
    }
}

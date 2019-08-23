package com.gildedrose;

public class Item {

    public static final String CHEESE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";


    String name;

    int sellIn;

    int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected void decreaseSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    protected void increaseQuality() {
        this.quality++;
    }

    protected void decreaseQuality() {
        this.quality--;
    }

    public void updateQuality() {
        if (this.quality > 0) {
            this.decreaseQuality();
        }

        this.decreaseSellIn();

        if (this.sellIn < 0 && this.quality > 0) {
            this.decreaseQuality();
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

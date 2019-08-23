package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ShopTest {

    private Item[] buildSingleItemTable(String type, int sellIn, int quality) {
        if (type.equals(Item.CHEESE)) {
            return new Item[]{new Cheese(type, sellIn, quality)};
        } else if (type.equals(Item.SULFURAS)) {
            return new Item[]{new Sulfuras(type, sellIn, quality)};
        } else if (type.equals(Item.BACKSTAGE_PASS)) {
            return new Item[]{new BackstagePass(type, sellIn, quality)};
        } else {
            return new Item[]{new Item(type, sellIn, quality)};
        }
    }

    @Test
    public void basicElementShouldDecreaseSellinAndQuality() {
        Item[] items = buildSingleItemTable("Basic", 5, 5);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].sellIn).isEqualTo(4);
        assertThat(shop.items[0].quality).isEqualTo(4);
    }

    @Test
    public void qualityAlwaysPositive() {
        Item[] items = buildSingleItemTable("Basic", 5, 0);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].sellIn).isEqualTo(4);
        assertThat(shop.items[0].quality).isEqualTo(0);
    }

    @Test
    public void afterSellDateQualityDegradesTwiceAsFast() {
        Item[] items = buildSingleItemTable("Basic", 0, 5);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(3);
    }


    @Test
    public void cheeseQualityIncreasesAndSellInDateIsDecreased() {
        Item[] items = buildSingleItemTable(Item.CHEESE, 5, 3);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(4);
        assertThat(shop.items[0].sellIn).isEqualTo(4);
    }

    @Test
    public void qualityNeverMoreThan50() {
        Item[] items = buildSingleItemTable(Item.CHEESE, 5, 50);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(50);
    }

    @Test
    public void sulfurasQualityNeverDecreases() {
        Item[] items = buildSingleItemTable(Item.SULFURAS, 3, 3);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(3);
        assertThat(shop.items[0].sellIn).isEqualTo(3);
    }

    @Test
    public void backStagePassesQualityIncreasesBy1() {
        Item[] items = buildSingleItemTable(Item.BACKSTAGE_PASS, 12, 3);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(4);
    }

    @Test
    public void backStagePassesQualityIncreasesBy3() {
        Item[] items = buildSingleItemTable(Item.BACKSTAGE_PASS, 5, 3);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(6);
    }

    @Test
    public void backStagePassesQualityDropsAfterConcert() {
        Item[] items = buildSingleItemTable(Item.BACKSTAGE_PASS, 0, 3);
        Shop shop = new Shop(items);
        shop.updateQuality();
        assertThat(shop.items[0].quality).isEqualTo(0);
    }


}

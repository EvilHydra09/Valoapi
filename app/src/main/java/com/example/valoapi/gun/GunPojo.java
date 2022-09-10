package com.example.valoapi.gun;

import java.util.List;

public class GunPojo {

    private List<Data> data;

    public List<Data> getData() {

        return data;

    }

    public void setData(List<Data> data) {

        this.data = data;

    }

}


 class ShopData {

    private Integer cost;
    private String category;

    public Integer getCost() {

        return cost;

    }

    public void setCost(Integer cost) {

        this.cost = cost;

    }

    public String getCategory() {

        return category;

    }

    public void setCategory(String category) {

        this.category = category;

    }

}

 class WeaponStats {

    private Double fireRate;
    private Double reloadTimeSeconds;
    private Integer magazineSize;
    private Double firstBulletAccuracy;

    public Double getFireRate() {

        return fireRate;

    }

    public void setFireRate(Double fireRate) {

        this.fireRate = fireRate;

    }

    public Double getReloadTimeSeconds() {

        return reloadTimeSeconds;

    }

    public void setReloadTimeSeconds(Double reloadTimeSeconds) {

        this.reloadTimeSeconds = reloadTimeSeconds;

    }

    public int getMagazineSize() {

        return magazineSize;

    }

    public void setMagazineSize(int magazineSize) {

        this.magazineSize = magazineSize;

    }

    public Double getFirstBulletAccuracy() {

        return firstBulletAccuracy;

    }

    public void setFirstBulletAccuracy(Double firstBulletAccuracy) {

        this.firstBulletAccuracy = firstBulletAccuracy;

    }

}


 class Data {

    private String displayIcon;
    private ShopData shopData;
    private String displayName;
    private WeaponStats weaponStats;

    public String getDisplayIcon() {

        return displayIcon;

    }

    public void setDisplayIcon(String displayIcon) {

        this.displayIcon = displayIcon;

    }

    public ShopData getShopData() {

        return shopData;

    }

    public void setShopData(ShopData shopData) {

        this.shopData = shopData;

    }

    public String getDisplayName() {

        return displayName;

    }

    public void setDisplayName(String displayName) {

        this.displayName = displayName;

    }

    public WeaponStats getWeaponStats() {

        return weaponStats;

    }

    public void setWeaponStats(WeaponStats weaponStats) {

        this.weaponStats = weaponStats;

    }

}



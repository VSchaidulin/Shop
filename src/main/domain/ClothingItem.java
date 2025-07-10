package main.domain;

import java.util.Objects;
import java.util.UUID;

public class ClothingItem {
    private final String id;    // Уникальный идентификатор товара, final - потому что id не меняется после создания
    private String name;    // Название товара
    private String size;    // Размер (например, "S", "M", "L", "XL")
    private String color;   // Цвет
    private String category;
    private double price;

    public ClothingItem(String name, String size, String color, String category, double price) {
        this.id = UUID.randomUUID().toString(); // Генерируем уникальный ID при создании товара
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
        this.price = price;
    }

    // Геттеры

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    /***
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        // Если это один и тот же объект в памяти - то они равны
        if (this == obj) return true;
        // Если объект null или не является экземпляром ClothingItem, они не равны
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приводим переданный объект к типу ClothingItem
        ClothingItem tempClothingItem = (ClothingItem) obj;
        // Объекты равны, если их ID равны
        return Objects.equals(id, tempClothingItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);    // Генерируем хеш-код на основе ID
    }
}
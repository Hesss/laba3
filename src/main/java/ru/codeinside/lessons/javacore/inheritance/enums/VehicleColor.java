package ru.codeinside.lessons.javacore.inheritance.enums;

/**
 * Перечисление описывает возможные цвета автомобилей.
 */
public enum VehicleColor {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black"),
    UNDEFINED("undefined");

    private String color;

    VehicleColor(String color) {
        this.color = color;
    }

    /**
     * Метод возвращает объект {@link VehicleColor} на основе переданного названия цвета.
     *
     * @param color {@link String} название цвета
     * @return {@link VehicleColor}
     */
    public static VehicleColor getColorByName(String color) {

        return null;
    }
}

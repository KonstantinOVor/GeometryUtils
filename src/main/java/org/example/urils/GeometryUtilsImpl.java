package org.example.urils;

import lombok.extern.slf4j.Slf4j;
import org.example.model.GeometryLibrary;

import java.util.Objects;
@Slf4j
public class GeometryUtilsImpl {
    public static double convertUnits(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        // Пример логики для конвертации единиц измерения
        if (fromUnit.equals("cm") && toUnit.equals("m")) {
            log.info("Конвертация сантиметров в метры");
            result = value / 100;
        } else if (fromUnit.equals("m") && toUnit.equals("cm")) {
            log.info("Конвертация метров в сантиметры");
            result = value * 100;
        }
        return result;
    }

    public static boolean compareShapes(GeometryLibrary shape1, GeometryLibrary shape2) {
        // Логика для сравнения двух фигур
        if (Objects.equals(shape1.getArea(), shape2.getArea())
                && Objects.equals(shape1.getPerimeter(), shape2.getPerimeter())) {
            log.info("Фигуры равны по площади и периметру");
            return true;
        } else {
            log.info("Фигуры не равны");
            return false;
        }
    }

    public static String interactShapes(GeometryLibrary shape1, GeometryLibrary shape2) {
        // Логика для сравнения площадей двух фигур
        if (shape1.getArea() > shape2.getArea()) {

            return String.format("%s занимает большую площадь", shape1.name());
        } else if (shape1.getArea() < shape2.getArea()) {
            return String.format("%s занимает большую площадь", shape2.name());
        } else {
            return "Площади фигур равны";
        }
    }
}

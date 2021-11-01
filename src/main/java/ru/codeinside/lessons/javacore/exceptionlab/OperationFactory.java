package ru.codeinside.lessons.javacore.exceptionlab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class OperationFactory {

    private static final double MAX_VALUE = 1.7976931348623157E308;
    private final Logger log = LogManager.getLogger(OperationFactory.class);

    public static void main(String[] args) {
        var operationFactory = new OperationFactory();
        operationFactory.parseAndDivide();
        operationFactory.checkLength();
    }

    private void parseAndDivide() {
        log.info("метод parseAndDivide() успешно стартовал.");
        List<String> source = List.of("2", "5", "0", "10", "10000000000", "-100", "qwerty");
        for (String element : source) {
                try {
                    int value = Integer.parseInt(element);
                    if(value == 0){
                        throw new MyMathExeption("Ошибка, деление на 0!!!");
                    }
                    double result = 1000 / value;
                    System.out.println(result);
                } catch (MyMathExeption|NumberFormatException e) {
                    log.info("Ошибка! нельзя делить на 0 или строку");
                    e.getMessage();
                }
            }

        }

    private void checkLength() {
        List<String> source = Arrays.asList("car", "table", "", "01", "alphabet", null, "zero");
        for (String element : source) {
            try {
                int length = element.length();
                System.out.println(length);
            } catch (NullPointerException e) {
                log.info("Ошибка! строка равна 0");
                e.getMessage();
            }
        }
    }
}

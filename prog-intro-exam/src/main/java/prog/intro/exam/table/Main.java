package prog.intro.exam.table;

import prog.intro.exam.table.expression.Expression;
import prog.intro.exam.table.expression.ExpressionParser;

import java.util.Arrays;
import java.util.List;

// :NOTE: * Обработка некорректных входов
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected a single command line argument, actual: " + Arrays.toString(args));
        }

        String table = args[0];
//        System.out.println(table);

        ExpressionParser parser = new ExpressionParser();
        List<Expression> cells = parser.parse(table);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cells.size(); i++) {
            if (i != 0) {
                result.append('|');
            }
            result.append(cells.get(i).evaluate(cells));
        }

        System.out.println(result);
    }
}

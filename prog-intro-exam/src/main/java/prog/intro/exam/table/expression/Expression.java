package prog.intro.exam.table.expression;

import java.util.List;

public interface Expression {
    int evaluate(List<Expression> cells);
}

package pl.genealodzy.model;

import java.util.Arrays;

public class ParseResultFactory {

    public static ParseResult readError(String message) {
        return new ErrorResult(Arrays.asList(parseError(message)));
    }

    static ParseError parseError(String message) {
        return new ParseError(message);
    }
}

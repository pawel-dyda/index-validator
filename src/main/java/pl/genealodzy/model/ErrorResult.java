package pl.genealodzy.model;

import static java.util.Objects.requireNonNull;

import java.util.List;


public class ErrorResult implements ParseResult {

    private List<ParseError> errors;

    ErrorResult(List<ParseError> errors) {
        this.errors = requireNonEmpty(requireNonNull(errors));
    }

    private List<ParseError> requireNonEmpty(List<ParseError> parseErrors) {
        if (parseErrors.isEmpty())
            throw new IllegalStateException("Cowardly refusing to create ErrorResult for an empty errors list.");

        return parseErrors;
    }

    @Override
    public boolean hasErrors() {
        return true;
    }

    @Override
    public List<ParseError> errors() {
        return errors;
    }

}

package pl.genealodzy.model;

import static java.util.Objects.requireNonNull;

public class ParseError {

    private final String message;

    public ParseError(String message) {
        this.message = requireNonNull(message);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ParseError))
            return false;
        ParseError other = (ParseError) obj;

        return message.equals(other.message);
    }

    @Override
    public String toString() {
        return message;
    }

}

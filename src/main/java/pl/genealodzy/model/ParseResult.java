package pl.genealodzy.model;

import java.util.List;

public interface ParseResult {

    boolean hasErrors();

    List<ParseError> errors();

}

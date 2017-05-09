package pl.genealodzy.parsing;

import java.io.File;

import pl.genealodzy.model.ParseResult;

public interface Parser {

    ParseResult parse(File file);

}

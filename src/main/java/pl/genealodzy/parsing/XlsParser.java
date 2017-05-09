package pl.genealodzy.parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;

import pl.genealodzy.model.ParseResult;


public class XlsParser implements Parser {

    @Override
    public ParseResult parse(File file) {
        Objects.requireNonNull(file, "File may not be null.");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        } catch (OfficeXmlFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}

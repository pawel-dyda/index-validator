package pl.genealodzy.parsing;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import pl.genealodzy.model.ParseResult;

public class XlsParserTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowExceptionOnNullFile() {
        // preconditions
        exception.expect(NullPointerException.class);
        exception.expectMessage("File may not be null.");

        // given
        Parser parser = new XlsParser();
        
        // when
        parser.parse(null);

        // then exception should be thrown
    }

    @Test
    public void shouldRejectXlsxFile() {
        // given
        Parser parser = new XlsParser();
        File xlsxFile = new File("src/test/resources/empty.xlsx");

        // when
        ParseResult result = parser.parse(xlsxFile);

        // then
        assertThat(result).isNotNull();
    }

}

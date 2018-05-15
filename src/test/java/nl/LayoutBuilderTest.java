package nl;

import org.junit.Test;

import static net.javacrumbs.jsonunit.JsonAssert.*;
import static net.javacrumbs.jsonunit.core.Option.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LayoutBuilderTest {

    @Test
    public void testLayout() {
        assertJsonEquals("{\"test\":1}", "{\n\"test\": 1\n}");
        System.out.println(Charset.defaultCharset());
    }

    @Test
    public void testLayoutShowcase() throws IOException {

        String expected = new String(Files.readAllBytes(Paths.get("/Users/ddijk/Development/workspace/sas/inkijk/webapp/src/test/resources/json/bkwi-showcase.layout.json")));
        String actual = new String(Files.readAllBytes(Paths.get("/Users/ddijk/Development/workspace/sas/inkijk/webapp/src/test/resources/json/bkwi-showcase_from_browser.layout.json")));

        assertJsonEquals(expected, actual);
    }

    @Test
    public void testLayoutSbrShowcase() throws IOException {

        String expected = new String(Files.readAllBytes(Paths.get("/Users/ddijk/Development/workspace/sas/inkijk/webapp/src/test/resources/json/bkwi-sbr-showcase.layout.json")));
        String actual = new String(Files.readAllBytes(Paths.get("/Users/ddijk/Development/workspace/sas/inkijk/webapp/src/test/resources/json/bkwi-sbr-showcase_from_browser.layout.json")));

        assertJsonEquals(expected, actual);
    }
}

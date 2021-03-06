/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testEmpty() throws IOException {
        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js");
        assertEquals(0, App.linterMessage(path.toString()));
    }
    @Test
    public void testNoError() throws IOException {
        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\test\\resources\\no-errors.js");
        assertEquals(0, App.linterMessage(path.toString()));
    }
    @Test
    public void testOneError() throws IOException {
        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\test\\resources\\one-error.js");
        assertEquals(1, App.linterMessage(path.toString()));
    }
    @Test
    public void testThreeErrors() throws IOException {
        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\test\\resources\\three-errors.js");
        assertEquals(3, App.linterMessage(path.toString()));
    }
    @Test
    public void testManyError() throws IOException {
        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\test\\resources\\many-errors.js");
        assertEquals(4, App.linterMessage(path.toString()));
    }
}


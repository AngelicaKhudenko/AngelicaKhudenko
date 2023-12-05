package home_work_6.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class WorkOnBookTest {
    @TempDir
    File tempDir; // Временная директория файла

    @Test
    public void readABook () throws IOException{
        File tempFile=new File(tempDir, "test.txt"); // Временный файл

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Осень – грустная пора. Но как красив осенью лес! Среди золотых берез пылают багровые листья кленов и рябин.");
        }

        WorkOnBook worker=new WorkOnBook();
        String result=worker.readABook(tempFile);
        Assertions.assertEquals("Осень – грустная пора. Но как красив осенью лес! Среди золотых берез пылают багровые листья кленов и рябин.",result);
    }

    @Test
    public void splitInWords () throws IOException{
        File tempFile=new File(tempDir, "test.txt"); // Временный файл

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Осень – грустная пора. Но как красив осенью лес! Среди золотых берез пылают багровые листья кленов и рябин.");
        }
        WorkOnBook worker=new WorkOnBook();
        String result=worker.readABook(tempFile);
        String [] wordsArray=worker.splitInWords(result);
        String [] stringForCompare=new String[]{"Осень", "грустная", "пора", "Но", "как", "красив", "осенью", "лес", "Среди", "золотых", "берез", "пылают", "багровые", "листья", "кленов", "и", "рябин"};
        Assertions.assertArrayEquals(stringForCompare,wordsArray);
    }

    @Test
    public void makeSetCollection () {
        WorkOnBook worker=new WorkOnBook();
        String[] words = {"Осень", "грустная", "пора"};
        HashSet<String> result = worker.makeSetCollection(words);

        Assertions.assertEquals(3, result.size());
        Assertions.assertTrue(result.contains("Осень"));
        Assertions.assertTrue(result.contains("грустная"));
        Assertions.assertTrue(result.contains("пора"));
    }

    @Test
    public void findTopWords() {
        WorkOnBook worker=new WorkOnBook();
        String [] words=new String[]{"Осень", "грустная", "пора", "Но", "как", "красив", "осенью", "лес", "Среди", "золотых", "берез", "пылают", "багровые", "листья", "кленов", "и", "рябин", "листья", "листья", "листья", "осень","осень","осень","осень","осень","осень","осень","осень","пора"};
        LinkedHashMap<String, Integer> mapResult=worker.findTopWords(words,3);

        Assertions.assertNotNull(mapResult);
        Assertions.assertEquals(4, mapResult.get("листья"));
        Assertions.assertEquals(8, mapResult.get("осень"));
        Assertions.assertEquals(2, mapResult.get("пора"));
    }

    @Test
    public void checkExtension1 () {
        WorkOnBook worker=new WorkOnBook();
        File tempFile=new File(tempDir,"example.txt");
        boolean result=worker.checkExtension(tempFile);
        Assertions.assertTrue(result);
    }

    @Test
    public void checkExtension2 () {
        WorkOnBook worker=new WorkOnBook();
        File tempFile=new File(tempDir,"example.pdf");
        boolean result=worker.checkExtension(tempFile);
        Assertions.assertFalse(result);
    }

    @Test
    public void checkExtension3 () {
        WorkOnBook worker=new WorkOnBook();
        File tempFile=new File(tempDir,"example");
        boolean result=worker.checkExtension(tempFile);
        Assertions.assertFalse(result);
    }
}

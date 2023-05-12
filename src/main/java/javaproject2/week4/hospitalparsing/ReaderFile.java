package javaproject2.week4.hospitalparsing;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReaderFile implements GetLines {
    public List<String> BufferedReaderFile(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("UTF-8")));

        String line;
        while ((line = br.readLine()) != null) lines.add(line);
        br.close();
        return lines;
    }

    public List<String> InputStreamReaderFile(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));

        String line;
        while ((line = br.readLine()) != null) lines.add(line);
        br.close();
        return lines;
    }

    public List<String> BufferedReader2File(String fileName) {
        List<String> lines = new LinkedList<>();

        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}

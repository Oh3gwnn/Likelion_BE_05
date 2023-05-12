package javaproject2.week4.hospitalparsing;

import java.io.*;
import java.util.List;

public interface GetLines {
    List<String> BufferedReaderFile(String fileName) throws IOException;
    List<String> InputStreamReaderFile(String fileName) throws IOException;
    List<String> BufferedReader2File(String fileName) throws IOException;
}

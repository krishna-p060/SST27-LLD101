package com.example.imports;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NaiveCsvReader {
    public List<String[]> read(Path p) {
        try {
            List<String[]> rows = new ArrayList<>();
            for (String line : Files.readAllLines(p)) {
                rows.add(line.split(","));
            }
            return rows;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

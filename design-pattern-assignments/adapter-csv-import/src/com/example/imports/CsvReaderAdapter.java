package com.example.imports;
import java.nio.file.Path;
import java.util.List;

public class CsvReaderAdapter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;
    

    public CsvReaderAdapter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path path) {
        List<String[]> rows = csvReader.read(path);
        int importedCount = 0;
        for (String[] row : rows) {
            if(row[0].equals("id")){
                continue;
            } 
            if (row.length < 3 || row.length > 3) {
                System.err.println("Skipping invalid row: " + String.join(",", row));
                continue;
            }
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();
            profileService.createProfile(id, email, displayName);
            importedCount++;
        }
        return importedCount;
    }
}

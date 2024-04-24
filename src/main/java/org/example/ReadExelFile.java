package org.example;
import org.apache.poi.ss.usermodel.*;


import java.io.*;

public class ReadExelFile {
        public static void main(String[] args) {
            String excelFilePath = "src/main/java/org/example/source/EmployeeSampleData.xlsx";

            try (FileInputStream fis = new FileInputStream(new File(excelFilePath))) {
                Workbook workbook = WorkbookFactory.create(fis);
                Sheet sheet = workbook.getSheetAt(0);

                if (sheet != null) {
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.err.println("Error: Excel sheet not found!");
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error: File not found - " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error: IO exception - " + e.getMessage());
            }
        }
    }
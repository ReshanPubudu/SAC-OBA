/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.MemberDTO;
import enums.MembersAttr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberController {

    private static List<MemberDTO> memberDTOs;

    public MemberController() {
        memberDTOs = getAllMembers();
    }

    public List<MemberDTO> searchMembers(MembersAttr where, String what) {
        List<MemberDTO> searchResult = new ArrayList<>();
        switch (where) {
            case REGNO:
                for (MemberDTO memberse : memberDTOs) {
                    if (memberse.getRegNo().toLowerCase().contains(what.toLowerCase())) {
                        searchResult.add(memberse);
                    }
                }
                break;
            case NAME:
                for (MemberDTO memberse : memberDTOs) {
                    if (memberse.getName().toLowerCase().contains(what.toLowerCase())) {
                        searchResult.add(memberse);
                    }
                }
                break;
            case INITIALS:
                break;
            case NO:
                break;
            case AREA:
                break;
            case CITY:
                break;
            case ADDRESS:
                for (MemberDTO memberse : memberDTOs) {
                    if (memberse.getNo().toLowerCase().contains(what.toLowerCase()) || memberse.getArea().toLowerCase().contains(what.toLowerCase()) || memberse.getCity().toLowerCase().contains(what.toLowerCase())) {
                        searchResult.add(memberse);
                    }
                }
                break;
            case ANY:
                for (MemberDTO memberse : memberDTOs) {
                    if (memberse.getRegNo().toLowerCase().contains(what.toLowerCase()) || memberse.getName().toLowerCase().contains(what.toLowerCase()) || memberse.getInitials().toLowerCase().contains(what.toLowerCase()) || memberse.getNo().toLowerCase().contains(what.toLowerCase()) || memberse.getArea().toLowerCase().contains(what.toLowerCase()) || memberse.getCity().toLowerCase().contains(what.toLowerCase())) {
                        searchResult.add(memberse);
                    }
                }
                break;
            case ALL:
                searchResult = memberDTOs;
                break;
        }
        return searchResult;
    }

    public final List<MemberDTO> getAllMembers() {
        List<MemberDTO> memberses = new ArrayList<>();
        InputStream excelFileToRead = null;

        try {
            Properties dbProperties = new Properties();
            dbProperties.load(new FileReader(new File("settings/external_data.properties")));

            excelFileToRead = new FileInputStream(dbProperties.getProperty("xlsx_path"));
            XSSFWorkbook wb = new XSSFWorkbook(excelFileToRead);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            int i = 0;
            while (rows.hasNext()) {
                i++;
                XSSFRow row = (XSSFRow) rows.next();

                String regNo = ("" + row.getCell(0)).trim();
                String name = ("" + row.getCell(1)).trim();
                String no = ("" + row.getCell(2)).trim();
                String area = ("" + row.getCell(3)).trim();
                String city = ("" + row.getCell(4)).trim();

                String stringOnly = regNo.replaceAll("[^A-Za-z]", "");
                String numberOnly = regNo.replaceAll("[^0-9]", "");

                if (stringOnly.equals("")) {
                    numberOnly = numberOnly.substring(0, numberOnly.length() - 1);
                    while (numberOnly.length() != 4) {
                        numberOnly = "0" + numberOnly;
                    }
                    regNo = numberOnly;
                }

                if (i > Integer.parseInt(dbProperties.getProperty("start_row_number"))) {
                    regNo = regNo.equals("null") ? "" : regNo;
                    name = name.equals("null") ? "" : name;
                    no = no.equals("null") ? "" : no;
                    area = area.equals("null") ? "" : area;
                    city = city.equals("null") ? "" : city;

                    if (!(regNo.equals("") && name.equals("") && no.equals("") && area.equals("") && city.equals(""))) {
                        MemberDTO members = new MemberDTO(regNo, name, "", no, area, city);
                        memberses.add(members);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MemberController.class.getName()).log(Level.SEVERE, null, ex);
            printError(ex);
        } catch (IOException | NumberFormatException ex) {
            Logger.getLogger(MemberController.class.getName()).log(Level.SEVERE, null, ex);
            printError(ex);
        }
        return memberses;
    }
    
    private void printError(Exception e) {
        try {
            print(e.toString());
        } catch (IOException ex) {
            Logger.getLogger(MemberController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void print(String ex) throws IOException {
        File f1 = new File("error.log");
        if (!f1.exists()) {
            f1.createNewFile();
        }

        PrintWriter pw = new PrintWriter(new FileWriter("error.log", true), true);
        pw.println(ex);
        pw.flush();
    }

}

//package org.example.datatest;
//
//import org.example.utils.ExcelFileReader;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.util.Hashtable;
//
//public final class DataProviderManager {
//    private static String excelFilePath="src/test/resources/DataTest_11.xlsx";
//
//    private DataProviderManager() {
//    }
//
//    @Test(dataProvider = "getSignInDataHashTable")
//    public void testGetSignInData(Hashtable<String, String> data) {
//        System.out.println("Add new Customer.username = " + data.get(Customer.getName()));
//        System.out.println("Add new Customer.birthdate =" + data.get(Customer.getBirthdate()));
//        System.out.println("Add new Customer.address = " + data.get(Customer.getAddress()));
//        System.out.println("Add new Customer.city = " + data.get(Customer.getCity()));
//        System.out.println("Add new Customer.state = " + data.get(Customer.getState()));
//        System.out.println("Add new Customer.pin =" + data.get(Customer.getPin()));
//        System.out.println("Add new Customer.phone = " + data.get(Customer.getPhone()));
//        System.out.println("Add new Customer.email =" + data.get(Customer.getEmail()));
//        System.out.println("Add new Customer.password = " + data.get(Customer.getPassword()));
//
//    }
//
//
//    @DataProvider(name = "getSignInDataHashTable")
//    public static Object[][] getSignInData() {
//        ExcelFileReader excelHelpers = new ExcelFileReader();
//        Object[][] data = excelHelpers.getDataHashTable(getCurrentDir() + excelFilePath, "data", 1, 2);
//        System.out.println("getSignInData: " + data);
//        return data;
//    }
//
//    @DataProvider(name = "getSignInDataHashTable2")
//    public static Object[][] getSignInData2() {
//        ExcelFileReader excelHelpers = new ExcelFileReader();
//        Object[][] data = excelHelpers.getDataHashTable(getCurrentDir() + excelFilePath, "data", 2, 3);
//        System.out.println("getSignInData: " + data);
//        return data;
//    }
//
//    @DataProvider(name = "getClientDataHashTable", parallel = true)
//    public static Object[][] getClientData() {
//        ExcelFileReader excelHelpers = new ExcelFileReader();
//        Object[][] data = excelHelpers.getDataHashTable(getCurrentDir() + excelFilePath, "data", 1, 3);
//        System.out.println("getClientData: " + data);
//        return data;
//    }
//
//    public static String getCurrentDir() {
//        String current = System.getProperty("user.dir") + File.separator;
//        return current;
//    }
//}

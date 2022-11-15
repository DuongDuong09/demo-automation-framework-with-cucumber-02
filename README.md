# demo-automation-framework-with-cucumber-02
SOME FEATURES IN FRAMEWORK

Run the parallel test case

Read config from properties file

Allure report + Extent report

Event listener

Record video and Screenshot

Read data test from Excel file (not done yet)

Base function in package : utils, helpers

Read data from JSON

Run Selenium Grid 4

########## HOW TO RUN ###########

run file testing.xml

ALLURE REPORT: Open Terminal: allure serve allure-results

########## SELENIUM GRID 4##########

(vào BaseTest command dòng basePage.initDriver(browser); và bỏ command dòng   basePage.initBrowserForSeleniumGrid(browser);)

---------------------- Run default -------------------

✅ Mở 1 hub với 1 node mặc định (port 4444)

java -jar selenium-server-4.6.0.jar standalone

-------------------- Run multi Node ----------------

✅ Mở 1 hub với 3 node: (chạy 4 lệnh mở 4 CMD nhé)

java -jar selenium-server-4.6.0.jar hub

java -jar selenium-server-4.6.0.jar node --port 5556

java -jar selenium-server-4.6.0.jar node --port 6667

java -jar selenium-server-4.6.0.jar node --port 7778

NOTE: Thực thi nhiều lệnh thì mở nhiều CMD

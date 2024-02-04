'Automate the browser with selenium'
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(service=Service(
    r'/usr/local/bin/chromedriver'))
driver.get('https://www.kompas.com/')
driver.maximize_window()
time.sleep(5)

men_btn = driver.find_element(By.ID, "sso__icon__login_top")
men_btn.click()
time.sleep(1)
login_btn = driver.find_element(By.ID, "txt_signin")
login_btn.click()
time.sleep(2)

username_field = driver.find_element(By.ID, "email").send_keys("sarah_sasa17@yahoo.com")
time.sleep(2)
password_field = driver.find_element(By.ID, "password")
file = open("password.txt", 'r')
password = file.read()
paths = password.split("\n") 
password_field.send_keys(password)
time.sleep(2)
login_btn = driver.find_element(By.XPATH, "//input[@value='Login']").click()
print('Login User is Success!')
time.sleep(10)

search_box = driver.find_element(By.ID, "search").send_keys("pemilu 2024", (Keys.ENTER))
print('Search Berita is Success!')
time.sleep(5)
news = driver.find_element(By.XPATH, "//a[@href='https://biz.kompas.com/read/2023/11/27/161105928/dimulai-besok-berikut-jadwal-rangkaian-kampanye-pemilu-2024']")
ActionChains(driver)\
        .scroll_to_element(news)\
        .perform()
time.sleep(5)
news.click()
time.sleep(5)
scroll_down = driver.find_element(By.XPATH, "//a[@href='https://www.kompas.com/tag/kpu?url=https://biz.kompas.com/read/2023/11/27/161105928/dimulai-besok-berikut-jadwal-rangkaian-kampanye-pemilu-2024']")
ActionChains(driver)\
        .scroll_to_element(scroll_down)\
        .perform()
print('Klik berita yang tampil kedua is Success!')
time.sleep(10)
print('Automation Completed!!')
driver.quit()
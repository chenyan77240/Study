package com.candy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by candy on 2017/6/13.
 */
public class Login {
    /**
     *
     * @param webDriver
     * @param account
     * @param password
     */
    public void Login(WebDriver webDriver,String account,String password){
        wait(1000);
        webDriver.findElement(By.linkText("登录")).click();
        webDriver.findElement(By.id("phone")).sendKeys(account);
        webDriver.findElement(By.id("password")).sendKeys(password);
        webDriver.findElement(By.id("J_Login")).click();
    }

    /**
     *
     * @param webDriver
     */
    public void Logout(WebDriver webDriver){
        wait(1000);
        webDriver.findElement(By.linkText("退出")).click();
    }


    public void wait(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

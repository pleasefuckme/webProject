//package com.baidu.controller;
//
//import com.Util.Utils;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Description:
// * @Author SuperStar
// * @Create 2019-09-01-15:36
// */
//@WebServlet("/testServlet")
//public class testServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response = Utils.downLoad(response, "D:\\IDEAProject\\maven_web\\aaa.xls");
//    }
//}

package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.servie.ioService;

@Controller
@RequestMapping("/user")
public class ioController {
   @Autowired
   private ioService ioservice;
   
   @RequestMapping("/getAllUser")
   public String getAllUser(HttpServletRequest request){
	   List<User> lUsers = ioservice.getAllUser();
	   request.setAttribute("listUser", lUsers);
	   return  "/allUser";
   }
}

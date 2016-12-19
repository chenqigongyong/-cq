package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inter.ioMapper;
import com.model.User;
import com.servie.ioService;

@Service
@Transactional
public class ioServiceimpl implements ioService{
   @Resource
   public ioMapper iomapper;
   public List<User> getAllUser(){
	   List<User> getAllUser = iomapper.getAllUser();
	   return getAllUser;
   }
}

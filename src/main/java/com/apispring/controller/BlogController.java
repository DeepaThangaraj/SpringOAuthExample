package com.apispring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apispring.model.Posts;

import java.security.Principal;

@RestController
@RequestMapping
@EnableOAuth2Sso
public class BlogController {
	
	@GetMapping("/user")
    public Principal userdetails(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }

	@GetMapping(value="/userinfo")
	private  ModelAndView getUser() {
		String url="https://gorest.co.in/public/v2/users";
		RestTemplate rt=new RestTemplate();
		Object[] userlist=rt.getForObject(url,Object[].class);
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("index");        
		modelAndView.addObject("userlist", Arrays.asList(userlist));      
		return modelAndView;    
		
	}
	@GetMapping(value="/postinfo")
	private  ModelAndView getPostDetails() {
		String url="https://gorest.co.in/public/v2/posts";
		RestTemplate rt=new RestTemplate();
		Object[] postdetails=rt.getForObject(url,Object[].class);
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("posts");        
		modelAndView.addObject("postdetails", Arrays.asList(postdetails));      
		return modelAndView; 
	}
	@GetMapping(value="/commentsinfo")
	private ModelAndView getCommentsDetails() {
		String url="https://gorest.co.in/public/v2/comments";
		RestTemplate rt=new RestTemplate();
		Object[] commentsdetails=rt.getForObject(url,Object[].class);
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("comments");        
		modelAndView.addObject("commentsdetails", Arrays.asList(commentsdetails));      
		return modelAndView; 
	}
	
	
}

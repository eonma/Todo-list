/**
 * 
 * @author chenma
 * 9 Jul 2018
 */
package com.cm.todolist.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cm.todolist.model.Task;
import com.cm.todolist.service.Constants;
import com.cm.todolist.service.TaskService;
import com.cm.todolist.service.TaskServiceImpl;

/**
 * @author chenma
 *
 */
@Controller
public class TaskController {
	
	private final Logger logger = LoggerFactory.getLogger(TaskController.class);

	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showEditTask(Model model){
		logger.debug("saveTask()");
	
		model.addAttribute("task", new Task());

		return Constants.SHOW_ALL_LIST;
		
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editTask(@ModelAttribute("task") Task task, BindingResult result, Model model, HttpServletRequest request){
		logger.debug("editTask()");
	
		TaskService taskService = new TaskServiceImpl();
		taskService.edit(task);
		
		return "redirect:all";
		
	}
	

	
	@RequestMapping(value = "/complete", method = RequestMethod.GET)
	public String showComplete(Model model){
		logger.debug("showComplete()");
	
		model.addAttribute("task", new Task());

		return Constants.SHOW_ALL_LIST;
		
	}

	@RequestMapping(value = "/complete", method = RequestMethod.POST)
	public String completeTask(@ModelAttribute("task") Task task, BindingResult result, Model model){
		logger.debug("completeTask()");
	
		System.out.println(task.toString());
		TaskService taskService = new TaskServiceImpl();
		
		taskService.complete(task.getId());

		return "redirect:all";
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String showSaveTask(Model model){
		logger.debug("showSaveTask()");
	
		model.addAttribute("task", new Task());

		return Constants.SHOW_ALL_LIST;
		
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTask(@ModelAttribute("task") Task task, BindingResult result, Model model){
		logger.debug("saveTask()");
	
		System.out.println(task.toString());
		TaskService taskService = new TaskServiceImpl();
		
		taskService.save(task);

		return "redirect:all";
		
	}
}

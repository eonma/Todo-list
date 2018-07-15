/**
 * 
 * @author chenma
 * 8 Jul 2018
 */
package com.cm.todolist.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ToDoListController {
	private final Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String showAll(Model model){
		
		logger.debug("showAllLists()");
		
		TaskService taskService = new TaskServiceImpl();
		List<Task> tasks = taskService.getAll();
		model.addAttribute("tasks", tasks);
		model.addAttribute("task", new Task());
		
		return Constants.SHOW_ALL_LIST;
	}
	
	@RequestMapping(value = "/today", method = RequestMethod.GET)
	public String showToday(Model model){
		
		logger.debug("showToday()");

		TaskService taskService = new TaskServiceImpl();
		List<Task> tasks = taskService.getToday();
		model.addAttribute("tasks", tasks);
		model.addAttribute("task", new Task());
		
		return Constants.SHOW_TODAY;
	}
	
	@RequestMapping(value = "/week", method = RequestMethod.GET)
	public String showWeek(Model model){
		
		logger.debug("showWeek()");

		TaskService taskService = new TaskServiceImpl();
		List<Task> tasks = taskService.getWeek();
		model.addAttribute("tasks", tasks);
		model.addAttribute("task", new Task());
		
		return Constants.SHOW_TODAY;
	}
	
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String showCompleted(Model model){
		
		logger.debug("showWeek()");

		TaskService taskService = new TaskServiceImpl();
		List<Task> tasks = taskService.getCompleted();
		model.addAttribute("tasks", tasks);
		model.addAttribute("task", new Task());
		
		return Constants.SHOW_COMPLETED;
	}

}

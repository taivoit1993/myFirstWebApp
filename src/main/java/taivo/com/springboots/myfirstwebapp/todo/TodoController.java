package taivo.com.springboots.myfirstwebapp.todo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	private ToDoService toDoService;
	private Logger logger = LoggerFactory.getLogger(getClass());
	public TodoController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}
	
	@RequestMapping("list-todos")
	public String listTodo(ModelMap model) {
		List<ToDo> todos = toDoService.findByUsername("taivo28minutes");
		model.addAttribute("todos", todos);
		
		logger.info("dasd");
		return "listTodo";
	}
}

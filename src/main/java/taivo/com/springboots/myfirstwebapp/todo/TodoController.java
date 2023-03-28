package taivo.com.springboots.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "listTodo";
	}

	@RequestMapping(value = "add-todos", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String) model.get("name");
		ToDo todo = new ToDo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo",todo);
		return "addTodo";
	}

	@RequestMapping(value = "add-todos", method = RequestMethod.POST)
	public String addTodoPage(ModelMap model, @Valid ToDo todo, BindingResult result) {
		if(result.hasErrors()){
			return "addTodo";
		}
		String username = (String) model.get("name");
		toDoService.addTodo(username,todo.getDescription(), LocalDate.now(),false);
		return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		toDoService.deleteById(id);
		return "redirect:list-todos";
	}
}

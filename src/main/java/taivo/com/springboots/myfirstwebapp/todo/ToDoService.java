package taivo.com.springboots.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> todos = new ArrayList<>();
	static {
		todos.add(new ToDo(1, "taivo28minutes", "Learn AWS", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(2, "taivo28minutes", "Learn Docker", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(3, "taivo28minutes", "Learn Jenskin", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(4, "taivo28minutes", "Learn SonarQB", LocalDate.now().plusYears(1),false));
	}
	
	public List<ToDo> findByUsername(String username){
		return todos;
	}
}

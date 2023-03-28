package taivo.com.springboots.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> todos = new ArrayList<>();
	private static int todosCount = 0;
	static {
		todos.add(new ToDo(++todosCount, "taivo28minutes", "Learn AWS", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount, "taivo28minutes", "Learn Docker", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount, "taivo28minutes", "Learn Jenskin", LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount, "taivo28minutes", "Learn SonarQB", LocalDate.now().plusYears(1),false));
	}
	
	public List<ToDo> findByUsername(String username){
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done){
		ToDo todo = new ToDo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}

	public void deleteById(int id){
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
}

package in.ahmed.co;

/*
 * 🔹 By Default (Without @Lazy)
Spring beans are eagerly initialized — meaning:
•	As soon as the ApplicationContext starts,
•	All singleton beans are created immediately, even if they are never used.
. constructor get executed
________________________________________
🔹 Using @Lazy
When you mark a bean with @Lazy, Spring will not create that bean at startup.
Instead, the bean is created only when it’s first needed (used) (for example,
when another bean calls it or it’s requested from the context).

 * */
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class RemunatorLoading {

	public RemunatorLoading() {
		System.out.println("Constructor  ::  executed");
	}
}
